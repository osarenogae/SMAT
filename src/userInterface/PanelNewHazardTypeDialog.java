package userInterface;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;

/**
 * The panel used in the new hazard type dialog, containing hazard name and description text fields.
 *
 */
public class PanelNewHazardTypeDialog extends JPanel {
	private JTextField hazardNameTextField;
	private JTextPane hazardDescriptionTextPane;

	/**
	 * Create the panel.
	 */
	public PanelNewHazardTypeDialog() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Hazard Name");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel label_1 = new JLabel("Description");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JScrollPane scrollPane = new JScrollPane();
		
		hazardNameTextField = new JTextField();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 448, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
						.addComponent(hazardNameTextField, GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 163, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(hazardNameTextField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		hazardDescriptionTextPane = new JTextPane();
		scrollPane.setViewportView(hazardDescriptionTextPane);
		panel.setLayout(gl_panel);
		add(panel);

	}
	public JTextPane getHazardDescriptionTextPane() {
		return hazardDescriptionTextPane;
	}
	public JTextField getHazardNameTextField() {
		return hazardNameTextField;
	}
}
