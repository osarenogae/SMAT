package graphEditor;

import java.awt.Point;
import java.awt.event.MouseEvent;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxConnectionHandler;

import careProcess_model.Activity;
import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.Decision;
import careProcess_model.Stop;
import graphEditor.CustomGraphComponent.EditMode;

public class CutsomConnectionHandler extends mxConnectionHandler {

	EditMode mode = EditMode.ACTIVITY;
	CustomGraphComponent component;
	CareProcess careProcess;
	CellStepConnector cellStepConnector;

	public CutsomConnectionHandler(CustomGraphComponent graphComponent, EditMode m, CareProcess careProcessIn,
			CellStepConnector csc) {
		super(graphComponent);
		component = graphComponent;
		mode = m;
		careProcess = careProcessIn;
		cellStepConnector = csc;
	}

	/**
	 * Drag and drop to create new cells, the type of which depends on the
	 * current EditMode of the CustomGraphComponent passed into this
	 * CustomConnectionHandler instance.
	 */
	@Override
	public Object createTargetVertex(MouseEvent e, Object source) {
		Object clone = super.createTargetVertex(e, source);
		((mxCell) clone).setValue(null);
		((mxCell)clone).setId(EcoreUtil.generateUUID());
		mxGeometry g = ((mxCell) clone).getGeometry();
		Point pos = roundToGridSize(e.getX() - GraphEditorPanel2.activityBlockWidth / 2,
				e.getY() - GraphEditorPanel2.activityBlockHeight / 2);
		switch (component.getEditMode()) {
		case ACTIVITY:
			((mxCell) clone).setGeometry(new mxGeometry(pos.x, pos.y, GraphEditorPanel2.activityBlockWidth,
					GraphEditorPanel2.activityBlockHeight));
			((mxCell) clone).setStyle(CustomGraphComponent.STYLE_ACTIVITY);
			Activity activity = CareProcess_modelFactory.eINSTANCE.createActivity();
			activity.setProcessGraph(
					((CutsomConnectionHandler) component.getConnectionHandler()).getCareProcess().getProcessGraph());
			component.getCellStepConnector().putNodeObjectMap((mxCell) clone, activity);
			break;
		case DECISION:
			((mxCell) clone).setGeometry(new mxGeometry(pos.x, pos.y, GraphEditorPanel2.activityBlockWidth,
					GraphEditorPanel2.activityBlockHeight));
			((mxCell) clone).setStyle(CustomGraphComponent.STYLE_DECISION);
			Decision decision = CareProcess_modelFactory.eINSTANCE.createDecision();
			decision.setProcessGraph(
					((CutsomConnectionHandler) component.getConnectionHandler()).getCareProcess().getProcessGraph());
			component.getCellStepConnector().putNodeObjectMap((mxCell) clone, decision);
			break;
		case STOP:
			Point posStop = roundToGridSize(e.getX() - GraphEditorPanel2.startBlockSize / 2,
					(int) e.getY() - GraphEditorPanel2.startBlockSize / 2);
			((mxCell) clone).setGeometry(new mxGeometry(posStop.x, posStop.y, GraphEditorPanel2.startBlockSize,
					GraphEditorPanel2.startBlockSize));
			((mxCell) clone).setStyle(CustomGraphComponent.STYLE_STOP);
			Stop stop = CareProcess_modelFactory.eINSTANCE.createStop();
			stop.setProcessGraph(
					((CutsomConnectionHandler) component.getConnectionHandler()).getCareProcess().getProcessGraph());
			component.getCellStepConnector().putNodeObjectMap((mxCell) clone, stop);
			break;
		default:
			break;
		}
		return clone;
	}

	public CareProcess getCareProcess() {
		return careProcess;
	}

	private Point roundToGridSize(double x, double y) {
		double gridSize = component.getGraph().getGridSize();
		if (x % gridSize >= gridSize / 2) {
			x = x + (gridSize) - (x % gridSize);
		} else {
			x = x - (x % gridSize);
		}
		if (y % gridSize >= gridSize / 2) {
			y = y + (gridSize) - (y % gridSize);
		} else {
			y = y - (y % gridSize);
		}
		return new Point((int) x, (int) y);
	}
}
