package CaculatorTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Calc_Frame extends JFrame {

	private static final long serialVersionUID = 3528357032073049829L;
	 
	JTextField textFld = new JTextField("0");
	
	JButton[] btns = { new JButton("CE"), new JButton("C"), new JButton("DEL"), new JButton("/"), new JButton("7"),
			new JButton("8"), new JButton("9"), new JButton("x"), new JButton("4"), new JButton("5"), new JButton("6"),
			new JButton("-"), new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+"),
			new JButton("+/-"), new JButton("0"), new JButton("."), new JButton("=") };

	Font textFont = new Font("Courrier", Font.BOLD, 32);
	Font buttonFont = new Font("Courrier", Font.PLAIN, 18);
	Border lineBorder = BorderFactory.createLineBorder(Color.black);

	public Calc_Frame(CaculatorListener listener) {
		super("May tinh");
//		URL iconURL = this.getClass().getResource("../images/calculator.png");
//		this.setIconImage(new ImageIcon(iconURL).getImage());
		this.setLocation(100, 100);
		this.setSize(350, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.init( listener);
	}

	private void init(CaculatorListener listener) {
		JPanel mainPanel = new JPanel();
		JPanel centerPanel = new JPanel();

		mainPanel.setLayout(new BorderLayout());
		centerPanel.setLayout(new GridLayout(5, 4, 5, 5));

		// Config: TextField
		textFld.setBackground(mainPanel.getBackground());
		textFld.setBorder(new EmptyBorder(5, 5, 5, 5));
		textFld.setHorizontalAlignment(JTextField.RIGHT);
		textFld.setFont(textFont);
		textFld.addActionListener(listener);
		
		System.out.println(textFld.getText());

		// Config: Buttons
		for (JButton jButton : btns) {
			jButton.setBorder(lineBorder);
			jButton.setFont(buttonFont);
			jButton.addActionListener(listener);
			centerPanel.add(jButton);
		}
		
		mainPanel.add(textFld, BorderLayout.NORTH);
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		this.setContentPane(mainPanel);

	}

	public String getText() {
		return textFld.getText();
	}

	public void setTextFld(JTextField textFld) {
		this.textFld = textFld;
	}
	
}
