package userInterface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.canvas.mxGraphicsCanvas2D;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.shape.mxStencil;
import com.mxgraph.shape.mxStencilRegistry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxDomUtils;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxGraphView;
import com.mxgraph.view.mxStylesheet;

import RiskMatrixModel.RiskMatrix;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.HazardInstance;
import careProcess_model.LocationDefinition;
import careProcess_model.Project;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;
import graphEditor.CustomGraph;
import graphEditor.CustomGraphComponent;
import graphEditor.CustomGraphComponent2;
import main.Main;
import utilities.DataHelper;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Hashtable;
import java.util.Iterator;

import javax.swing.JPopupMenu;
import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollPane;

/**
 * An overview in GSN of the safety argument for a given project. Draws a
 * JGraphx graph with interactive GSN-style cells to allow user navigation to
 * specific parts of the application (- editors, etc).
 */
public class PanelGSNOverview extends JPanel {

	// Static label elements. Dynamic ones are defined in methods below.
	private static final String LEGEND_LABEL = "<html><u>View Legend</u></html>";
	private static final String NO_HIT_SYSTEMS_HTML_LABEL = "<br><b>No HIT Systems Defined</b>";
	private static final String NO_CARE_SETTINGS_HTML_LABEL = "<br><b>No Care Settings Defined</b>";
	private static final String UNDEFINED_ACCEPTABLE_RISK_LABEL = "<b>'Acceptable risk' is not yet defined";
	private static final String SAFETY_CELL_LABEL = "<html><p><b>HIT Safety</b></p><p>Health IT is safe to use in the defined care settings</p></html>";
	private static final String RISK_STRATEGY_CELL_LABEL = "<html><p><b>Risk Strategy</b></p><p>Argument based on HIT clinical risks</p></html>";
	private static final String RESIDUAL_RISK_CELL_LABEL = "<html><p><b>Residual Risks</b></p><p>Residual clinical risks from all identified hazards are accepted and managed</p></html>";
	private static final String CONTROLLED_RISK_CELL_LABEL = "<html><p><b>Controlled Risk</b></p><p>Given defined controls, the clinical residual risk associated with hazard instances meets acceptance criteria</p></html>";
	private static final String CLINICAL_BENEFITS_CELL_LABEL = "<html><p><b>Clinical Benefits</b></p><p>Overriding clinical benefits outweigh the residual clinical risk and further control is not practicable</p></html>";
	private static final String RISK_MATRIX_CELL_LABEL = "<html><p><u>Clinical Risk Matrix</u></p></html>";
	private static final String HL1_CELL_LABEL = "<html><p><u>HL1</u></p><p>Hazard instances with acceptable levels of clinical risk</p></html>";
	private static final String HL2_CELL_LABEL = "<html><p><u>HL2</u></p><p>Hazard instances with unacceptable levels of clinical risk</p></html>";

	private static String ACCEPTED_RISK_CELL_LABEL;

	private static final int MAX_LABEL_CHARS = 100;

	private static final String ROUNDRECT_STYLE = "style.roundrect";
	private static final String RECT_STYLE = "style.rect";
	private static final String ELLIPSE_STYLE = "style.ellipse";
	private static final String PARALLELOGRAM_STYLE = "style.parallelogram";
	private static final String WHITE_BLACK_ARROW_STYLE = "style.white_black_arrow";
	private static final String BLACK_ARROW_STYLE = "style.black_arrow";
	private static final String WHITE_ARROW_STYLE = "style.white_arrow";
	private static final String BORDERLESS_STYLE = "style.borderless";

	private static final String STANDARD_FILL_COLOUR = "#F5F5F5";
	private static final String STANDARD_LINE_COLOUR = "#575757";
	private static final String STANDARD_FONT_COLOUR = "#111111";

	private static final int FONT_SIZE = 10;

	private static final int BUFFER = 20;
	private static final int BOX_HEIGHT = 80;
	private static final int BOX_WIDTH = 140;

	// The JGraphx components
	protected CustomGraphComponent2 graphComponent;
	private static mxGraph graph;

