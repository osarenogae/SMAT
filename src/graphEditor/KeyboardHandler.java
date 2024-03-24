package graphEditor;

import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxKeyboardHandler;
import com.mxgraph.swing.util.mxGraphActions;

public class KeyboardHandler extends mxKeyboardHandler {

	public KeyboardHandler(mxGraphComponent graphComponent) {
		super(graphComponent);
	}
	
	protected InputMap getInputMap(int condition)
	{
		InputMap map = super.getInputMap(condition);

		if (condition == JComponent.WHEN_FOCUSED && map != null)
		{
			map.put(KeyStroke.getKeyStroke("control Z"), GraphEditorPanel2.ACTION_ID_UNDO);
			map.put(KeyStroke.getKeyStroke("control Y"), GraphEditorPanel2.ACTION_ID_REDO);
			map.put(KeyStroke.getKeyStroke("DELETE"),  GraphEditorPanel2.ACTION_ID_DELETE);
		}

		return map;
	}
	
	protected ActionMap createActionMap()
	{
		ActionMap map = super.createActionMap();
		map.put(GraphEditorPanel2.ACTION_ID_UNDO, new EditorActions.HistoryAction(true));
		map.put(GraphEditorPanel2.ACTION_ID_REDO, new EditorActions.HistoryAction(false));
		map.put(GraphEditorPanel2.ACTION_ID_DELETE, new EditorActions.DeleteAction());

		System.out.println("REGISTERED ACTIONS");
		return map;
	}


}
