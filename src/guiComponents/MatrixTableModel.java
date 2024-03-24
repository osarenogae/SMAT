package guiComponents;

import javax.swing.table.DefaultTableModel;

/**
 * A custom table model for use with the Risk Matrix table. Just restricts cell
 * editing no no cells are editable.
 */
public class MatrixTableModel extends DefaultTableModel {

	public MatrixTableModel(Object[][] tableContent, Object[] labels) {
		super(tableContent, labels);
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}
}
