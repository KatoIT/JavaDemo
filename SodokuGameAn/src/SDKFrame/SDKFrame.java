package SDKFrame;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class SDKFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	SDKListener listener = new SDKListener();
	SDKMenu menu = new SDKMenu(listener);
	SDKPanel panel = new SDKPanel(listener)	;
	public SDKFrame()
	{
		super("Sudoku");
		URL iconURL = this.getClass().getResource("../IconImage/SudokuIcon.png");
		this.setIconImage(new ImageIcon(iconURL).getImage());
		// Thiết lập các thông số giao diện
		this.setLocation(675, 240);
		this.setSize(630, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.init();
		this.listener.setMain(this);
	}

	private void init() {
		this.setJMenuBar(menu);
		this.setContentPane(panel);
	}
	
	

}
