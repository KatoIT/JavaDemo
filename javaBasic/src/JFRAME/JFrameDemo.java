package JFRAME;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	private JFrame frame;
	JButton button;
	
	public JFrameDemo() {
		creatAndShow();
	}
	
	public void creatAndShow() {
		button = new JButton("Button");
//		frame = new JFrame("Title");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.add(button);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
//		frame.pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameDemo();
	}

}
