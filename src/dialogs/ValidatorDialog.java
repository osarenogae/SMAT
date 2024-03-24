package dialogs;

import java.awt.Color;
import java.awt.Dialog;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

import utilities.DataHelper;

/**
 * An extension of JDialog which takes an array of text fields and an array of
 * buttons and deactivated the buttons if the text fields are empty.
 *
 */
public class ValidatorDialog extends JDialog {

	private JTextComponent[] nonEmptyFields;
	private JButton[] conditionallyInactiveButtons;
	
	private ArrayList<Border> borders;

	public ValidatorDialog(JTextComponent[] nonEmptyFieldsIn, JButton[] conditionallyInactiveButtonsIn) {
		//Make sure the dialog stays on top and is centred in the screen.
		this.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
		
		nonEmptyFields = nonEmptyFieldsIn;
		conditionallyInactiveButtons = conditionallyInactiveButtonsIn;
		TextFieldEditLstener listener = new TextFieldEditLstener();
		borders = new ArrayList<Border>();
		for (JTextComponent t : nonEmptyFields) {
			borders.add(t.getBorder());
			t.getDocument().addDocumentListener(listener);
		}
		validateTextFields();
	}

	public void validateTextFields() {
		boolean buttonsActive = true;
		for (int i=0; i<nonEmptyFields.length; i++) {
			JTextComponent t = nonEmptyFields[i];
			if (DataHelper.isStringEmpty(t.getText())) {
				t.setBorder(BorderFactory.createLineBorder(Color.RED));
				buttonsActive = false;
				deactivateButtons();
			}else{
				t.setBorder(borders.get(i));
			}
		}
		
		if(buttonsActive==false){
			deactivateButtons();
		}else{
			activateButtons();
		}
		
		
	}

	private void deactivateButtons() {
		for (JButton b : conditionallyInactiveButtons) {
			b.validate();
			b.setEnabled(false);
		}
	}

	private void activateButtons() {
		for (JButton b : conditionallyInactiveButtons) {
			b.setEnabled(true);
		}
	}

	private class TextFieldEditLstener implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent arg0) {}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			validateTextFields();

		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			validateTextFields();
		}

	}

}
