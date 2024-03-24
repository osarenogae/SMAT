/**
 *
 * $Id$
 */
package careProcess_model.validation;

import careProcess_model.HazardCause;
import careProcess_model.HazardDefinition;
import careProcess_model.HazardEffect;
import careProcess_model.Step;
import careProcess_model.SystemFunction;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link careProcess_model.HazardInstance}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HazardInstanceValidator {
	boolean validate();

	boolean validateInitialLikelihood(int value);
	boolean validateInitialSeverity(int value);
	boolean validateStep(Step value);
	boolean validateHazardDefinition(HazardDefinition value);
	boolean validateStatus(String value);
	boolean validateSystemFunction(SystemFunction value);
	boolean validateResidualLikelihood(int value);
	boolean validateResidualSeverity(int value);
	boolean validateInitialRiskRating(int value);
	boolean validateResidualRiskRating(int value);
	boolean validateDescription(String value);
	boolean validateOwner(String value);
	boolean validateSummary(String value);
	boolean validateHazardcauses(EList<HazardCause> value);
	boolean validateHazardeffects(EList<HazardEffect> value);
	boolean validateClinicalJustification(String value);
	boolean validateName(String value);
}