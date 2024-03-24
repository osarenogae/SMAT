package userInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.canvas.mxGraphicsCanvas2D;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.shape.mxStencil;
import com.mxgraph.shape.mxStencilRegistry;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxPoint;
import com.mxgraph.util.mxUtils;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;

import graphEditor.CustomGraphComponent2;
import java.awt.Window.Type;
import javax.swing.BoxLayout;

/**
 * The small dialog which displays the legend for the GSN navigator panel on the
 * home screen. It is defined entirely independently of the navigator panel
 *
 */
public class GSNOverviewLegend extends JDialog {

	// Constants defining the GSN node attributes
	private static final int BOX_WIDTH = 110;
	private static final int BOX_HEIGHT = 80;
	private static final int BUFFER = 30;
	private static final int FONT_SIZE = 10;
	private static final String STANDARD_FILL_COLOUR = "#F5F5F5";
	private static final String STANDARD_LINE_COLOUR = "#575757";
	private static final String STANDARD_FONT_COLOUR = "#111111";
	// Constants identifying the styles for GSN cells
	private static final String ROUNDRECT_STYLE = "style.roundrect";
	private static final String RECT_STYLE = "style.rect";
	private static final String ELLIPSE_STYLE = "style.ellipse";
	private static final String PARALLELOGRAM_STYLE = "style.parallelogram";
	private static final String BORDERLESS_STYLE = "style.borderless";
	private static final String WHITE_BLACK_ARROW_STYLE = "style.white_black_arrow";
	private static final String BLACK_ARROW_STYLE = "style.black_arrow";
	private static final String WHITE_ARROW_STYLE = "style.white_arrow";

	// Static labels for the GSN cells.
	private static final String GOAL_CELL_LABEL = "<html><p><b>{Goal Identifier}</b></p><p>&lt Claim Statement &gt</p></html>";
	private static final String CONTEXT_CELL_LABEL = "<html><p><b>{Context Identifier}</b></p><p>&lt Context Statement &gt</p></html>";
	private static final String JUSTIFICATION_CELL_LABEL = "<html><p><b>{Justification Identifier}</b></p><p>&lt Justification Statement &gt</p></html>";
	private static final String STRATEGY_CELL_LABEL = "<html><p><b>{Strategy Identifier}</b></p><p>&lt Strategy Statement &gt</p></html>";
	private static final String SUPPORTED_BY_LABEL = "Supported by";
	private static final String CONTEXT_OF_LABEL = "In context of";

	// The JGraphx components used to draw the graph
	protected CustomGraphComponent2 graphComponent;
	private static mxGraph graph;

	// The GSN cell variables, initialised when the graph is drawn
	private mxCell goalCell;
	private mxCell contextCell;
	private mxCell justificationCell;
	private mxCell strategyCell;

