package SDK;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SDKFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton[] keyboardButton = { new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"),
			new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"), new JButton("9"),
			new JButton("0"), };
	JTextField[][] textField = new JTextField[9][9];
	
	Font buttonFont = new Font("Brush Script Std", Font.PLAIN, 30);
			
	public SDKFrame() {
		super("Sodoku Game");

		// Thiết lập các thông số giao diện
		this.setLocation(560, 315);
		this.setSize(630, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.initMenu();
		this.init();

	}

	private void initMenu() {
		// menuBar
		JMenuBar menuBar = new JMenuBar();

		// menu level 1
		JMenu gameMenu = new JMenu("Game");
		JMenu optionMenu = new JMenu("Option");
		JMenu helpMenu = new JMenu("Help");

		// menuItem of menu level 1
		JMenuItem newG = new JMenuItem("New");
		JMenuItem resume = new JMenuItem("Resume");
		JMenuItem pause = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");

		JMenuItem theme = new JMenuItem("Theme");
		JMenuItem level = new JMenuItem("Level");

		JMenuItem suppot = new JMenuItem("About game");
		JMenuItem rule = new JMenuItem("Game rule");

		// add menuItem to menu lv1
		gameMenu.add(newG);
		gameMenu.add(resume);
		gameMenu.addSeparator();
		gameMenu.add(pause);
		gameMenu.addSeparator();
		gameMenu.add(exit);

		optionMenu.add(theme);
		optionMenu.add(level);

		helpMenu.add(suppot);
		helpMenu.add(rule);

		// add menu to menuBar
		menuBar.add(gameMenu);
		menuBar.add(optionMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
	}

	private void init() {
		// panel
		JPanel mainPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel eastPanel = new JPanel();

		JPanel keyboardPanel = new JPanel();

		// Layout
		mainPanel.setLayout(new BorderLayout(10, 10));
		centerPanel.setLayout(new GridLayout(9, 9, 1, 1));
		eastPanel.setLayout(new BorderLayout(5, 5));
		keyboardPanel.setLayout(new GridLayout(10, 1, 3, 3));
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(eastPanel, BorderLayout.EAST);
		eastPanel.add(keyboardPanel);

		for (JButton jButton : keyboardButton) {
			jButton.setFont(buttonFont);
			jButton.setBackground(new Color(0xC6E2FF));
			keyboardPanel.add(jButton);
		}
		
		for (JTextField[] jTextField : textField) {
			for (JTextField jTextField2 : jTextField) {
				jTextField2 = new JTextField("0");
				jTextField2.setFont(buttonFont);
				jTextField2.setHorizontalAlignment(JTextField.CENTER);
				jTextField2.setBackground(new Color(0xFFE1FF));
				centerPanel.add(jTextField2);
			}
		}
		
		//
		this.setContentPane(mainPanel);
	}

}
