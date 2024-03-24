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

public class CustomGraphComponent extends mxGraphComponent {
	
	
	public static final String STYLE_DECISION = "style.decision";
	public static final String STYLE_ACTIVITY = "style.activity";
	public static final String STYLE_START = "style.start";
	public static final String STYLE_STOP = "style.stop";
	
	private EditMode mode = EditMode.ACTIVITY;
	
	CareProcess careProcess;
	CellStepConnector cellStepConnector;

		/**
		 * 
		 * @param graph
		 */
		public CustomGraphComponent(mxGraph graph, CareProcess careProcessIn, CellStepConnector csc)
		{
			super(graph);
			
			careProcess = careProcessIn;
			cellStepConnector = csc;
			
			// Setting up the general properties of the editor
			//setPageVisible(true);
			graph.setAllowDanglingEdges(false);
			//graph.setCellsEditable(false);
			
			initialiseGraphStyles(graph);
			setGridVisible(true);
			
			setToolTips(true);//TODO Add the tooltips
			getConnectionHandler().setCreateTarget(true);//Set to create a new vertex on drag.
			
			// Set the background to white
			getViewport().setOpaque(true);
			getViewport().setBackground(Color.WHITE);

			//Re-define the handlers with the new constructor data
			createHandlers();
		}



		/**
		 * 
		 */
		protected mxConnectionHandler createConnectionHandler()
		{
			return new CutsomConnectionHandler(this, EditMode.ACTIVITY, careProcess, cellStepConnector);
		}
		
		/**
		 * Overrides drop behaviour to set the cell style if the target
		 * is not a valid drop target and the cells are of the same
		 * type (eg. both vertices or both edges). 
		 */
		public Object[] importCells(Object[] cells, double dx, double dy,
				Object target, Point location)
		{
			if (target == null && cells.length == 1 && location != null)
			{
				target = getCellAt(location.x, location.y);

				if (target instanceof mxICell && cells[0] instanceof mxICell)
				{
					mxICell targetCell = (mxICell) target;
					mxICell dropCell = (mxICell) cells[0];

					if (targetCell.isVertex() == dropCell.isVertex()
							|| targetCell.isEdge() == dropCell.isEdge())
					{
						mxIGraphModel model = graph.getModel();
						model.setStyle(target, model.getStyle(cells[0]));
						graph.setSelectionCell(target);

						return null;
					}
				}
			}

			return super.importCells(cells, dx, dy, target, location);
		}

		
		private void initialiseGraphStyles(mxGraph graphIn) {
			mxStylesheet stylesheet = graphIn.getStylesheet();

			Hashtable<String, Object> decisionStyle = new Hashtable<String, Object>();
			decisionStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RHOMBUS);
			decisionStyle.put(mxConstants.STYLE_FONTSIZE, 12);
			decisionStyle.put(mxConstants.STYLE_FILLCOLOR, "#FFFC81");
			decisionStyle.put(mxConstants.STYLE_STROKECOLOR, "#eeeb70");
			decisionStyle.put(mxConstants.STYLE_STROKEWIDTH, 2);
			decisionStyle.put(mxConstants.STYLE_FONTCOLOR, "#000000");
			decisionStyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
			decisionStyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
			stylesheet.putCellStyle(STYLE_DECISION, decisionStyle);
			
			Hashtable<String, Object> activityStyle = new Hashtable<String, Object>();
			activityStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RECTANGLE);
			activityStyle.put(mxConstants.STYLE_FONTSIZE, 12);
			activityStyle.put(mxConstants.STYLE_FILLCOLOR, "#5C96CD");
			activityStyle.put(mxConstants.STYLE_STROKECOLOR, "#5C96CD");
			activityStyle.put(mxConstants.STYLE_STROKEWIDTH, 0);
			activityStyle.put(mxConstants.STYLE_FONTCOLOR, "#000000");
			activityStyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
			activityStyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
			stylesheet.putCellStyle(STYLE_ACTIVITY, activityStyle);

			Hashtable<String, Object> startStyle = new Hashtable<String, Object>();
			startStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
			startStyle.put(mxConstants.STYLE_NOLABEL, true);
			startStyle.put(mxConstants.STYLE_FILL_OPACITY, 0);
			startStyle.put(mxConstants.STYLE_FILLCOLOR, "#FFFFFF");
			startStyle.put(mxConstants.STYLE_STROKECOLOR, "#323232");
			startStyle.put(mxConstants.STYLE_STROKEWIDTH, 5);
			startStyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
			startStyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
			stylesheet.putCellStyle(STYLE_START, startStyle);
			
			Hashtable<String, Object> stopStyle = new Hashtable<String, Object>();
			stopStyle.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
			stopStyle.put(mxConstants.STYLE_NOLABEL, true);
			stopStyle.put(mxConstants.STYLE_FILL_OPACITY, 0);
			stopStyle.put(mxConstants.STYLE_FILLCOLOR, "#323232");
			stopStyle.put(mxConstants.STYLE_STROKECOLOR, "#323232");
			stopStyle.put(mxConstants.STYLE_STROKEWIDTH, 5);
			stopStyle.put(mxConstants.STYLE_WHITE_SPACE, "wrap");
			stopStyle.put(mxConstants.STYLE_OVERFLOW, "hidden");
			stylesheet.putCellStyle(STYLE_STOP, stopStyle);

		}
		
		public EditMode getEditMode(){
			return mode;
		}
		public void setEditMode(EditMode m){
			mode = m;
		}
		
		public CellStepConnector getCellStepConnector(){
			return cellStepConnector;
		}
		public enum EditMode {
			ACTIVITY, DECISION, STOP;
		}
	
}