	// Popup menus for the cell clicks
	private static JPopupMenu systemsMenu;
	private static JPopupMenu clinicalEnvironmentMenu;
	private static JPopupMenu acceptableRiskLevelsMenu;
	private static JPopupMenu unacceptableRiskLevelsMenu;

	// The mxCells to be used in drawing the graph
	private mxCell safetyCell;
	private mxCell riskStrategyCell;
	private mxCell residualRiskCell;
	private static mxCell systemCell;
	private static mxCell careSettingCell;
	private static mxCell hazardLogCell;
	private static mxCell acceptableRiskCell;
	private mxCell controlledRiskCell;
	private mxCell clinicalBenefitsCell;
	private static mxCell riskMatrixCell;
	private static mxCell acceptableRiskLevelsCell;
	private static mxCell unacceptableRiskLevelsCell;
	private static mxCell hl1Cell;
	private static mxCell hl2Cell;

	private static mxCell legendCell;

	private static MainAppWindow mainParentWindow;
	private static PanelGSNOverview thisPanel;

	private static RiskMatrix riskMatrix;

	/**
	 * Create and initialise the panel.
	 * 
	 * @param mainParentWindowIn
	 *            The instance of MainAppWindow whose methods will be needed
	 *            when switching views
	 * @param p
	 *            The project whose data will be used to populate the diagram
	 * @param rm
	 *            The risk matrix whose data will be used to populate the
	 *            diagram
	 */
	public PanelGSNOverview(MainAppWindow mainParentWindowIn, Project p, RiskMatrix rm) {

		/*
		 * We derive the accepted risk definition from the definition given in
		 * the project. This allows different projects to have different
		 * definitions and could allow for the definition to be edited (- the
		 * AcceptableDefinitionDialog allows this). Currently however, this
		 * value is left at its default, as defined in the model.
		 */
		ACCEPTED_RISK_CELL_LABEL = "<html><p><b>Accepted Risk</b></p><p>" + p.getAcceptableHazardDefinition()
				+ "</p></html>";

		riskMatrix = rm;
		mainParentWindow = mainParentWindowIn;

		// Set up the popup menus
		systemsMenu = new JPopupMenu();
		clinicalEnvironmentMenu = new JPopupMenu();
		acceptableRiskLevelsMenu = new JPopupMenu();
		unacceptableRiskLevelsMenu = new JPopupMenu();

		thisPanel = this;

		setLayout(new BorderLayout(0, 0));

		// Make the graph component and ensure that it is uneditable
		graphComponent = new CustomGraphComponent2(new mxGraph());
		add(graphComponent, BorderLayout.CENTER);
		graphComponent.setToolTips(false);
		graphComponent.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		graphComponent.setPageBreaksVisible(false);
		graphComponent.setPanning(true);
		graph = graphComponent.getGraph();
		graphComponent.setConnectable(false);

		setMouseListener(graphComponent);

		graphComponent.addComponentListener(new resizeListener());
		graph.setHtmlLabels(true);
		graph.setConnectableEdges(false);
		graph.setCellsMovable(false);
		graph.setCellsSelectable(false);
		graph.setCellsEditable(false);
		graph.setCellsLocked(true);
		initialiseGraphStyles(graph);

		drawDiagram();
		updateLabels();

	}

	/**
	 * Note, the zoom methods disrupt the centralisation of the graph and should
	 * not be used until that is fixed
	 */
	public void zoomIn() {
		graphComponent.zoomIn();
	}

	public void zoomOut() {
		graphComponent.zoomOut();
	}

	/**
	 * Update the cell labels
	 */
	public void updateLabels() {
		populateSystemsMenuAndLabel();
		populateClinicalEnvironmentMenuAndLabel();
		setHazardCellLabel();
		populateAcceptableRiskLevelsMenuAndLabel();
		populateUnacceptableRiskLevelsMenuAndLabel();
		graph.refresh();
	}

