/**
 */
package careProcess_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control State Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see careProcess_model.CareProcess_modelPackage#getControlStateEnum()
 * @model
 * @generated
 */
public enum ControlStateEnum implements Enumerator {
	/**
	 * The '<em><b>EXISTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTING_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTING(0, "EXISTING", "Existing"),

	/**
	 * The '<em><b>ADDITIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL(1, "ADDITIONAL", "Additional");

	/**
	 * The '<em><b>EXISTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXISTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXISTING
	 * @model literal="Existing"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTING_VALUE = 0;

	/**
	 * The '<em><b>ADDITIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADDITIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL
	 * @model literal="Additional"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Control State Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlStateEnum[] VALUES_ARRAY =
		new ControlStateEnum[] {
			EXISTING,
			ADDITIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Control State Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlStateEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control State Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlStateEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlStateEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control State Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlStateEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlStateEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control State Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlStateEnum get(int value) {
		switch (value) {
			case EXISTING_VALUE: return EXISTING;
			case ADDITIONAL_VALUE: return ADDITIONAL;
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
	private ControlStateEnum(int value, String name, String literal) {
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
	
} //ControlStateEnum
