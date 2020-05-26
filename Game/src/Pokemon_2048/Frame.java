package Pokemon_2048;

import javax.swing.JFrame;

public class Frame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Frame() {
		super("Game 2048");
		menuFrame menu = new menuFrame();
		this.setLocation(500, 300);
		this.setSize(400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new CpnMain());
		this.setResizable(false);
		menu.initMenu();
	}

}
