package userInterface;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import org.eclipse.emf.ecore.util.EcoreUtil;

import careProcess_model.HazardDefinition;
import careProcess_model.HazardInstance;
import careProcess_model.HazardRepository;
import careProcess_model.Step;
import careProcess_model.SystemFunction;

/**
 * A collection of standard utilities common to the 'Worker' classes. Note:
 * Several of the methods of the Worker classes could be moved here in a more
 * general form to improve reusability.
 */
public class WorkerUtilities {

	/**
	 * Attempts to find the node path of the element of the tree with the given
	 * root whose user object is the input object.
	 * 
	 * @param root
	 *            The root node of the tree to search for the object.
	 * @param o
	 *            The user object associated with the node to be found.
	 */

	public static TreePath getNodePathByObject(DefaultMutableTreeNode root, Object o) {
		TreePath t = null;
		Enumeration<DefaultMutableTreeNode> e = root.depthFirstEnumeration();
		while (e.hasMoreElements()) {
			DefaultMutableTreeNode node = e.nextElement();
			if (node.getUserObject() != null) {
				if (o.equals(node.getUserObject())) {
					t = new TreePath(node.getPath());
					break;
				}
			}
		}
		return t;

	}

	/**
	 * Fully remove the given hazard instance from the parent hazard definition
	 * and repository.
	 * 
	 * @param hd
	 *            The parent hazard definition from which to remove the
	 *            instance.
	 * @param hi
	 *            The instance to remove.
	 * @param hr
	 *            The parent hazard repository from which to remove the
	 *            instance.
	 */
	public static void removeHazardInstance(HazardDefinition hd, HazardInstance hi, HazardRepository hr) {
		hr.getHazardInstances().remove(hi);
		hi.getStep().getHazardInstances().remove(hi);
		hi.getSystemFunction().getHazardInstances().remove(hi);
		hd.getHazardInstances().remove(hi);
	}

	/**
	 * Remove a system function from all other objects which make reference to
	 * it, and delete the object representing the function
	 * 
	 * @param sf
	 * The system function to be deleted
	 */
	public static void removeSystemFunction(SystemFunction sf) {
		ArrayList<Step> stepRemovalList = new ArrayList<Step>();
		ArrayList<HazardInstance> hazardInstanceRemovalList = new ArrayList<HazardInstance>();

		Iterator<Step> stepIterator = sf.getAssociatedSteps().iterator();
		while (stepIterator.hasNext()) {
			Step s = stepIterator.next();
			stepRemovalList.add(s);
		}

		Iterator<HazardInstance> hazardInstanceIterator = sf.getHazardInstances().iterator();
		while (hazardInstanceIterator.hasNext()) {
			HazardInstance h = hazardInstanceIterator.next();
			hazardInstanceRemovalList.add(h);
		}

		for (Step s : stepRemovalList) {
			s.getAssociatedSystemFunctions().remove(sf);
		}
		for (HazardInstance h : hazardInstanceRemovalList) {
			h.setSystemFunction(null);
		}
		EcoreUtil.delete(sf);
	}

	/**
	 * Show a warning dialog with the given title and message.
	 * 
	 * @param title
	 * @param message
	 */
	public static void showWarningDialog(String title, String message, Component parent) {
		JOptionPane.showMessageDialog(parent, message, title, JOptionPane.WARNING_MESSAGE);
	}
}
