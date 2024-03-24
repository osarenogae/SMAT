package userInterface;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;

/**
 * The old table panel containing a non-functional example of the traditional
 * hazard log table.
 *
 */
public class PanelHazardLog extends JPanel {
	private JTable table;
	private JTable table_1;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Create the panel.
	 */
	public PanelHazardLog() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(scrollPane);

		panel = new JPanel();
		scrollPane.setRowHeaderView(panel);
		panel.setLayout(new BorderLayout(0, 0));

		table = new JTable();
		table.setFillsViewportHeight(true);
		panel.add(table);
		table.setModel(
				new DefaultTableModel(new Object[][] { { "1" }, { "2" }, { "3" }, }, new String[] { "Hazard Number" }));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(100);

		panel.add(table.getTableHeader(), BorderLayout.NORTH);

		panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		table_1 = new JTable();
		panel_1.add(table_1);
		table_1.setFillsViewportHeight(true);
		table_1.setModel(new DefaultTableModel(
				new Object[][] { { "Sample Hazard 1", "...", "...", "...", "...", "minor", "low", "1" },
						{ "Sample Hazard 2", "...", "...", "...", "...", "minor", "medium", "2" },
						{ "Sample Hazard 3", "...", "...", "...", "...", "significant", "low", "2" }, },
				new String[] { "Hazard Name", "Hazard Description", "Causes", "Effects", "Controls", "Severity",
						"Likelihood", "Risk Rating" }));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(122);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(110);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(52);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(54);
		table_1.getColumnModel().getColumn(4).setPreferredWidth(55);

		panel_1.add(table_1.getTableHeader(), BorderLayout.NORTH);

	}

}
