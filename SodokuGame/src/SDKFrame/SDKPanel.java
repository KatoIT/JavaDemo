package SDKFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SDKPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField[][] textField = new JTextField[9][9];
	JButton[] keyboardButton = { new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"),
			new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"), new JButton("9"),
			new JButton("0") };
	Font buttonFont = new Font("Brush Script Std", Font.PLAIN, 30);
	
	public SDKPanel() {
		super();
		this.initPanel();
	}
	private void initPanel() {
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
		
	}
}
