package dialogs;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

import org.eclipse.emf.ecore.util.EcoreUtil;

import careProcess_model.CareProcess;
import careProcess_model.HazardInstance;
import careProcess_model.LocationDefinition;
import careProcess_model.Project;
import careProcess_model.Step;
import careProcess_model.SystemFunction;

public class CareProcessExplorerDialog_Worker {
	private JList listView;
	private Project project;

	public CareProcessExplorerDialog_Worker(Project p, JList careProcessList) {
		project = p;
		listView = careProcessList;
	}

	/**
	 * Fill the list with all the care process instances
	 */
	public void populateCareProcessList() {
		DefaultListModel lm = new DefaultListModel();
		Iterator<CareProcess> careProcessIterator = project.getCareProcesses().iterator();
		while (careProcessIterator.hasNext()) {
			CareProcess c = careProcessIterator.next();
			lm.addElement(c);
		}
		listView.setModel(lm);
	}

	/**
	 * Get the first of the selected care processes in the list.
	 * 
	 * @return the first selected care process, or null if none is selected.
	 */
	public CareProcess getSelectedCareProcess() {
		return (CareProcess) listView.getSelectedValue();
	}

	public int confirmDialog(String message, String title, Component parent) {
		int result = JOptionPane.showConfirmDialog(parent, message, title, JOptionPane.YES_NO_OPTION);
		return result;
	}

	public void deleteCareProcess(CareProcess c) {

		Object[] steps = c.getProcessGraph().getStep().toArray();
		for (Object s : steps) {
			deleteStep((Step) s);
		}

		c.getProject().getCareProcesses().remove(c);
		EcoreUtil.delete(c);
	}

	private static void deleteStep(Step s) {
		ArrayList<SystemFunction> functionRemovalList = new ArrayList<SystemFunction>();
		ArrayList<HazardInstance> hazardInstanceRemovalList = new ArrayList<HazardInstance>();

		Iterator<SystemFunction> associatedFunctions = s.getAssociatedSystemFunctions().iterator();
		while (associatedFunctions.hasNext()) {
			SystemFunction f = associatedFunctions.next();
			functionRemovalList.add(f);
		}
		Iterator<HazardInstance> associatedHazardInstances = s.getHazardInstances().iterator();
		while (associatedHazardInstances.hasNext()) {
			HazardInstance h = associatedHazardInstances.next();
			hazardInstanceRemovalList.add(h);
		}

		for (SystemFunction sf : functionRemovalList) {
			sf.getAssociatedSteps().remove(s);
		}
		for (HazardInstance hi : hazardInstanceRemovalList) {
			hi.setStep(null);
		}
		if (s.getLocation() != null) {
			s.getLocation().getSteps().remove(s);
		}
		EcoreUtil.delete(s);
	}

}
