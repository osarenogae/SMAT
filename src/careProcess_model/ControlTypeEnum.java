/**
 */
package careProcess_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see careProcess_model.CareProcess_modelPackage#getControlTypeEnum()
 * @model
 * @generated
 */
public enum ControlTypeEnum implements Enumerator {
	/**
	 * The '<em><b>DESIGN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESIGN_VALUE
	 * @generated
	 * @ordered
	 */
	DESIGN(1, "DESIGN", "Design"), /**
	 * The '<em><b>TEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_VALUE
	 * @generated
	 * @ordered
	 */
	TEST(2, "TEST", "Test"), /**
	 * The '<em><b>TRAINING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAINING_VALUE
	 * @generated
	 * @ordered
	 */
	TRAINING(3, "TRAINING", "Training"), /**
	 * The '<em><b>BUSINESS PROCESS CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_PROCESS_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	BUSINESS_PROCESS_CHANGE(4, "BUSINESS_PROCESS_CHANGE", "Business Process Change");

	/**
	 * The '<em><b>DESIGN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DESIGN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESIGN
	 * @model literal="Design"
	 * @generated
	 * @ordered
	 */
	public static final int DESIGN_VALUE = 1;

	/**
	 * The '<em><b>TEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST
	 * @model literal="Test"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_VALUE = 2;

	/**
	 * The '<em><b>TRAINING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAINING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAINING
	 * @model literal="Training"
	 * @generated
	 * @ordered
	 */
	public static final int TRAINING_VALUE = 3;

	/**
	 * The '<em><b>BUSINESS PROCESS CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSINESS PROCESS CHANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSINESS_PROCESS_CHANGE
	 * @model literal="Business Process Change"
	 * @generated
	 * @ordered
	 */
	public static final int BUSINESS_PROCESS_CHANGE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Control Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlTypeEnum[] VALUES_ARRAY =
		new ControlTypeEnum[] {
			DESIGN,
			TEST,
			TRAINING,
			BUSINESS_PROCESS_CHANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Type Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Type Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlTypeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlTypeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlTypeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlTypeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Type Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlTypeEnum get(int value) {
		switch (value) {
			case DESIGN_VALUE: return DESIGN;
			case TEST_VALUE: return TEST;
			case TRAINING_VALUE: return TRAINING;
			case BUSINESS_PROCESS_CHANGE_VALUE: return BUSINESS_PROCESS_CHANGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ControlTypeEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ControlTypeEnum
