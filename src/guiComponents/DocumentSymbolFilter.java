package guiComponents;

import java.awt.Toolkit;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 * A document filter which will reject certain characters which, if used in
 * attribute values, could disrupt the EMF parser when loading/saving the
 * serialised forms of the data objects with those attributes.
 */
public class DocumentSymbolFilter extends DocumentFilter {

	public void insertString(FilterBypass fb, int offs, String str, AttributeSet a) throws BadLocationException {
		if (str != null) {
			// regex specifying that any word-character (letter or number) or
			// whitespace character is acceptable.
			if (str.matches("[^\\@/&%\"\'^]")) {
				super.insertString(fb, offs, str, a);
			} else {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}

	public void replace(FilterBypass fb, int offs, int length, String str, AttributeSet a) throws BadLocationException {
		if (str != null) {
			if (str.matches("[^\\@/&%\"\'^]")) {
				super.replace(fb, offs, length, str, a);
			} else {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
}
