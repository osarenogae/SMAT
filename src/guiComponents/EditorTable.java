package guiComponents;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.util.EventObject;

import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.text.JTextComponent;

public class EditorTable extends JTable {
	
	private int previousRow = -1;
	private int selectedRow = -1;
	/**
	 * Override editCellAt to select all cell contents whenever editing begins.
	 */
	@Override
	public boolean editCellAt(int row, int column, EventObject e) {
		previousRow = selectedRow;
		selectedRow = row;
		boolean result = super.editCellAt(row, column, e);
		final Component editor = getEditorComponent();
		if (editor == null || !(editor instanceof JTextComponent)) {
			return result;
		}
		if (e instanceof MouseEvent) {
			EventQueue.invokeLater(new Runnable() {

				@Override
				public void run() {
					((JTextComponent) editor).selectAll();
				}
			});
		} else {
			((JTextComponent) editor).selectAll();
		}
		return result;
	}
	

	/**
	 * Enter cell editing mode whenever a cell is selected
	 */
	@Override
	public void changeSelection(int row, int column, boolean toggle, boolean extend) {

		previousRow = selectedRow;
		selectedRow = row;
		
		super.changeSelection(row, column, toggle, extend);
		if (editCellAt(row, column)) {
			Component editor = getEditorComponent();
			editor.requestFocusInWindow();
		}

	}
	

	public int getPreviousRow(){
		return previousRow;
	}
}
