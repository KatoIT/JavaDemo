package SDKFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SDKMenu extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SDKMenu() {
		super();
		this.initMenu();
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

		this.add(menuBar);
	}

}
