package guiComponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 * The (quickly put together) custom component class defining icon description
 * buttons, used in the project menus.
 * <p>
 * This version of the implementation extends JComponent, but it may be
 * advantageous to extend and override JButton instead, to get its layout and
 * mouse interaction properties.
 *
 */
public class IconDescriptionButton extends JComponent implements MouseListener {
	private boolean mouseOver = false;
	private boolean mouseDown = false;

	private static int default_icon_size = 64;
	int horizontalMargin = 16;
	BufferedImage img = null;
	String title;
	String description;

	private boolean topBorder = false;
	private boolean bottomBorder = true;
	private int textSize = 16;
	private int descriptionTextSize = 12;
	private Font titleFont = new Font(Font.SANS_SERIF, Font.PLAIN, textSize);
	private Font descriptionFont = new Font(Font.SANS_SERIF, Font.PLAIN, descriptionTextSize);;

	Action clickAction;

	/**
	 * Create a new icon descritpion button
	 * @param hasTopBorder
	 * flag whether the top border should be drawn or not
	 * @param hasBottomBorder
	 * flag whether the bottom border should be drawn or not
	 * @param url
	 * the url of the image resource to use as the icon
	 * @param titleIn
	 * The title for the button label
	 * @param descriptionIn
	 * The description for the button label
	 */
	public IconDescriptionButton(Boolean hasTopBorder, Boolean hasBottomBorder, URL url, String titleIn,
			String descriptionIn) {
		addMouseListener(this);
		title = titleIn;
		description = descriptionIn;
		topBorder = hasTopBorder;
		bottomBorder = hasBottomBorder;
		try {
			img = ImageIO.read(url);
		} catch (IOException e) {
			img = new BufferedImage(default_icon_size, default_icon_size, BufferedImage.TYPE_INT_RGB);
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if (!this.isEnabled()) {
			g2.setColor(Color.getHSBColor(0f, 0f, 0.95f));
			g2.fillRect(0, 0, getWidth(), getHeight());
		}
		if (mouseOver && !mouseDown) {
			if (this.isEnabled()) {
				g2.setColor(Color.getHSBColor(0.65f, 0.12f, 0.99f));
				g2.fillRect(0, 0, getWidth(), getHeight());
			}
		}
		if (mouseDown) {
			if (this.isEnabled()) {
				g2.setColor(Color.getHSBColor(0.65f, 0.15f, 0.90f));
				g2.fillRect(0, 0, getWidth(), getHeight());
			}
		}
		g2.drawImage(img, horizontalMargin, (getHeight() / 2) - img.getHeight() / 2, img.getWidth(), img.getHeight(),
				null);

		Rectangle2D titleBounds = titleFont.getStringBounds(title, g2.getFontRenderContext());
		Rectangle2D descriptionBounds = descriptionFont.getStringBounds(description, g2.getFontRenderContext());

		int textHeight = (int) (titleBounds.getHeight() + descriptionBounds.getHeight());
		int xPos = img.getWidth() + 10 + horizontalMargin;

		if (this.isEnabled()) {
			g2.setColor(Color.BLACK);
		} else {
			g2.setColor(Color.GRAY);
		}
		g2.setFont(titleFont);
		g2.drawString(title, xPos, (int) (getHeight() / 2 + titleBounds.getHeight() - textHeight / 2));

		if (this.isEnabled()) {
			g2.setColor(Color.DARK_GRAY);
		} else {
			g2.setColor(Color.GRAY);
		}
		g2.setFont(descriptionFont);
		g2.drawString(description, xPos,
				(int) (getHeight() / 2 + titleBounds.getHeight() + descriptionBounds.getHeight() - textHeight / 2));

		g2.setColor(Color.GRAY);
		if (topBorder) {
			g2.drawLine(0, 0, getWidth(), 0);
		}
		if (bottomBorder) {
			g2.drawLine(0, getHeight(), getWidth(), getHeight());
		}
	}

	public Dimension getPreferredSize() {
		return new Dimension(getWidth(), getHeight());
	}

	public Dimension getMinimumSize() {
		return getPreferredSize();
	}

	public Dimension getMaximumSize() {
		return getPreferredSize();
	}

	public void mouseClicked(MouseEvent e) {
		if (clickAction != null) {
			ActionEvent evt = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, new String(), e.getWhen(),
					e.getModifiers());
			clickAction.actionPerformed(evt);
		}
	}

	public void mouseEntered(MouseEvent arg0) {
		mouseOver = true;
		repaint();
	}

	public void mouseExited(MouseEvent arg0) {
		mouseOver = false;
		repaint();

	}

	public void mousePressed(MouseEvent arg0) {
		mouseDown = true;
		repaint();
	}

	public void mouseReleased(MouseEvent arg0) {
		mouseDown = false;
		repaint();
	}

	public void setAction(Action a) {
		clickAction = a;
	}

}
