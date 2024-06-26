/**
 *
 * $Id$
 */
package RiskMatrixModel.validation;

import RiskMatrixModel.LikelihoodLevel;
import RiskMatrixModel.RiskRatingInstance;
import RiskMatrixModel.SeverityLevel;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link RiskMatrixModel.RiskMatrix}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RiskMatrixValidator {
	boolean validate();

	boolean validateLikelihoodlevel(EList<LikelihoodLevel> value);
	boolean validateRiskratinginstance(EList<RiskRatingInstance> value);
	boolean validateSeveritylevel(EList<SeverityLevel> value);

	boolean validateMinUnacceptableRisk(int value);
}
