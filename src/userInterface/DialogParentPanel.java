package userInterface;

/**
 * Defines the methods that should be implemented by any JPanel that has
 * components whose data depends upon interaction with a dialog box.
 * <p>
 * When the dialog box is closed, the "refresh" method of a DialogParentPanel
 * should be called, to allow that element to repopulate any data panels that
 * may have been changed.
 *
 */
public interface DialogParentPanel {
	public void refresh();
}
