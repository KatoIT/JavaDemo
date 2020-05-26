package Tuan_9;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
//	JTextField tf_1 ;
//	JTextField tf_2 ;
//	JTextField tf_3 ;

	JTextField tf_1 = new JTextField();
	JTextField tf_2 = new JTextField();
	JTextField tf_3 = new JTextField();
	JTextField tf_4 = new JTextField();

	public MyFrame() {
		super("Calculator");

		// Thiết lập các thông số giao diện
		this.setLocation(560, 315);
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);

		this.initMenu();
		this.init();

	}

	private void initMenu() {
		// menuBar
		JMenuBar menuBar = new JMenuBar();

		// menu level 1
		JMenu fileMenu = new JMenu("File");
		JMenu actionMenu = new JMenu("Action");
		JMenu helpMenu = new JMenu("About");

		// menu level 2
		JMenu openMenu = new JMenu("Opens");

		// menuItem of menu level 1
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");

		JMenuItem add = new JMenuItem("+");
		JMenuItem sub = new JMenuItem("-");
		JMenuItem mul = new JMenuItem("x");
		JMenuItem div = new JMenuItem("/");

		JMenuItem about = new JMenuItem("About me...");

		// menuItem of menu level 2
		JMenuItem add1 = new JMenuItem("+");
		JMenuItem sub1 = new JMenuItem("-");
		JMenuItem mul1 = new JMenuItem("x");
		JMenuItem div1 = new JMenuItem("/");

		// add menuItem to menu lv1
		fileMenu.add(open);
		fileMenu.add(openMenu);

		fileMenu.addSeparator(); // tao vach ngan cach "_____________"

		fileMenu.add(save);
		fileMenu.addSeparator();
		fileMenu.add(exit);

		actionMenu.add(add);
		actionMenu.addSeparator();
		actionMenu.add(sub);
		actionMenu.addSeparator();
		actionMenu.add(mul);
		actionMenu.addSeparator();
		actionMenu.add(div);

		helpMenu.add(about);

		// add menuItem to menu lv2
		openMenu.add(add1);
		openMenu.add(sub1);
		openMenu.add(mul1);
		openMenu.add(div1);

		// add menu to menuBar
		menuBar.add(fileMenu);
		menuBar.add(actionMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
	}

	private void init() {
		// panel
		JPanel mainPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		JPanel southPanel = new JPanel();

		// Layout
		mainPanel.setLayout(new BorderLayout());
		centerPanel.setLayout(new GridLayout(4, 2));
//		southPanel.setLayout(new GridLayout(1, 4));
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(southPanel, BorderLayout.SOUTH);

		// label
		JLabel txt_1 = new JLabel("First Number");
		JLabel txt_2 = new JLabel("Second Number");
		JLabel txt_3 = new JLabel("Result");
		JLabel txt_4 = new JLabel("Caculator");

		// textFeild

		tf_3.setEditable(false);
		tf_3.setBackground(Color.CYAN);

		// button
		JButton bt_1 = new JButton("+");
		JButton bt_2 = new JButton("-");
		JButton bt_3 = new JButton("x");
		JButton bt_4 = new JButton("/");

		// add to centerPanel
		centerPanel.add(txt_1);
		centerPanel.add(tf_1);
		centerPanel.add(txt_2);
		centerPanel.add(tf_2);
		centerPanel.add(txt_3);
		centerPanel.add(tf_3);
		centerPanel.add(txt_4);
		centerPanel.add(tf_4);

		// add to southPanel
		southPanel.add(bt_1);
		southPanel.add(bt_2);
		southPanel.add(bt_3);
		southPanel.add(bt_4);

		//
		this.setContentPane(mainPanel);

		bt_1.addActionListener(this);
		bt_2.addActionListener(this);
		bt_3.addActionListener(this);
		bt_4.addActionListener(this);

		tf_4.addKeyListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());// hien thi len console
		double fVal = 0;
		double sVal = 0;
		try {
			fVal = Double.parseDouble(tf_1.getText());
			sVal = Double.parseDouble(tf_2.getText());
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(this, "Number Format Exception!\nNhập vào dữ liệu số", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		String cmd = e.getActionCommand();

		if ("+".equals(cmd)) {
			double valua = fVal + sVal;
			tf_3.setText("" + valua);
		}
		if ("-".equals(cmd)) {
			double valua = fVal - sVal;
			tf_3.setText("" + valua);
		}
		if ("x".equals(cmd)) {
			double valua = fVal * sVal;
			tf_3.setText("" + valua);
		}
		if ("/".equals(cmd)) {
			double valua = fVal / sVal;
			tf_3.setText("" + valua);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		double fVal = 0;
		double sVal = 0;
		try {
			fVal = Double.parseDouble(tf_1.getText());
			sVal = Double.parseDouble(tf_2.getText());
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(this, "Number Format Exception!\nNhập vào dữ liệu số", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
		char key = e.getKeyChar();
//		int keyCode = e.getKeyCode();
//		System.out.println("keyCode "keyCode + " --- " + KeyEvent.VK_F1);

		if ('+' == key) {
			double valua = fVal + sVal;
			tf_3.setText("" + valua);
		} else if ('-' == key) {
			double valua = fVal - sVal;
			tf_3.setText("" + valua);
		} else {
			if ('*' == key) {
				double valua = fVal * sVal;
				tf_3.setText("" + valua);
			} else {
				if ('/' == key) {
					double valua = fVal / sVal;
					tf_3.setText("" + valua);
				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
