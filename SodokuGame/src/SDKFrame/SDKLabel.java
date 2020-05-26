package SDKFrame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class SDKLabel extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int a;
	private boolean isLock;
	
	Font buttonFont = new Font("Brush Script Std", Font.PLAIN, 30);
	
	public SDKLabel(int a, boolean isLock) {
		super();
		if (0 == a) {
			this.setText("1");
			this.setBackground(new Color(0xFFE1FF));
			this.setHorizontalAlignment(JLabel.CENTER);
			this.setFont(buttonFont);
		}else {
			this.setText("0");
		}
		
	}
	
	
}
