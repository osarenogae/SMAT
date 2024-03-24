package userInterface;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.FlowLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

/**
 * The (quite complicated) GUI panel for {@link #FunctionalHazardDefinitionDialog}.
 */
public class PanelFunctionalHazardDefinition extends JPanel {
	private JTable labelTable;
	private JTable severityLikelihoodRiskTable;
	private JTextArea impactTextArea;
	private JTextField statusTextField;
	private JTextField associatedFunctionTextField;
	private JButton btnSelectSystemFunction;
	private JPopupMenu causeAddPopupMenu;
	private JMenuItem causeMntmNewCause;
	private JTree causeTree;
	private JButton causeTreeBtnRemove;
	private JButton causeTreeBtnEdit;
	private JButton causeTreeBtnAdd;
	private JMenuItem causeMntmNewControl;
	private JButton effectTreeBtnAdd;
	private JButton effectTreeBtnRemove;
	private JButton effectTreeBtnEdit;
	private JMenuItem EffectMntmNewEffect;
	private JMenuItem EffectMntmNewControl;
	private JTree effectTree;
	private JTextField associatedStepTextField;
	private JButton btnSelectCareProcessStep;
	private JTextField associatedHazardTypeTextField;
	private JButton btnSelectHazardType;
	private JTextArea clinicalJustificationTextArea;
	private JTextField nameTextField;
	private JTextArea descriptionTextArea;

	/**
	 * Create the panel.
	 */
	public PanelFunctionalHazardDefinition() {
		
		
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		
		JPanel analysisPanel = new JPanel();
		add(analysisPanel);
		
		JPanel systemFunctionPanel = new JPanel();
		systemFunctionPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Instance Associations", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		associatedFunctionTextField = new JTextField();
		associatedFunctionTextField.setHorizontalAlignment(SwingConstants.LEFT);
		associatedFunctionTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
		associatedFunctionTextField.setAlignmentY(Component.TOP_ALIGNMENT);
		associatedFunctionTextField.setEditable(false);
		associatedFunctionTextField.setColumns(50);
		
		btnSelectSystemFunction = new JButton("...");
		
		associatedStepTextField = new JTextField();
		associatedStepTextField.setHorizontalAlignment(SwingConstants.LEFT);
		associatedStepTextField.setEditable(false);
		associatedStepTextField.setColumns(50);
		associatedStepTextField.setAlignmentY(0.0f);
		associatedStepTextField.setAlignmentX(0.0f);
		
		btnSelectCareProcessStep = new JButton("...");
		
		JLabel lblSystemFunction = new JLabel("System Function");
		lblSystemFunction.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblCareProcessStep = new JLabel("Care Process Step");
		lblCareProcessStep.setHorizontalAlignment(SwingConstants.RIGHT);
		
		associatedHazardTypeTextField = new JTextField();
		associatedHazardTypeTextField.setHorizontalAlignment(SwingConstants.LEFT);
		associatedHazardTypeTextField.setEditable(false);
		associatedHazardTypeTextField.setColumns(50);
		associatedHazardTypeTextField.setAlignmentY(0.0f);
		associatedHazardTypeTextField.setAlignmentX(0.0f);
		
		JLabel lblHazardType = new JLabel("Hazard Type");
		lblHazardType.setHorizontalAlignment(SwingConstants.RIGHT);
		
		btnSelectHazardType = new JButton("...");
		GroupLayout gl_systemFunctionPanel = new GroupLayout(systemFunctionPanel);
		gl_systemFunctionPanel.setHorizontalGroup(
			gl_systemFunctionPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_systemFunctionPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_systemFunctionPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblHazardType, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addComponent(lblSystemFunction, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
						.addComponent(lblCareProcessStep, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_systemFunctionPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(associatedStepTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
						.addComponent(associatedFunctionTextField, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
						.addComponent(associatedHazardTypeTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_systemFunctionPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_systemFunctionPanel.createSequentialGroup()
							.addComponent(btnSelectCareProcessStep)
							.addContainerGap())
						.addGroup(gl_systemFunctionPanel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_systemFunctionPanel.createSequentialGroup()
								.addComponent(btnSelectSystemFunction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(gl_systemFunctionPanel.createSequentialGroup()
								.addComponent(btnSelectHazardType, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap()))))
		);
		gl_systemFunctionPanel.setVerticalGroup(
			gl_systemFunctionPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_systemFunctionPanel.createSequentialGroup()
					.addGroup(gl_systemFunctionPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(associatedHazardTypeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHazardType)
						.addComponent(btnSelectHazardType))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_systemFunctionPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(associatedFunctionTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSystemFunction)
						.addComponent(btnSelectSystemFunction))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_systemFunctionPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(associatedStepTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCareProcessStep)
						.addComponent(btnSelectCareProcessStep))
					.addGap(28))
		);
		systemFunctionPanel.setLayout(gl_systemFunctionPanel);
		
		JPanel namePanel = new JPanel();
		namePanel.setBorder(new TitledBorder(null, "Instance Name", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		
		JLabel lblName = new JLabel("Instance Name");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_namePanel = new GroupLayout(namePanel);
		gl_namePanel.setHorizontalGroup(
			gl_namePanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_namePanel.createSequentialGroup()
					.addGroup(gl_namePanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDescription, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
						.addComponent(lblName, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
					.addGap(10)
					.addGroup(gl_namePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_2, Alignment.TRAILING)
						.addComponent(nameTextField, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)))
		);
		gl_namePanel.setVerticalGroup(
			gl_namePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_namePanel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_namePanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblName))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_namePanel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_2, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
						.addComponent(lblDescription))
					.addContainerGap())
		);
		
