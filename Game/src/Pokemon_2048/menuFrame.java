package Pokemon_2048;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class menuFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void initMenu() {
		// menuBar
		JMenuBar menuBar = new JMenuBar();

		// menu level 1
		JMenu gameMenu = new JMenu("Game");
		JMenu optionMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");

		// menuItem of menu level 1
		JMenuItem open = new JMenuItem("New");
		JMenuItem resume = new JMenuItem("Resume");
		JMenuItem pauseSave = new JMenuItem("Pause & Save");
		JMenuItem exit = new JMenuItem("Exit");

		JMenuItem suppot = new JMenuItem("Suppot");
		JMenuItem rule = new JMenuItem("Rule");

		// add menuItem to menu lv1
		gameMenu.add(open);
		gameMenu.add(resume);
		gameMenu.addSeparator();
		gameMenu.add(pauseSave);
		gameMenu.addSeparator();
		gameMenu.add(exit);

		helpMenu.add(suppot);
		helpMenu.add(rule);

		// add menu to menuBar
		menuBar.add(gameMenu);
		menuBar.add(optionMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
	}

}
