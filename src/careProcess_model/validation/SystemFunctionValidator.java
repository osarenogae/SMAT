/**
 *
 * $Id$
 */
package careProcess_model.validation;

import careProcess_model.HazardInstance;
import careProcess_model.Step;
import careProcess_model.SystemDefinition;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link careProcess_model.SystemFunction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SystemFunctionValidator {
	boolean validate();

	boolean validateHazardInstances(EList<HazardInstance> value);
	boolean validateSystemDefinition(SystemDefinition value);
	boolean validateFunctionName(String value);
	boolean validateDescription(String value);
	boolean validateAssociatedSteps(EList<Step> value);
}