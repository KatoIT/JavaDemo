package SDKFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AboutGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	SDKListener aboutListener = new SDKListener();
	
	Font titleFont = new Font("Rosewood Std Regular", Font.PLAIN, 60);
	Font btFont = new Font("Brush Script Std", Font.PLAIN, 40);
	Font lbFont = new Font("Rosewood Std Regular", Font.PLAIN, 40);
	
	JButton[] btGame = {new JButton("Start"), new JButton("Resume"), new JButton("Level"), new JButton("Exit")};
	JLabel[] lbGame = {new JLabel("S"), new JLabel("U"), new JLabel("D"), new JLabel("O"), new JLabel("K"), new JLabel("U"), };

	public AboutGame() {
		super("Sudoku");
		URL iconURL = this.getClass().getResource("../IconImage/SudokuIcon.png");
		this.setIconImage(new ImageIcon(iconURL).getImage());
		// Thiết lập các thông số giao diện
		this.setLocation(675, 240);
		this.setSize(630, 600);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		JPanel main = new JPanel();
		JPanel northPanel = new JPanel();
		JPanel westPanel = new JPanel();
		JPanel eastPanel = new JPanel();
		JPanel southPanel = new JPanel();
		JPanel centerPanel = new JPanel();

		main.setLayout(new BorderLayout());
		northPanel.setLayout(new BorderLayout());
		westPanel.setLayout(new GridLayout(6, 1));
		eastPanel.setLayout(new GridLayout(6, 1));
		southPanel.setLayout(new BorderLayout());
		centerPanel.setLayout(new GridLayout(4, 1, 10, 10));

		for (JButton bt : btGame) {
			bt.setFont(btFont);
//			bt.setPreferredSize(new Dimension(200, 100));
			centerPanel.add(bt);
		}
		
		for (JLabel lb : lbGame) {
			lb.setFont(lbFont);
			eastPanel.add(lb);
		}
		
		for (JLabel lb : lbGame) {
			lb.setFont(lbFont);
			westPanel.add(lb);
		}

		JLabel title = new JLabel("Sudoku Game");
		
		title.setFont(titleFont);
		title.setHorizontalAlignment(JLabel.CENTER);
		
		northPanel.add(title);
		
		main.add(northPanel, BorderLayout.NORTH);
		main.add(westPanel, BorderLayout.WEST);
		main.add(eastPanel, BorderLayout.EAST);
		main.add(southPanel, BorderLayout.SOUTH);
		main.add(centerPanel, BorderLayout.CENTER);
		
		this.setContentPane(main);
	}

}
