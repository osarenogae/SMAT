package userInterface;

public interface EditorView {

	/**
	 * The method to be called whenever the implementing view is "closed" - in
	 * the current implementation, this is when the card representing the view
	 * loses visibility.
	 * <p>
	 * Returns a boolean to indicate whether the view should be closed yet. For
	 * example, we could use this to stop the view being closed when it contains
	 * unsaved work.
	 * 
	 * @return true if the view is ready to close, false otherwise.
	 */
	public boolean tryCloseView();

	/**
	 * To be called when the user has confirmed that they want to save whatever
	 * is being edited and close the view. 
	 * <p>
	 * In the current implementation, it is called after the MainAppWindow
	 * displays the confirm close view dialog box and the user selects "yes".
	 * 
	 * @return true if the view is OK to close, false if it shouldn't
	 */
	public boolean saveAndClose();
	
	/**
	 * Save whatever data in the view we need to store.
	 */
	public void save();

}
