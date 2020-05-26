package SDKFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class SDKLabel extends JLabel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Node node;
	private boolean isSelected;
	LineBorder labelBorder = new LineBorder(new Color(0xFF00FF), 2);
	LineBorder labelBorder1 = new LineBorder(new Color(0x00DD00), 3);// FFFF00
	LineBorder labelBorder2 = new LineBorder(new Color(0x0000EE), 3);
	LineBorder labelBorder3 = new LineBorder(new Color(0xFF00FF), 2);
	Font buttonFont = new Font("Brush Script Std", Font.PLAIN, 30);

	//
	public SDKLabel(Node node, boolean isSelected) {
		super();
		this.node = node;
		this.isSelected = isSelected;

		this.setOpaque(true);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setFont(buttonFont);
		this.setBorder();
		this.setForeground();
		this.setBackground();

	}

	public void setText() {
		if (0 == this.node.getValua()) {//
			this.setText("");
		} else {
			this.setText("" + node.getValua());//
		}
	}

	public boolean isSelected() {
		return isSelected;
	}

	//
	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	//
	public void setBackground() {
		if (this.node.getLock()) {//
			if (this.isSelected) {//
				this.setBackground(new Color(0xFF00FF));
			} else {
				this.setBackground(new Color(0x9AC0CD));
			}
		} else {
			if (this.isSelected) {//
				this.setBackground(new Color(0xFF00FF));
			} else {
				this.setBackground(new Color(0xFFE1FF));
			}
		}

	}

	//
	public void setBorder() {
		if (!isSelected) {
			if (this.node.getZone() % 2 == 0) {
				this.setBorder(labelBorder1);
			} else {
				this.setBorder(labelBorder2);
			}
		} else {
			this.setBorder(labelBorder3);
		}
	}

	public void setForeground() {
		if (this.node.getLock()) {
			this.setForeground(new Color(0xFFE1FF));
		} else {
			this.setForeground(new Color(0x000000));
		}
	}

	public Node getNode() {
		return this.node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

}