	/**
	 * Set up the styles for the diagram's cells and load the custom shapes from
	 * the res/shapes.xml file;
	 * 
	 * @param graphIn
	 *            the mGraph whose stylesheet will be used to register the
	 *            styles.
	 */
	private void initialiseGraphStyles(mxGraph graphIn) {
		mxStylesheet stylesheet = graphIn.getStylesheet();

		// We will need to override the shape of the cell when the cell is
		// created.
		// There doesn't seem to be a way to specify use of custom shapes
		// here...
		Hashtable<String, Object> parallelogramStyle = new Hashtable<String, Object>();
		parallelogramStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		parallelogramStyle.put(mxConstants.STYLE_FONTSIZE, FONT_SIZE);
		parallelogramStyle.put(mxConstants.STYLE_FILLCOLOR, STANDARD_FILL_COLOUR);
		parallelogramStyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		parallelogramStyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		parallelogramStyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		parallelogramStyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
		parallelogramStyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
		stylesheet.putCellStyle(PARALLELOGRAM_STYLE, parallelogramStyle);

		Hashtable<String, Object> roundrectstyle = new Hashtable<String, Object>();
		roundrectstyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		roundrectstyle.put(mxConstants.STYLE_ROUNDED, true);
		roundrectstyle.put(mxConstants.STYLE_FONTSIZE, FONT_SIZE);
		roundrectstyle.put(mxConstants.STYLE_FILLCOLOR, STANDARD_FILL_COLOUR);
		roundrectstyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		roundrectstyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		roundrectstyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		roundrectstyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
		roundrectstyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
		stylesheet.putCellStyle(ROUNDRECT_STYLE, roundrectstyle);

		Hashtable<String, Object> rectstyle = new Hashtable<String, Object>();
		rectstyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		rectstyle.put(mxConstants.STYLE_ROUNDED, false);
		rectstyle.put(mxConstants.STYLE_FONTSIZE, FONT_SIZE);
		rectstyle.put(mxConstants.STYLE_FILLCOLOR, STANDARD_FILL_COLOUR);
		rectstyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		rectstyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		rectstyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		rectstyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
		rectstyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
		stylesheet.putCellStyle(RECT_STYLE, rectstyle);

		Hashtable<String, Object> ellipsestyle = new Hashtable<String, Object>();
		ellipsestyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
		ellipsestyle.put(mxConstants.STYLE_ROUNDED, false);
		ellipsestyle.put(mxConstants.STYLE_FONTSIZE, FONT_SIZE);
		ellipsestyle.put(mxConstants.STYLE_FILLCOLOR, STANDARD_FILL_COLOUR);
		ellipsestyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		ellipsestyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		ellipsestyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		ellipsestyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
		ellipsestyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
		stylesheet.putCellStyle(ELLIPSE_STYLE, ellipsestyle);

		Hashtable<String, Object> borderlessStyle = new Hashtable<String, Object>();
		borderlessStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
		borderlessStyle.put(mxConstants.STYLE_FONTSIZE, FONT_SIZE);
		borderlessStyle.put(mxConstants.STYLE_FILLCOLOR, mxConstants.NONE);
		borderlessStyle.put(mxConstants.STYLE_STROKECOLOR, mxConstants.NONE);
		borderlessStyle.put(mxConstants.STYLE_STROKEWIDTH, 0);
		borderlessStyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		borderlessStyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
		borderlessStyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
		stylesheet.putCellStyle(BORDERLESS_STYLE, borderlessStyle);

		Hashtable<String, Object> whiteBlackArrowStyle = new Hashtable<String, Object>();
		whiteBlackArrowStyle.put(mxConstants.STYLE_STARTARROW, mxConstants.ARROW_BLOCK);
		whiteBlackArrowStyle.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_BLOCK);
		whiteBlackArrowStyle.put(mxConstants.STYLE_FILLCOLOR, STANDARD_LINE_COLOUR);
		whiteBlackArrowStyle.put(mxConstants.STYLE_STARTFILL, STANDARD_LINE_COLOUR);
		whiteBlackArrowStyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		whiteBlackArrowStyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		whiteBlackArrowStyle.put(mxConstants.STYLE_STARTSIZE, 15);
		whiteBlackArrowStyle.put(mxConstants.STYLE_ENDSIZE, 8);
		stylesheet.putCellStyle(WHITE_BLACK_ARROW_STYLE, whiteBlackArrowStyle);

