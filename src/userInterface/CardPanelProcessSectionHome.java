package userInterface;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import guiComponents.IconDescriptionButton;
import main.Main;

import javax.swing.border.TitledBorder;

import RiskMatrixModel.RiskMatrix;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToolBar;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.net.URL;

/**
 * The JPanel that holds all the components of the main home menu of the
 * application and, together with its corresponding 'Worker' class, defines
 * their behaviour.
 * <p>
 * As noted in the corresponding 'Worker' class, this class is generally
 * responsible for triggering events whose functionality is defined by methods
 * of the Worker class. This is an attempt to separate definition of GUI layout
 * (which often has quite complex code, partly due to the code being generated
 * by a graphical editor) from the functional aspects of the code.
 *
 */
public class CardPanelProcessSectionHome extends JPanel implements EditorView, DialogParentPanel {
	private IconDescriptionButton systemEditor_icoButton;
	private IconDescriptionButton carePRocessEditor_icoButton;
	private IconDescriptionButton locationEditor_icoButton;
	private IconDescriptionButton hazardLog_icoButton;
	private IconDescriptionButton report_icoButton;
	private PanelGSNOverview panelGSNOverview;
	private final Action zoomInAction = new ZoomInAction();
	private final Action zoomOutAction = new ZoomOutAction();
	private JButton btnChangeProject;
	private IconDescriptionButton riskMatrix_icoButton;
	private IconDescriptionButton issueLog_icoButton;

	/**
	 * Create the panel.
	 */
	public CardPanelProcessSectionHome(MainAppWindow mainParentWindow, RiskMatrix rm) {
		setBackground(new Color(230, 230, 250));

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(Color.getHSBColor(0, 0, 0.98f));
		buttonsPanel.setLayout(new GridLayout(0, 1, 0, 15));

		systemEditor_icoButton = new IconDescriptionButton(true, false,
				CardPanelProcessSectionHome.class.getResource("/res/monitor-2x.png"), "System Editor",
				"View and edit system definitions");
		buttonsPanel.add(systemEditor_icoButton);

		locationEditor_icoButton = new IconDescriptionButton(false, false,
				CardPanelProcessSectionHome.class.getResource("/res/map-2x.png"), "Care Setting Editor",
				"View and edit care setting descriptions");
		buttonsPanel.add(locationEditor_icoButton);

		carePRocessEditor_icoButton = new IconDescriptionButton(false, true,
				CardPanelProcessSectionHome.class.getResource("/res/project-2x.png"), "Care Process Editor",
				"View and edit care process diagrams");
		buttonsPanel.add(carePRocessEditor_icoButton);

		riskMatrix_icoButton = new IconDescriptionButton(true, false,
				CardPanelProcessSectionHome.class.getResource("/res/grid-four-up-2x.png"), "Risk Matrix",
				"View or import the risk matrix for this project");
		buttonsPanel.add(riskMatrix_icoButton);

		hazardLog_icoButton = new IconDescriptionButton(false, true,
				CardPanelProcessSectionHome.class.getResource("/res/warning-2x.png"), "Hazard Log",
				"View hazards associated with this project");
		buttonsPanel.add(hazardLog_icoButton);

		issueLog_icoButton = new IconDescriptionButton(true, false,
				CardPanelProcessSectionHome.class.getResource("/res/spreadsheet-2x.png"), "Issue Log",
				"View and edit outstanding test issues");
		buttonsPanel.add(issueLog_icoButton);

		report_icoButton = new IconDescriptionButton(false, true,
				CardPanelProcessSectionHome.class.getResource("/res/paperclip-2x.png"), "Report",
				"View additional content associated with this report");
		buttonsPanel.add(report_icoButton);

		JPanel diagramPanel = new JPanel();
		diagramPanel.setLayout(new BorderLayout(0, 0));

		panelGSNOverview = new PanelGSNOverview(mainParentWindow, Main.getProject(), rm);
		diagramPanel.add(panelGSNOverview);
		panelGSNOverview.graphComponent.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panelGSNOverview.graphComponent.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		panelGSNOverview.setBorder(null);
		panelGSNOverview.graphComponent.getGraphControl().setBorder(null);

		JToolBar toolBar = new JToolBar();
		diagramPanel.add(toolBar, BorderLayout.SOUTH);
		toolBar.setFloatable(false);

		btnChangeProject = new JButton("Change Project");
		btnChangeProject.setIcon(new ImageIcon(CardPanelProcessSectionHome.class.getResource("/res/folder-2x.png")));
		toolBar.add(btnChangeProject);
		setLayout(new GridLayout(0, 2, 0, 0));
		add(buttonsPanel);
		add(diagramPanel);

	}

	public IconDescriptionButton getSystemEditor_icoButton() {
		return systemEditor_icoButton;
	}

	public IconDescriptionButton getCareProcessEditor_icoButton() {
		return carePRocessEditor_icoButton;
	}

	public IconDescriptionButton getLocationEditor_icoButton() {
		return locationEditor_icoButton;
	}

	public IconDescriptionButton getRiskMatrix_icoButton() {
		return riskMatrix_icoButton;
	}

	public IconDescriptionButton getHazardLog_icoButton() {
		return hazardLog_icoButton;
	}

	public IconDescriptionButton getReport_icoButton() {
		return report_icoButton;
	}

	@Override
	public boolean tryCloseView() {
		return true;
	}

	@Override
	public boolean saveAndClose() {
		return true;
	}

	@Override
	public void refresh() {
		panelGSNOverview.updateLabels();
	}

	private class ZoomInAction extends AbstractAction {
		public ZoomInAction() {
			putValue(SHORT_DESCRIPTION, "Zoom in on the diagram");
		}

		public void actionPerformed(ActionEvent e) {
			panelGSNOverview.zoomIn();
		}
	}

	private class ZoomOutAction extends AbstractAction {
		public ZoomOutAction() {
			putValue(SHORT_DESCRIPTION, "Zoom out of the diagram");
		}

		public void actionPerformed(ActionEvent e) {
			panelGSNOverview.zoomOut();
		}
	}

	@Override
	public void save() {
		Main.saveProject();
	}

	public IconDescriptionButton getIssueLog_icoButton() {
		return issueLog_icoButton;
	}

	public JButton getBtnChangeProject() {
		return btnChangeProject;
	}
}
