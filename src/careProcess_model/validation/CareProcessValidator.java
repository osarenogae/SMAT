/**
 *
 * $Id$
 */
package careProcess_model.validation;

import careProcess_model.Project;
import careProcess_model.processGraph;

/**
 * A sample validator interface for {@link careProcess_model.CareProcess}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CareProcessValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateProcessGraph(processGraph value);
	boolean validateProject(Project value);
	boolean validateDescription(String value);
}