		Hashtable<String, Object> blackArrowStyle = new Hashtable<String, Object>();
		blackArrowStyle.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_BLOCK);
		blackArrowStyle.put(mxConstants.STYLE_FILLCOLOR, STANDARD_LINE_COLOUR);
		blackArrowStyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		blackArrowStyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		blackArrowStyle.put(mxConstants.STYLE_STARTSIZE, 15);
		blackArrowStyle.put(mxConstants.STYLE_ENDSIZE, 8);
		stylesheet.putCellStyle(BLACK_ARROW_STYLE, blackArrowStyle);

		Hashtable<String, Object> whiteArrowStyle = new Hashtable<String, Object>();
		whiteArrowStyle.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_BLOCK);
		whiteArrowStyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		whiteArrowStyle.put(mxConstants.STYLE_ENDFILL, "#ffffff");
		whiteArrowStyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		whiteArrowStyle.put(mxConstants.STYLE_STARTSIZE, 15);
		whiteArrowStyle.put(mxConstants.STYLE_ENDSIZE, 8);
		stylesheet.putCellStyle(WHITE_ARROW_STYLE, whiteArrowStyle);

		try {

			// Standard method from samples, loads the custom shape definitions
			// from the xml file
			String filename = "res/shapes.xml";
			Document doc = mxXmlUtils.parseXml(mxUtils.readFile(filename));

			Element shapes = (Element) doc.getDocumentElement();
			NodeList list = shapes.getElementsByTagName("shape");

			for (int i = 0; i < list.getLength(); i++) {
				Element shape = (Element) list.item(i);
				mxStencilRegistry.addStencil(shape.getAttribute("name"), new mxStencil(shape) {
					protected mxGraphicsCanvas2D createCanvas(final mxGraphics2DCanvas gc) {
						return new mxGraphicsCanvas2D(gc.getGraphics()) {
							protected Image loadImage(String src) {
								if (!src.startsWith("/") && !src.startsWith("http://") && !src.startsWith("https://")
										&& !src.startsWith("file:")) {
									src = gc.getImageBasePath() + src;
								}
								return gc.loadImage(src);
							}
						};
					}
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Set up and draw the cells of the GSN diagram.
	 */
	private void drawDiagram() {
		Object parent = graph.getDefaultParent();
		graph.getModel().beginUpdate();
		try {
			// Create the cells in the graph, overriding some of the styles
			// to use the custom shapes.
			safetyCell = (mxCell) graph.insertVertex(parent, null, null, 1.5 * BOX_WIDTH + 2 * BUFFER, 0, BOX_WIDTH,
					BOX_HEIGHT, RECT_STYLE);
			safetyCell.setValue(SAFETY_CELL_LABEL);

			systemCell = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH / 2 + BUFFER, 0, BOX_WIDTH,
					BOX_HEIGHT, ROUNDRECT_STYLE + ";shape=roundrect");

			careSettingCell = (mxCell) graph.insertVertex(parent, null, null, 2.5 * BOX_WIDTH + 3 * BUFFER, 0,
					BOX_WIDTH, BOX_HEIGHT, ROUNDRECT_STYLE + ";shape=roundrect");

			riskStrategyCell = (mxCell) graph.insertVertex(parent, null, null, 1.5 * BOX_WIDTH + 2 * BUFFER,
					BOX_HEIGHT + BUFFER, BOX_WIDTH, BOX_HEIGHT, PARALLELOGRAM_STYLE + ";shape=parallelogram");
			riskStrategyCell.setValue(RISK_STRATEGY_CELL_LABEL);

			hazardLogCell = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH / 2 + BUFFER, BOX_HEIGHT + BUFFER,
					BOX_WIDTH, BOX_HEIGHT, ROUNDRECT_STYLE + ";shape=roundrect");

			residualRiskCell = (mxCell) graph.insertVertex(parent, null, null, 1.5 * BOX_WIDTH + 2 * BUFFER,
					2 * BOX_HEIGHT + 2 * BUFFER, BOX_WIDTH, BOX_HEIGHT, RECT_STYLE);
			residualRiskCell.setValue(RESIDUAL_RISK_CELL_LABEL);

			acceptableRiskCell = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH / 2 + BUFFER,
					2 * BOX_HEIGHT + 2 * BUFFER, BOX_WIDTH, BOX_HEIGHT, ROUNDRECT_STYLE + ";shape=roundrect");
			acceptableRiskCell.setValue(ACCEPTED_RISK_CELL_LABEL);

			riskMatrixCell = (mxCell) graph.insertVertex(parent, null, null, 2.5 * BOX_WIDTH + 3 * BUFFER,
					2 * BOX_HEIGHT + 2 * BUFFER, BOX_WIDTH, BOX_HEIGHT, ROUNDRECT_STYLE + ";shape=roundrect");
			riskMatrixCell.setValue(RISK_MATRIX_CELL_LABEL);

			controlledRiskCell = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH + 1.5 * BUFFER,
					3 * BOX_HEIGHT + 3 * BUFFER, BOX_WIDTH, BOX_HEIGHT, RECT_STYLE);
			controlledRiskCell.setValue(CONTROLLED_RISK_CELL_LABEL);

			acceptableRiskLevelsCell = (mxCell) graph.insertVertex(parent, null, null, 0, 3 * BOX_HEIGHT + 3 * BUFFER,
					BOX_WIDTH, BOX_HEIGHT, ROUNDRECT_STYLE + ";shape=roundrect");

			clinicalBenefitsCell = (mxCell) graph.insertVertex(parent, null, null, 2 * BOX_WIDTH + 2.5 * BUFFER,
					3 * BOX_HEIGHT + 3 * BUFFER, BOX_WIDTH, BOX_HEIGHT, RECT_STYLE);
			clinicalBenefitsCell.setValue(CLINICAL_BENEFITS_CELL_LABEL);

			unacceptableRiskLevelsCell = (mxCell) graph.insertVertex(parent, null, null, 3 * BOX_WIDTH + 4 * BUFFER,
					3 * BOX_HEIGHT + 3 * BUFFER, BOX_WIDTH, BOX_HEIGHT, ROUNDRECT_STYLE + ";shape=roundrect");

			int circleSize = (BOX_HEIGHT+BOX_WIDTH)/2;
			
			hl1Cell = (mxCell) graph.insertVertex(parent, null, null, controlledRiskCell.getGeometry().getCenterX()-circleSize/2,
					4 * BOX_HEIGHT + 4 * BUFFER, circleSize,circleSize, ELLIPSE_STYLE);
			hl1Cell.setValue(HL1_CELL_LABEL);

			hl2Cell = (mxCell) graph.insertVertex(parent, null, null, clinicalBenefitsCell.getGeometry().getCenterX()-circleSize/2,
					4 * BOX_HEIGHT + 4 * BUFFER, circleSize,circleSize, ELLIPSE_STYLE);
			hl2Cell.setValue(HL2_CELL_LABEL);

			legendCell = (mxCell) graph.insertVertex(parent, null, null, 1.5 * BOX_WIDTH + 2 * BUFFER,
					5 * BOX_HEIGHT + 5 * BUFFER, BOX_WIDTH, BOX_HEIGHT, BORDERLESS_STYLE);
			legendCell.setValue(LEGEND_LABEL);

			// Insert the arrows between cells
			graph.insertEdge(parent, null, null, safetyCell, riskStrategyCell, BLACK_ARROW_STYLE);
			graph.insertEdge(parent, null, null, riskStrategyCell, residualRiskCell, BLACK_ARROW_STYLE);
			graph.insertEdge(parent, null, null, safetyCell, systemCell, WHITE_ARROW_STYLE);
			graph.insertEdge(parent, null, null, safetyCell, careSettingCell, WHITE_ARROW_STYLE);
			graph.insertEdge(parent, null, null, riskStrategyCell, hazardLogCell, WHITE_ARROW_STYLE);
			graph.insertEdge(parent, null, null, residualRiskCell, acceptableRiskCell, WHITE_ARROW_STYLE);
			graph.insertEdge(parent, null, null, residualRiskCell, riskMatrixCell, WHITE_ARROW_STYLE);
			graph.insertEdge(parent, null, null, residualRiskCell, controlledRiskCell, BLACK_ARROW_STYLE);
			graph.insertEdge(parent, null, null, residualRiskCell, clinicalBenefitsCell, BLACK_ARROW_STYLE);

			graph.insertEdge(parent, null, null, controlledRiskCell, acceptableRiskLevelsCell, WHITE_ARROW_STYLE);
			graph.insertEdge(parent, null, null, clinicalBenefitsCell, unacceptableRiskLevelsCell, WHITE_ARROW_STYLE);

			graph.insertEdge(parent, null, null, controlledRiskCell, hl1Cell, BLACK_ARROW_STYLE);
			graph.insertEdge(parent, null, null, clinicalBenefitsCell, hl2Cell, BLACK_ARROW_STYLE);

		} finally {
			graph.getModel().endUpdate();
		}
	}

	/**
	 * Position the graph centrally in the view
	 */
	private void repositionDiagram() {
		graph.getModel().beginUpdate();
		try {
			double layoutWidth = graphComponent.getLayoutAreaSize().getWidth();
			double layoutHeight = graphComponent.getLayoutAreaSize().getHeight();
			double width = graph.getGraphBounds().getWidth();
			double height = graph.getGraphBounds().getHeight();
			graph.getModel().setGeometry(graph.getDefaultParent(),
					new mxGeometry((layoutWidth - width) / 2, (layoutHeight - height) / 2, layoutWidth, layoutHeight));

		} finally {
			graph.getModel().endUpdate();
		}
	}

	/**
	 * Set up the mouse listener for the given graph component to trigger
	 * {@link #cellClicked(mxCell, Component, int, int)} when a cell is clicked.
	 * 
	 * @param graphComponent
	 */
	private void setMouseListener(mxGraphComponent graphComponent) {
		graphComponent.getGraphControl().addMouseListener(new MouseAdapter() {

			public void mouseReleased(MouseEvent e) {
				mxCell cell = null;
				cell = (mxCell) graphComponent.getCellAt(e.getX(), e.getY());
				if (cell != null) {
					cellClicked(cell, graphComponent, e.getX(), e.getY());
				}
			}

		});
	}

	/**
	 * Perform an action depending on which cell is input. Show a menu for
	 * clinicalEnvironmentCell or systemCell or load the corresponding editor
	 * view for hazardLogCell, acceptableRiskCell or the risk cells.
	 * 
	 * @param cell
	 * @param parent
	 * @param x
	 * @param y
	 */
	private static void cellClicked(mxCell cell, Component parent, int x, int y) {
		if (cell.equals(careSettingCell)) {
			populateClinicalEnvironmentMenuAndLabel();
			if (Main.getProject().getDatastore().getLocationrepository().getLocationDefinitions().isEmpty()) {
				mainParentWindow.showLocationEditor();
				return;
			}
			clinicalEnvironmentMenu.show(parent, x, y);
		} else if (cell.equals(systemCell)) {
			populateSystemsMenuAndLabel();
			if (Main.getProject().getDatastore().getSystemrepository().getSystemDefinitions().isEmpty()) {
				mainParentWindow.showSystemEditor();
				return;
			}
			systemsMenu.show(parent, x, y);

		} else if (cell.equals(hazardLogCell)) {
			mainParentWindow.showHazardLogEditor();
		} else if (cell.equals(riskMatrixCell)) {
			mainParentWindow.showRiskMatrixDialog();
		} else if (cell.equals(acceptableRiskLevelsCell)) {
			populateAcceptableRiskLevelsMenuAndLabel();
			acceptableRiskLevelsMenu.show(parent, x, y);
		} else if (cell.equals(unacceptableRiskLevelsCell)) {
			populateUnacceptableRiskLevelsMenuAndLabel();
			unacceptableRiskLevelsMenu.show(parent, x, y);
		} else if (cell.equals(legendCell)) {
			mainParentWindow.showGSNLegend();
		} else if (cell.equals(hl1Cell)) {
			populateAcceptableRiskLevelsMenuAndLabel();
			acceptableRiskLevelsMenu.show(parent, x, y);
		} else if (cell.equals(hl2Cell)) {
			populateUnacceptableRiskLevelsMenuAndLabel();
			unacceptableRiskLevelsMenu.show(parent, x, y);
		}
	}

	/**
	 * Set the label for the hazard definitions cell
	 */
	private static void setHazardCellLabel() {
		int hazardTypeCount = Main.getProject().getDatastore().getHazardrepository().getHazardDefinitions().size();
		int hazardInstanceCount = Main.getProject().getDatastore().getHazardrepository().getHazardInstances().size();
		
		String typePlural = "type";
		if (hazardTypeCount > 1 || hazardTypeCount == 0) {
			typePlural += "s";
		}
		
		String instancePlural = "instance";
		if (hazardInstanceCount > 1 || hazardInstanceCount == 0) {
			instancePlural += "s";
		}
		
		hazardLogCell.setValue("<html><p><u>Hazard Log</u></p><p>" + Integer.toString(hazardTypeCount) + " hazard " + typePlural
				+ " identified.</p><p>" + Integer.toString(hazardInstanceCount) + " hazard " + instancePlural + " identified.</p>"
				+ "</html>");
		
		graph.refresh();
	}

	/**
	 * Populate the system popup menu with system definitions from the system
	 * repository
	 */
	private static void populateSystemsMenuAndLabel() {
		// Reset the menu
		systemsMenu.removeAll();

		// only add new system names to the label while it is less than or equal
		// to this length.
		int maxLabelLength = 50;

		// Create the label. Labels have html format, which must be manually
		// coded.
		String label = "<html><u>HIT</u>";
		label += "<br>";

		int systemCount = Main.getProject().getDatastore().getSystemrepository().getSystemDefinitions().size();
		boolean finished = false;
		int counter = 0;

		Iterator<SystemDefinition> systemIterator = Main.getProject().getDatastore().getSystemrepository()
				.getSystemDefinitions().iterator();
		// Iterate through all the systems and add them to the list and label
		while (systemIterator.hasNext()) {
			SystemDefinition s = systemIterator.next();

			if (label.length() < maxLabelLength) {
				if (counter > 0) {
					label += ", ";
				}
				label += s.getSystemName();
			} else if (counter > 0 && systemCount - counter > 0 && !finished) {
				label += "<i> and " + Integer.toString(systemCount - counter) + " more</i>";
				finished = true;
			}
			// Add the system popup menu items and set up their actions
			// (The names of the items are defined by the actions)
			JMenuItem item = new JMenuItem();
			systemsMenu.add(item);
			item.setAction(thisPanel.new SelectSystemAction(s));
			counter++;
		}

		label += "</html>";
		systemCell.setValue(label);
		graph.refresh();
	}

	/**
	 * Fill the clinical environment popup menu with the list of clinical
	 * environments
	 */
	private static void populateClinicalEnvironmentMenuAndLabel() {
		// Reset the menu
		clinicalEnvironmentMenu.removeAll();

		int maxLabelLength = 50;
		String label = "<html><u>Care Setting</u>";
		int locationCount = Main.getProject().getDatastore().getLocationrepository().getLocationDefinitions().size();

		boolean finished = false;
		int counter = 0;
		label += "<br>";
		Iterator<LocationDefinition> locationIterator = Main.getProject().getDatastore().getLocationrepository()
				.getLocationDefinitions().iterator();
		while (locationIterator.hasNext()) {
			LocationDefinition l = locationIterator.next();

			if (label.length() < maxLabelLength) {
				if (counter > 0) {
					label += ", ";
				}
				label += l.getLocationName();
			} else if (counter > 0 && locationCount - counter > 0 && !finished) {
				label += "<i> and " + Integer.toString(locationCount - counter) + " more</i>";
				finished = true;
			}

			// Add the location popup menu items and set up their actions
			// (The names of the items are defined by the actions)
			JMenuItem item = new JMenuItem();
			clinicalEnvironmentMenu.add(item);
			item.setAction(thisPanel.new SelectLocationAction(l));
			counter++;
		}

		label += "</html>";
		careSettingCell.setValue(label);
		graph.refresh();
	}

	/**
	 * fill the popup menu for acceptable risks with the appropriate entries and
	 * set up an action for each one to take the user to the correct hazard log
	 * entry when pressed
	 */
	private static void populateAcceptableRiskLevelsMenuAndLabel() {
		acceptableRiskLevelsMenu.removeAll();
		String label = "<html><u>Acceptable Risk Levels</u>";
		label += "<br>";
		int unacceptableLevel = riskMatrix.getMinUnacceptableRisk();
		int acceptableCount = 0;
		for (HazardInstance hi : Main.getProject().getDatastore().getHazardrepository().getHazardInstances()) {
			if (hi.getResidualRiskRating() < unacceptableLevel) {
				acceptableCount++;
				// Add the location popup menu items and set up their actions
				// (The names of the items are defined by the actions)
				JMenuItem item = new JMenuItem();
				acceptableRiskLevelsMenu.add(item);
				item.setAction(thisPanel.new SelectHazardInstanceAction(hi));
			}
		}
		label += Integer.toString(acceptableCount)
				+ " hazard instances associated with acceptable levels of clinical risk";
		label += "</html>";
		acceptableRiskLevelsCell.setValue(label);
		graph.refresh();
	}

	/**
	 * fill the popup menu for unacceptable risks with the appropriate entries
	 * and set up an action for each one to take the user to the correct hazard
	 * log entry when pressed
	 */
	private static void populateUnacceptableRiskLevelsMenuAndLabel() {
		unacceptableRiskLevelsMenu.removeAll();
		String label = "<html><u>Unacceptable Risk Levels</u>";
		label += "<br>";
		int unacceptableLevel = riskMatrix.getMinUnacceptableRisk();
		int unacceptableCount = 0;
		for (HazardInstance hi : Main.getProject().getDatastore().getHazardrepository().getHazardInstances()) {
			if (hi.getResidualRiskRating() >= unacceptableLevel) {
				unacceptableCount++;
				// Add the location popup menu items and set up their actions
				// (The names of the items are defined by the actions)
				JMenuItem item = new JMenuItem();
				unacceptableRiskLevelsMenu.add(item);
				item.setAction(thisPanel.new SelectHazardInstanceAction(hi));
			}
		}
		label += Integer.toString(unacceptableCount)
				+ " hazard instances associated with unacceptable levels of clinical risk";
		label += "</html>";
		unacceptableRiskLevelsCell.setValue(label);
		graph.refresh();
	}

	/**
	 * A component listener to trigger <code>repositionDiagram()</code> when the
	 * registering component is resized.
	 */
	private class resizeListener extends ComponentAdapter {
		public void componentResized(ComponentEvent e) {
			repositionDiagram();
		}
	}

	/**
	 * The generic action which causes the main window to switch to the system
	 * editor and highlight the given system definition.
	 *
	 */
	private class SelectSystemAction extends AbstractAction {
		SystemDefinition system;

		public SelectSystemAction(SystemDefinition s) {
			system = s;
			putValue(NAME, s.getSystemName());
			putValue(SHORT_DESCRIPTION, "Go to this system in the system editor");
		}

		public void actionPerformed(ActionEvent e) {
			mainParentWindow.openSystemEditorWithSelection(system);
		}
	}

	/**
	 * The generic action which, when fired, will attempt to select the given
	 * hazard instance and its parent hazard in the hazard log editor
	 */
	private class SelectHazardInstanceAction extends AbstractAction {
		HazardInstance hazardInstance;

		public SelectHazardInstanceAction(HazardInstance hi) {
			hazardInstance = hi;
			putValue(NAME, hi.getHazardDefinition().getHazardName() + " \u2192 "
					+ hi.getName());
			putValue(SHORT_DESCRIPTION, "Go to this hazard instance in the hazard log editor");
		}

		public void actionPerformed(ActionEvent e) {
			mainParentWindow.openHazardLogEditorWithSelectedInstance(hazardInstance);
		}
	}

	/**
	 * The generic action which, when fired, will attempt to select the given
	 * location definition in the care setting editor
	 */
	private class SelectLocationAction extends AbstractAction {
		LocationDefinition location;

		public SelectLocationAction(LocationDefinition l) {
			location = l;
			putValue(NAME, l.getLocationName());
			putValue(SHORT_DESCRIPTION, "Go to this element in the care setting editor");
		}

		public void actionPerformed(ActionEvent e) {
			mainParentWindow.openLocationEditorWithSelection(location);
		}
	}
}