	/**
	 * Create the GSN Legend panel.
	 */
	public GSNOverviewLegend() {
		setType(Type.UTILITY);
		setTitle("Legend");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setPreferredSize(new Dimension(4 * BOX_WIDTH, 4 * BOX_HEIGHT));
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		graphComponent = new CustomGraphComponent2(new mxGraph());
		panel.add(graphComponent);
		graphComponent.setToolTips(false);
		graphComponent.setPageBreaksVisible(false);
		graphComponent.setPanning(true);
		graphComponent.setConnectable(false);
		graph = graphComponent.getGraph();
		graph.setHtmlLabels(true);
		graph.setConnectableEdges(false);
		graph.setCellsMovable(false);
		graph.setCellsSelectable(false);
		graph.setCellsEditable(false);
		graph.setCellsLocked(true);
		initialiseGraphStyles(graph);
		drawDiagram();

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				dispose();
			}
		});
	}

	/**
	 * Draw the shapes for the legend
	 */
	private void drawDiagram() {
		Object parent = graph.getDefaultParent();
		graph.getModel().beginUpdate();
		try {

			goalCell = (mxCell) graph.insertVertex(parent, null, null, 0, 0, BOX_WIDTH, BOX_HEIGHT, RECT_STYLE);
			goalCell.setValue(GOAL_CELL_LABEL);

			contextCell = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH + BUFFER, 0, BOX_WIDTH, BOX_HEIGHT,
					ROUNDRECT_STYLE + ";shape=roundrect");
			contextCell.setValue(CONTEXT_CELL_LABEL);

			justificationCell = (mxCell) graph.insertVertex(parent, null, null, 0, BOX_HEIGHT + BUFFER, BOX_HEIGHT,
					BOX_HEIGHT, ELLIPSE_STYLE);
			justificationCell.setValue(JUSTIFICATION_CELL_LABEL);

			strategyCell = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH + BUFFER, BOX_HEIGHT + BUFFER,
					BOX_WIDTH, BOX_HEIGHT, PARALLELOGRAM_STYLE + ";shape=parallelogram");
			strategyCell.setValue(STRATEGY_CELL_LABEL);

			// The arrows need to start and end at cells, so create some
			// invisible cells for their start/end points
			int y = 2 * BOX_HEIGHT + 2 * BUFFER;
			mxCell a = (mxCell) graph.insertVertex(parent, null, null, 0, y, 0, 0, BORDERLESS_STYLE);
			mxCell b = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH, y, 0, 0, BORDERLESS_STYLE);
			mxCell c = (mxCell) graph.insertVertex(parent, null, null, BOX_WIDTH + BUFFER, y, 0, 0, BORDERLESS_STYLE);
			mxCell d = (mxCell) graph.insertVertex(parent, null, null, 2 * BOX_WIDTH + BUFFER, y, 0, 0,
					BORDERLESS_STYLE);

			mxCell blackArrow = (mxCell) graph.insertEdge(parent, null, null, a, b, BLACK_ARROW_STYLE);
			blackArrow.setValue(SUPPORTED_BY_LABEL);
			blackArrow.getGeometry().setOffset(new mxPoint(0, 10));

			mxCell whiteArrow = (mxCell) graph.insertEdge(parent, null, null, c, d, WHITE_ARROW_STYLE);
			whiteArrow.setValue(CONTEXT_OF_LABEL);
			whiteArrow.getGeometry().setOffset(new mxPoint(0, 10));

		} finally {
			graph.getModel().endUpdate();
		}
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

		Hashtable<String, Object> parallelogramStyle = new Hashtable<String, Object>();
		// We will need to override the shape when the cell is created.
		// There doesn't seem to be a way to specify use of custom shapes
		// here...
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
		whiteBlackArrowStyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		whiteBlackArrowStyle.put(mxConstants.STYLE_EDGE, mxConstants.EDGESTYLE_ORTHOGONAL);
		whiteBlackArrowStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_CONNECTOR);
		stylesheet.putCellStyle(WHITE_BLACK_ARROW_STYLE, whiteBlackArrowStyle);

		Hashtable<String, Object> blackArrowStyle = new Hashtable<String, Object>();
		blackArrowStyle.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_BLOCK);
		blackArrowStyle.put(mxConstants.STYLE_FILLCOLOR, STANDARD_LINE_COLOUR);
		blackArrowStyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		blackArrowStyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		blackArrowStyle.put(mxConstants.STYLE_STARTSIZE, 15);
		blackArrowStyle.put(mxConstants.STYLE_ENDSIZE, 8);
		blackArrowStyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		stylesheet.putCellStyle(BLACK_ARROW_STYLE, blackArrowStyle);

		Hashtable<String, Object> whiteArrowStyle = new Hashtable<String, Object>();
		whiteArrowStyle.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_BLOCK);
		whiteArrowStyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
		whiteArrowStyle.put(mxConstants.STYLE_ENDFILL, "#ffffff");
		whiteArrowStyle.put(mxConstants.STYLE_STROKECOLOR, STANDARD_LINE_COLOUR);
		whiteArrowStyle.put(mxConstants.STYLE_STARTSIZE, 15);
		whiteArrowStyle.put(mxConstants.STYLE_ENDSIZE, 8);
		whiteArrowStyle.put(mxConstants.STYLE_FONTCOLOR, STANDARD_FONT_COLOUR);
		stylesheet.putCellStyle(WHITE_ARROW_STYLE, whiteArrowStyle);

		try {
			String filename = "res/shapes.xml";
			Document doc = mxXmlUtils.parseXml(mxUtils.readFile(filename));

			Element shapes = (Element) doc.getDocumentElement();
			NodeList list = shapes.getElementsByTagName("shape");

			for (int i = 0; i < list.getLength(); i++) {
				Element shape = (Element) list.item(i);
				mxStencilRegistry.addStencil(shape.getAttribute("name"), new mxStencil(shape) {
					protected mxGraphicsCanvas2D createCanvas(final mxGraphics2DCanvas gc) {
						// Redirects image loading to graphics canvas
						return new mxGraphicsCanvas2D(gc.getGraphics()) {
							protected Image loadImage(String src) {
								// Adds image base path to relative image URLs
								if (!src.startsWith("/") && !src.startsWith("http://") && !src.startsWith("https://")
										&& !src.startsWith("file:")) {
									src = gc.getImageBasePath() + src;
								}

								// Call is cached
								return gc.loadImage(src);
							}
						};
					}
				});
			}
		} catch (Exception e) {
			//TODO We should let the user know that things won't display properly if we coldn't load the style file.
			e.printStackTrace();
		}

	}

	/**
	 * Position the graph centrally in the view
	 */
	public void repositionDiagram() {
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

}
