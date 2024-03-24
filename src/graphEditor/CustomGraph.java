package graphEditor;

import com.mxgraph.model.mxCell;
import com.mxgraph.view.mxGraph;

import careProcess_model.Step;

public class CustomGraph extends mxGraph {

	@Override
	public boolean isCellEditable(Object cell) {
		return !getModel().isVertex(cell);
	}

	@Override
	public String convertValueToString(Object cell) {
		if (cell instanceof mxCell) {
			Object value = ((mxCell) cell).getValue();
			if (value instanceof Step) {
				String name = ((Step) ((mxCell) cell).getValue()).getName();
				if (name != null) {
					if (name.length() != 0) {
						return name;
					} else {
						return "...";
					}
				} else {
					return "...";
				}
			}
		}
		return super.convertValueToString(cell);
	}

}
