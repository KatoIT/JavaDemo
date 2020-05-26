package SDKFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SDKPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Game game = new Game();
	JPanel centerPanel = new JPanel();
	SDKLabel[][] nodeLabel = new SDKLabel[9][9];

	JLabel labelDevelopers = new JLabel("By Nguyen Van An");

	JLabel[] labelGame = { new JLabel("S"), new JLabel("U"), new JLabel("D"), new JLabel("O"), new JLabel("K"),
			new JLabel("U") };

	JButton[] keyboardButton = { new JButton("1"), new JButton("2"), new JButton("3"), new JButton("4"),
			new JButton("5"), new JButton("6"), new JButton("7"), new JButton("8"), new JButton("9"),
			new JButton("0") };

	//
	Font buttonFont = new Font("Brush Script Std", Font.PLAIN, 35);
	Font nameGameFont = new Font("Rosewood Std Regular", Font.PLAIN, 50);

	public SDKPanel(SDKListener listener) {
		super();
		try {
			game.readData(Constants.FILE_IN_HELLO);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// panel
//		JPanel centerPanel = new JPanel();
		JPanel eastPanel = new JPanel();

		JPanel keyboardPanel = new JPanel();
		JPanel keyboardPanel2 = new JPanel();
		JPanel keyboardPanel3 = new JPanel();

		JPanel nameGame = new JPanel();

		//
		this.setLayout(new BorderLayout());
		eastPanel.setLayout(new BorderLayout());

		labelDevelopers.setHorizontalAlignment(JLabel.CENTER);

		//
		nameGame.setLayout(new GridLayout(6, 1, 5, 5));
		for (JLabel jLabel : labelGame) {
			nameGame.add(jLabel);
			jLabel.setFont(nameGameFont);
			jLabel.setForeground(new Color(0x0033FF));
		}

		//
		keyboardPanel.setLayout(new GridLayout(10, 1, 3, 3));
		for (JButton jButton : keyboardButton) {
			keyboardPanel.add(jButton);
			jButton.setFont(buttonFont);
			jButton.setBackground(new Color(0x00F5FF));
			jButton.setForeground(new Color(0xFF0000));
			jButton.addActionListener(listener);
		}

		//
		centerPanel.setLayout(new GridLayout(9, 9, 1, 1));
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			for (int j = 0; j < Constants.GAME_SIZE; j++) {
				nodeLabel[i][j] = new SDKLabel(game.getElement(i, j), false);
				nodeLabel[i][j].setText();

				centerPanel.add(nodeLabel[i][j]);
				nodeLabel[i][j].addMouseListener(listener);
			}
		}

		//
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(eastPanel, BorderLayout.EAST);
		this.add(nameGame, BorderLayout.WEST);
		this.add(labelDevelopers, BorderLayout.SOUTH);
		eastPanel.add(keyboardPanel, BorderLayout.CENTER);
		eastPanel.add(keyboardPanel2, BorderLayout.WEST);
		eastPanel.add(keyboardPanel3, BorderLayout.EAST);
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public void refreshGame() {
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			for (int j = 0; j < Constants.GAME_SIZE; j++) {
				nodeLabel[i][j].setNode(game.getElement(i, j));
				nodeLabel[i][j].setSelected(false);
				nodeLabel[i][j].setBackground();
				nodeLabel[i][j].setForeground();
				nodeLabel[i][j].setText();
			}
		}
	}

	public void refreshGame(Node node) {
		this.game.setGameNode(node);
		nodeLabel[node.getRow()][node.getColumn()].setNode(game.getElement(node.getRow(), node.getColumn()));
	}

}
