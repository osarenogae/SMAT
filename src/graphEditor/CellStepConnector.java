package graphEditor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.eclipse.emf.ecore.EObject;

import com.mxgraph.model.mxCell;

import careProcess_model.CareProcess;
import careProcess_model.CareProcess_modelFactory;
import careProcess_model.DataStore;
import careProcess_model.Project;
import careProcess_model.Step;

public class CellStepConnector {

	public static Hashtable<String, String> dataMapTable = new Hashtable<String, String>();
	public static Hashtable<String, Step> UUIDtoStepMapTable = new Hashtable<String, Step>();

	/**
	 * Create an association between the ID of a cell and the UUID of a Step
	 * object
	 * <p>
	 * The step object may be a StartImpl, StopImpl, ActivityImpl or
	 * DecisionImpl object. The cell is part of the JGraphx graph. The step is
	 * part of the data model.
	 * 
	 * @param cell
	 * @param step
	 */
	public void putNodeObjectMap(mxCell cell, Step step) {
		dataMapTable.put(cell.getId(), step.getUUID());
		UUIDtoStepMapTable.put(step.getUUID(), step);
	}
	public void putNodeObjectMap(String cellID, String stepID) {
		dataMapTable.put(cellID, stepID);
	}

	/**
	 * Get the step associated with a given cell ID string.
	 * 
	 * @param id
	 * @return the step associated with a given cell ID, or null if there is no such step.
	 */
	public Step getStepByAssociatedCellID(String id) {
		if (dataMapTable.get(id) != null) {
			return UUIDtoStepMapTable.get(dataMapTable.get(id));
		}
		return null;
	}
	
	/**
	 * Find the cell ID of the cell associated with the Step instance with the given UUID.
	 * @param UUID
	 * @return The ID of the associated cell
	 */
	public String getCellIDByAssociatedStepUUID(String UUID){
		Enumeration<String> dataKeys = dataMapTable.keys();
		while(dataKeys.hasMoreElements()){
			String k = dataKeys.nextElement();
			if(dataMapTable.get(k).equals(UUID)){
				return k;
			}
		}
		return null;
	}
		
	
	public String getSerialisedDataMapTable(){
		return dataMapTable.toString();
	}
	
	/**
	 * Convert the string form of the datamap table back into a HashTable.
	 * @param data
	 * 	The string form of the datamap table to be converted
	 */
	public void deserialiseDataMapTable(String data){
		ArrayList<String> equalsPairs = new ArrayList<String>();
		if(data!=null){
		  String listString = data.substring(1, data.length()-1);
		  StringTokenizer tokenizer = new StringTokenizer(listString, ",");
		  while(tokenizer.hasMoreTokens()) {
			  equalsPairs.add(tokenizer.nextToken().trim());
		  }
		  for(int i=0; i<equalsPairs.size(); i++){
		  int cutoff = equalsPairs.get(i).indexOf("=");
		  //System.out.println("Associated " + equalsPairs.get(i).substring(0,cutoff) + " with " + equalsPairs.get(i).substring(cutoff+1));
		  putNodeObjectMap(equalsPairs.get(i).substring(0,cutoff),equalsPairs.get(i).substring(cutoff+1));
		  }
		}
	}
	
	public void populateStepUUIDMapTable(Project p){
		Iterator<CareProcess> careProcessIterator = p.getCareProcesses().iterator();
		while(careProcessIterator.hasNext()){
			CareProcess c = careProcessIterator.next();
			Iterator<Step> stepIterator = c.getProcessGraph().getStep().iterator();
			while(stepIterator.hasNext()){
				Step s = stepIterator.next();
				UUIDtoStepMapTable.put(s.getUUID(), s);
				//System.out.println("Set mapping for " + s.getUUID()+ " to "+s);
			}
		}
	}
	
}
