package SDKFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SDKMenu extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SDKMenu(SDKListener listener) {
		super();

		// menuBar
		JMenuBar menuBar = new JMenuBar();

		// menu level 1
		JMenu gameMenu = new JMenu("Game");
		JMenu optionMenu = new JMenu("Option");
		JMenu helpMenu = new JMenu("Help");
		JMenu level = new JMenu("Level");

		// menuItem of menu level 1
		JMenuItem newGame = new JMenuItem("New");
		JMenuItem resume = new JMenuItem("Resume");
		JMenuItem pause = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");

		JMenuItem theme = new JMenuItem("Theme");
//		JMenuItem level = new JMenuItem("Level");
		JMenuItem level1 = new JMenuItem("Level_1");
		JMenuItem level2 = new JMenuItem("Level_2");
		JMenuItem level3 = new JMenuItem("Level_3");
		JMenuItem level4 = new JMenuItem("Level_4");
		JMenuItem level5 = new JMenuItem("Level_5");
		JMenuItem level6 = new JMenuItem("Level_6");

		JMenuItem about = new JMenuItem("About game");
		JMenuItem rule = new JMenuItem("Game rule");
		JMenuItem hint = new JMenuItem("Hint");

		// add menuItem to menu lv1
		gameMenu.add(newGame);
		gameMenu.addSeparator();
		gameMenu.add(resume);
		gameMenu.addSeparator();
		gameMenu.add(pause);
		gameMenu.addSeparator();
		gameMenu.add(exit);

		optionMenu.add(theme);
		optionMenu.add(level);
		
		level.add(level1);
		level.add(level2);
		level.add(level3);
		level.add(level4);
		level.add(level5);
		level.add(level6);

		helpMenu.add(about);
		helpMenu.add(rule);
		helpMenu.add(hint);

		// add menu to menuBar
		menuBar.add(gameMenu);
		menuBar.add(optionMenu);
		menuBar.add(helpMenu);

		newGame.addActionListener(listener);
		resume.addActionListener(listener);
		pause.addActionListener(listener);
		exit.addActionListener(listener);
		theme.addActionListener(listener);
		level.addActionListener(listener);
		about.addActionListener(listener);
		rule.addActionListener(listener);
		hint.addActionListener(listener);
		
		level1.addActionListener(listener);
		level2.addActionListener(listener);
		level3.addActionListener(listener);
		level4.addActionListener(listener);
		level5.addActionListener(listener);
		level6.addActionListener(listener);

		this.add(menuBar);
	}
//	public void setEnableMenu(boolean status){
//		this.gameMenu.setEnabled(true);
//		this.exitMenu.setEnabled(true);
//		this.saveMenu.setEnabled(status);
//	}

}
