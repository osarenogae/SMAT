/**
 *
 * $Id$
 */
package careProcess_model.validation;

import careProcess_model.Step;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link careProcess_model.LocationDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LocationDefinitionValidator {
	boolean validate();

	boolean validateLocationName(String value);
	boolean validateMnemonicName(String value);
	boolean validateSteps(EList<Step> value);
	boolean validateDescription(String value);
}