		descriptionTextArea = new JTextArea();
		descriptionTextArea.setWrapStyleWord(true);
		descriptionTextArea.setLineWrap(true);
		scrollPane_2.setViewportView(descriptionTextArea);
		namePanel.setLayout(gl_namePanel);
		
		JPanel fullCauseImpactPanel = new JPanel();
		fullCauseImpactPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		fullCauseImpactPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Causes and Effects", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel causeEffectPanel = new JPanel();
		
		JPanel causePanel = new JPanel();
		causePanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane causesScrollPane = new JScrollPane();
		causePanel.add(causesScrollPane);
		
		causeTree = new JTree();
		causeTree.setVisibleRowCount(5);
		causeTree.setRootVisible(false);
		causeTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Root") {
				{
				}
			}
		));
		causesScrollPane.setViewportView(causeTree);
		
		JToolBar toolBar = new JToolBar();
		causesScrollPane.setColumnHeaderView(toolBar);
		toolBar.setFloatable(false);
		toolBar.setAlignmentY(Component.CENTER_ALIGNMENT);
		
		causeTreeBtnAdd = new JButton("Add");
		toolBar.add(causeTreeBtnAdd);
		
		causeAddPopupMenu = new JPopupMenu();
		addPopup(causeTreeBtnAdd, causeAddPopupMenu);
		
		causeMntmNewCause = new JMenuItem("New Cause");
		causeAddPopupMenu.add(causeMntmNewCause);
		
		causeMntmNewControl = new JMenuItem("New Control");
		causeAddPopupMenu.add(causeMntmNewControl);
		
		causeTreeBtnRemove = new JButton("Remove");
		causeTreeBtnRemove.setEnabled(false);
		toolBar.add(causeTreeBtnRemove);
		
		causeTreeBtnEdit = new JButton("Edit");
		toolBar.add(causeTreeBtnEdit);
		
		JPanel effectPAnel = new JPanel();
		effectPAnel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		effectPAnel.add(scrollPane);
		
		effectTree = new JTree();
		effectTree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Root") {
				{
				}
			}
		));
		effectTree.setRootVisible(false);
		scrollPane.setViewportView(effectTree);
		
		JToolBar effectTreeToolbar = new JToolBar();
		effectTreeToolbar.setFloatable(false);
		effectTreeToolbar.setAlignmentY(0.5f);
		scrollPane.setColumnHeaderView(effectTreeToolbar);
		
		effectTreeBtnAdd = new JButton("Add");
		effectTreeToolbar.add(effectTreeBtnAdd);
		
		JPopupMenu effectAddPopupMenu = new JPopupMenu();
		addPopup(effectTreeBtnAdd, effectAddPopupMenu);
		
		EffectMntmNewEffect = new JMenuItem("New Effect");
		effectAddPopupMenu.add(EffectMntmNewEffect);
		
		EffectMntmNewControl = new JMenuItem("New Control");
		effectAddPopupMenu.add(EffectMntmNewControl);
		
		effectTreeBtnRemove = new JButton("Remove");
		effectTreeBtnRemove.setEnabled(false);
		effectTreeToolbar.add(effectTreeBtnRemove);
		
		effectTreeBtnEdit = new JButton("Edit");
		effectTreeToolbar.add(effectTreeBtnEdit);
		
		JPanel impactJustificationPanel = new JPanel();
		impactJustificationPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		impactJustificationPanel.setBorder(null);
		
		JLabel lblPotentialClinicalImpact = new JLabel("Overall Clinical Impact");
		lblPotentialClinicalImpact.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JScrollPane impactScrollPane = new JScrollPane();
		
		impactTextArea = new JTextArea();
		impactScrollPane.setViewportView(impactTextArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblClinicalJustification = new JLabel("Clinical Justification");
		lblClinicalJustification.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_impactJustificationPanel = new GroupLayout(impactJustificationPanel);
		gl_impactJustificationPanel.setHorizontalGroup(
			gl_impactJustificationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_impactJustificationPanel.createSequentialGroup()
					.addGroup(gl_impactJustificationPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblClinicalJustification, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblPotentialClinicalImpact, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_impactJustificationPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(impactScrollPane, GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)))
		);
		gl_impactJustificationPanel.setVerticalGroup(
			gl_impactJustificationPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_impactJustificationPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_impactJustificationPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(impactScrollPane, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPotentialClinicalImpact))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_impactJustificationPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addComponent(lblClinicalJustification))
					.addContainerGap())
		);
		
		clinicalJustificationTextArea = new JTextArea();
		scrollPane_1.setViewportView(clinicalJustificationTextArea);
		impactJustificationPanel.setLayout(gl_impactJustificationPanel);
		GroupLayout gl_fullCauseImpactPanel = new GroupLayout(fullCauseImpactPanel);
		gl_fullCauseImpactPanel.setHorizontalGroup(
			gl_fullCauseImpactPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_fullCauseImpactPanel.createSequentialGroup()
					.addGroup(gl_fullCauseImpactPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(impactJustificationPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 638, GroupLayout.PREFERRED_SIZE)
						.addComponent(causeEffectPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_fullCauseImpactPanel.setVerticalGroup(
			gl_fullCauseImpactPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_fullCauseImpactPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(causeEffectPanel, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(impactJustificationPanel, GroupLayout.PREFERRED_SIZE, 86, Short.MAX_VALUE)
					.addContainerGap())
		);
		GroupLayout gl_causeEffectPanel = new GroupLayout(causeEffectPanel);
		gl_causeEffectPanel.setHorizontalGroup(
			gl_causeEffectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_causeEffectPanel.createSequentialGroup()
					.addComponent(causePanel, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
					.addComponent(effectPAnel, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE))
		);
		gl_causeEffectPanel.setVerticalGroup(
			gl_causeEffectPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(causePanel, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
				.addComponent(effectPAnel, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
		);
		causeEffectPanel.setLayout(gl_causeEffectPanel);
		fullCauseImpactPanel.setLayout(gl_fullCauseImpactPanel);
		
		JPanel RiskAssessmentPanel = new JPanel();
		RiskAssessmentPanel.setBorder(new TitledBorder(null, "Risk Assessment", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JScrollPane tableScrollPane = new JScrollPane();
		
		JPanel tableLabelHolder = new JPanel();
		tableScrollPane.setRowHeaderView(tableLabelHolder);
		tableLabelHolder.setLayout(new BorderLayout(0, 0));
		
		labelTable = new JTable();
		labelTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Initial"},
				{"Residual"},
			},
			new String[] {
				" "
			}
		));
		tableLabelHolder.add(labelTable);
		
		JPanel tableContentHolder = new JPanel();
		tableScrollPane.setViewportView(tableContentHolder);
		tableContentHolder.setLayout(new BorderLayout(0, 0));
		
		severityLikelihoodRiskTable = new JTable();
		severityLikelihoodRiskTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Severity", "Likelihood", "Risk Rating"
			}
		));
		tableContentHolder.add(severityLikelihoodRiskTable);
		tableContentHolder.add(severityLikelihoodRiskTable.getTableHeader(), BorderLayout.NORTH);
		tableLabelHolder.add(labelTable.getTableHeader(), BorderLayout.NORTH);
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblHazardStatus = new JLabel("Hazard Status");
		
		statusTextField = new JTextField();
		statusTextField.setColumns(10);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblHazardStatus, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(statusTextField, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHazardStatus)
						.addComponent(statusTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_RiskAssessmentPanel = new GroupLayout(RiskAssessmentPanel);
		gl_RiskAssessmentPanel.setHorizontalGroup(
			gl_RiskAssessmentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_RiskAssessmentPanel.createSequentialGroup()
					.addGroup(gl_RiskAssessmentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tableScrollPane, GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_RiskAssessmentPanel.setVerticalGroup(
			gl_RiskAssessmentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_RiskAssessmentPanel.createSequentialGroup()
					.addComponent(tableScrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
		);
		RiskAssessmentPanel.setLayout(gl_RiskAssessmentPanel);
		GroupLayout gl_analysisPanel = new GroupLayout(analysisPanel);
		gl_analysisPanel.setHorizontalGroup(
			gl_analysisPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_analysisPanel.createSequentialGroup()
					.addGroup(gl_analysisPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(fullCauseImpactPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(systemFunctionPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(RiskAssessmentPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(namePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_analysisPanel.setVerticalGroup(
			gl_analysisPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_analysisPanel.createSequentialGroup()
					.addComponent(namePanel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(systemFunctionPanel, GroupLayout.PREFERRED_SIZE, 115, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fullCauseImpactPanel, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(RiskAssessmentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		analysisPanel.setLayout(gl_analysisPanel);

	}
	
	
	public JTextArea getImpactTextArea() {
		return impactTextArea;
	}
	public JTable getSeverityLikelihoodRiskTable() {
		return severityLikelihoodRiskTable;
	}
	public JTextField getStatusTextField() {
		return statusTextField;
	}
	public JTextField getAssociatedFunctionTextField() {
		return associatedFunctionTextField;
	}
	public JButton getBtnSelectSystemFunction() {
		return btnSelectSystemFunction;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				showMenu(e);
				
			}
			public void mouseReleased(MouseEvent e) {
				showMenu(e);
				
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	public JPopupMenu getCauseAddPopupMenu() {
		return causeAddPopupMenu;
	}
	public JMenuItem getCauseMntmNewCause() {
		return causeMntmNewCause;
	}
	public JTree getCauseTree() {
		return causeTree;
	}
	public JButton getCauseTreeBtnRemove() {
		return causeTreeBtnRemove;
	}
	public JButton getCauseTreeBtnEdit() {
		return causeTreeBtnEdit;
	}
	public JButton getCauseTreeBtnAdd() {
		return causeTreeBtnAdd;
	}
	public JMenuItem getCauseMntmNewControl() {
		return causeMntmNewControl;
	}
	public JButton getEffectTreeBtnAdd() {
		return effectTreeBtnAdd;
	}
	public JButton getEffectTreeBtnRemove() {
		return effectTreeBtnRemove;
	}
	public JButton getEffectTreeBtnEdit() {
		return effectTreeBtnEdit;
	}
	public JMenuItem getEffectMntmNewEffect() {
		return EffectMntmNewEffect;
	}
	public JMenuItem getEffectMntmNewControl() {
		return EffectMntmNewControl;
	}
	public JTree getEffectTree() {
		return effectTree;
	}
	public JTextField getAssociatedStepTextField() {
		return associatedStepTextField;
	}
	public JButton getBtnSelectCareProcessStep() {
		return btnSelectCareProcessStep;
	}
	public JTextField getAssociatedHazardTypeTextField() {
		return associatedHazardTypeTextField;
	}
	public JButton getBtnSelectHazardType() {
		return btnSelectHazardType;
	}
	public JTextArea getClinicalJustificationTextArea() {
		return clinicalJustificationTextArea;
	}
	public JTextField getNameTextField() {
		return nameTextField;
	}
	public JTextArea getDescriptionTextArea() {
		return descriptionTextArea;
	}
}
