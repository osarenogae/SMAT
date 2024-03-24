package userInterface;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AbstractDocument;

import com.mxgraph.model.mxCell;
import com.mxgraph.util.mxResources;
import com.mxgraph.view.mxGraph;

import careProcess_model.Activity;
import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelPackage;
import careProcess_model.Decision;
import careProcess_model.Step;
import graphEditor.CustomGraphComponent;
import graphEditor.EditorActions;
import graphEditor.CustomGraphComponent.EditMode;
import guiComponents.DocumentSymbolFilter;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.AbstractAction;
import javax.swing.ComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;

/**
 * Half of the editor data panel - contains the name, location and description components.
 *
 */
public class PanelActivityProperties extends JPanel {
	private JTextField activityNameTextField;
	private JComboBox locationComboBox;
	private JEditorPane descriptionEditorPane;
	private JButton newLocationButton;

	private CareProcess careProcess;

	public PanelActivityProperties(CardPanelCareProcessEditor careProcessEditor, CareProcess careProcessIn) {
		
		careProcess = careProcessIn;
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout.createSequentialGroup()
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE).addGap(0)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(panel,
				GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE));

		JLabel lblActivityName = new JLabel("Activity Name:");
		lblActivityName.setHorizontalAlignment(SwingConstants.RIGHT);

		activityNameTextField = new JTextField();

		JLabel lblAssociatedLocation = new JLabel("Associated Care Setting:");
		lblAssociatedLocation.setHorizontalAlignment(SwingConstants.RIGHT);

		/*
		 * The combo box for location choices, which is filled by the
		 * comHandler, called from graphEditor.GraphEditorPanel2.initialise();
		 */
		locationComboBox = new JComboBox();

		newLocationButton = new JButton("New Care Setting");
		newLocationButton.setAction(new EditorActions.AddLocationDialogAction(careProcessEditor, careProcess));
		newLocationButton.setText("New Care Setting");
		newLocationButton.setToolTipText("Define a new care setting");

		JLabel lblDescription = new JLabel("Description:");

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane)
						.addComponent(lblDescription)
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblAssociatedLocation, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblActivityName, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
							.addGap(16)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(locationComboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(newLocationButton))
								.addComponent(activityNameTextField, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblActivityName)
						.addComponent(activityNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAssociatedLocation)
						.addComponent(locationComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(newLocationButton))
					.addGap(18)
					.addComponent(lblDescription)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
					.addContainerGap())
		);

		
		descriptionEditorPane = new JEditorPane();
		scrollPane.setViewportView(descriptionEditorPane);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

		
	}

	public void changeActivation(boolean active) {
		newLocationButton.setEnabled(active);

		activityNameTextField.setEnabled(active);
		activityNameTextField.setText(null);

		descriptionEditorPane.setEnabled(active);
		descriptionEditorPane.setText(null);

		locationComboBox.setEnabled(active);
		locationComboBox.setSelectedItem(null);

		this.getParent().setEnabled(active);
	}

	public JEditorPane getDescriptionEditorPane() {
		return descriptionEditorPane;
	}

	public JComboBox getLocationComboBox() {
		return locationComboBox;
	}

	public JButton getNewLocationButton() {
		return newLocationButton;
	}

	public JTextField getActivityNameTextField() {
		return activityNameTextField;
	}



}
