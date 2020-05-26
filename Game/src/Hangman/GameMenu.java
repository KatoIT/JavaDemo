package Hangman;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameMenu extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameMenu() {
		super();
		this.init();
	}

	private void init() {
		JMenu game = new JMenu("Game");
		JMenu view = new JMenu("View");
		JMenu help = new JMenu("Help");

		JMenuItem newGame = new JMenuItem("New");
		JMenuItem resumeGame = new JMenuItem("Resume");
		JMenuItem pauseGame = new JMenuItem("Pause");
		JMenuItem exitGame = new JMenuItem("Exit");

		JMenuItem bestScore = new JMenuItem("Best Score");
		JMenuItem view2 = new JMenuItem("View2");
		JMenuItem view3 = new JMenuItem("View3");
		
		JMenuItem ruleGame = new JMenuItem("Game rules");
		JMenuItem aboutGame = new JMenuItem("About game");
		
		game.add(newGame);
		game.addSeparator();
		game.add(resumeGame);
		game.addSeparator();
		game.add(pauseGame);
		game.addSeparator();
		game.add(exitGame);
		
		view.add(bestScore);
		view.add(view2);
		view.add(view3);
		
		help.add(ruleGame);
		help.add(aboutGame);
		
		this.add(game);
		this.add(view);
		this.add(help);
	}
}
