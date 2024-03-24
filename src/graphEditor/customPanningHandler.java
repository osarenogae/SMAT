package graphEditor;

import java.awt.event.MouseEvent;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxPanningHandler;

public class customPanningHandler extends mxPanningHandler {

	public customPanningHandler(mxGraphComponent graphComponent) {
		super(graphComponent);
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		if (!e.isConsumed() && graphComponent.isPanningEvent(e)
				&& !e.isPopupTrigger())
		{
			start = e.getPoint();
		}
	}

}
