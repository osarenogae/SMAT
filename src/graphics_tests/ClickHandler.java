package graphics_tests;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;

import javax.swing.JFrame;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;

public class ClickHandler extends JFrame
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2764911804288120883L;

	public ClickHandler()
	{
		super("Hello, World!");
		
		final mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		//graph.setAllowDanglingEdges(false);
		//graph.setCellsMovable(false);
		//graph.setCellsResizable(false);
		//graph.setEdgeLabelsMovable(false);
		graph.setCellsLocked(true);
		
		mxStylesheet stylesheet = graph.getStylesheet();
		Hashtable<String, Object> style = new Hashtable<String, Object>();
		style.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_RHOMBUS);
		style.put(mxConstants.STYLE_FONTSIZE, 12);
		style.put(mxConstants.STYLE_FILLCOLOR, "#FFFC81");
		style.put(mxConstants.STYLE_STROKECOLOR, "#FFFC81");
		style.put(mxConstants.STYLE_STROKEWIDTH, 0);
		
		style.put(mxConstants.STYLE_FONTCOLOR, "#000000");
		stylesheet.putCellStyle("DECISION", style);
	
		
		graph.getModel().beginUpdate();
		try
		{		
			
			
			//mxCell pool = (mxCell)graph.insertVertex(parent, null, "", 0, 0, 350, 200, null);
			//mxCell swimLane1 = (mxCell)graph.insertVertex(pool, null, "Swimlane 1", 0, 0, 350, 200, null);
			//mxCell swimLane2 = (mxCell)graph.insertVertex(pool, null, "Swimlane 2", 0, 0, 350, 200, null);
			
		   Object v1 = graph.insertVertex(parent, null, "Go home?", 0, 20, 80,
		         30, "DECISION");
		   Object v2 = graph.insertVertex(parent, null, "World!",
		         110, 150, 80, 30);
		   Object v3 = graph.insertVertex(parent, null, "Oh...",
			         410, 150, 80, 30);
		   graph.insertEdge(parent, null, "Edge", v1, v2);
		
		   
		}
		finally
		{
		   graph.getModel().endUpdate();
		}
	
		
		final mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
		
		graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
		{
		
			public void mouseReleased(MouseEvent e)
			{
				Object cell = graphComponent.getCellAt(e.getX(), e.getY());
				
				
				if (cell != null)
				{
					System.out.println("cell="+graph.getLabel(cell));
				}
			}
		});
	}

	public static void main(String[] args)
	{
		ClickHandler frame = new ClickHandler();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 320);
		frame.setVisible(true);
	}

}
