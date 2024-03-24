package graphEditor;

import java.awt.Color;
import java.awt.Point;
import java.util.Hashtable;

import org.w3c.dom.Document;

import com.mxgraph.io.mxCodec;
import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.swing.handler.mxConnectionHandler;
import com.mxgraph.swing.handler.mxPanningHandler;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;

import careProcess_model.CareProcess;

/**
 * A customised mxGraphComponent allowing use of a custom panning handler
 */
public class CustomGraphComponent2 extends mxGraphComponent {

		public CustomGraphComponent2(mxGraph graph) {
			super(graph);
		}
		
		protected mxPanningHandler createPanningHandler()
		{
			return new customPanningHandler(this);
		}

	
}
