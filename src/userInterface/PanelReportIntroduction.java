package userInterface;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

/**
 * Part of the report editor, contains the editor fields for the introduction section.
 *
 */
public class PanelReportIntroduction extends JPanel {
	private JTextArea introTextArea;
	private JTextField titleTextField;

	/**
	 * Create the panel.
	 */
	public PanelReportIntroduction() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel introPanel = new JPanel();
		add(introPanel);
		
		JScrollPane scrollPane = new JScrollPane();
		
		introTextArea = new JTextArea();
		introTextArea.setLineWrap(true);
		introTextArea.setWrapStyleWord(true);
		scrollPane.setViewportView(introTextArea);
		
		titleTextField = new JTextField();
		titleTextField.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title");
		lblTitle.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel lblIntroduction = new JLabel("Introduction");
		lblIntroduction.setHorizontalAlignment(SwingConstants.RIGHT);
		GroupLayout gl_introPanel = new GroupLayout(introPanel);
		gl_introPanel.setHorizontalGroup(
			gl_introPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_introPanel.createSequentialGroup()
					.addGroup(gl_introPanel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblIntroduction, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(lblTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_introPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
						.addComponent(titleTextField, GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_introPanel.setVerticalGroup(
			gl_introPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_introPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_introPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(titleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitle))
					.addGap(18)
					.addGroup(gl_introPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(lblIntroduction))
					.addContainerGap())
		);
		introPanel.setLayout(gl_introPanel);

	}

	public JTextArea getIntroTextArea() {
		return introTextArea;
	}
	public JTextField getTitleTextField() {
		return titleTextField;
	}
}
