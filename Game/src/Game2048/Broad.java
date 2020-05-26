package Game2048;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Broad extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String FONT_NAME = "Arial";

	private Tile[] myTiles;
	private Tile[] backMyTiles = new Tile[4 * 4];
	boolean Win = false;
	boolean Lose = false;
	int myScore = 0;
	int backScore = 0;
	int stepMove = 0;

	public Broad() {
		resetGame();
		this.paint();
		this.setLayout(new GridLayout(4, 4, 3, 3));

	}

	private void move() {
		boolean needAddTile = false;
		for (int i = 0; i < 4; i++) {
			Tile[] line = getLine(i);
			Tile[] newLine = mergeLine(moveLine(line));
			setLine(i, newLine);
			if (compare(line, newLine)) {
				needAddTile = true;
			}
		}
		if (needAddTile) {
			addTile();
			stepMove++;
		}
	}

	public void left() {
		backMyTiles = myTiles;
		move();
	}

	public void right() {
		backMyTiles = myTiles;
		backScore = myScore;
		myTiles = rotate(180);
		move();
		myTiles = rotate(180);

	}

	public void up() {
		backMyTiles = myTiles;
		backScore = myScore;
		myTiles = rotate(270);
		move();
		myTiles = rotate(90);
	}

	public void down() {
		backMyTiles = myTiles;
		backScore = myScore;
		myTiles = rotate(90);
		move();
		myTiles = rotate(270);
	}

	public void previousTurn() {
		myScore = backScore;
		myTiles = backMyTiles;
	}

	public void resetGame() { // function reset game
		this.Win = false;
		this.Lose = false;
		this.myScore = 0;
		this.stepMove = 0;
		this.myTiles = new Tile[4 * 4];
		for (int i = 0; i < myTiles.length; i++) {
			myTiles[i] = new Tile();
			backMyTiles[i] = new Tile();
		}
		addTile();
		addTile();

	}

	public Tile tileAt(int x, int y) {
		return myTiles[x + y * 4]; // x la cot y la hang
	}

	public void addTile() { // function them 1 o nua
		List<Tile> l = this.availableSpace();
		if (!availableSpace().isEmpty()) {
			int index = (int) (Math.random() * l.size());
			int value = Math.random() < 0.9 ? 2 : 4;
			l.get(index).setValue(value);
		}

	}

	public List<Tile> availableSpace() { // function xem con khoang chong khong
		List<Tile> l = new ArrayList<Tile>(16);
		for (Tile t : myTiles) {
			if (t.isEmpty()) {
				l.add(t);
			}
		}
		return l;
	}

	public boolean isFull() {
		return availableSpace().isEmpty();
	}

	public boolean canMove() { // functin xem cos the di tiep hay khong
		if (!isFull()) {
			return true;
		}

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				Tile t = tileAt(y, x);
				if ((x < 3 && t.value == tileAt(y + 1, x).value) || (y < 3 && t.value == tileAt(x, y + 1).value)) {

					return true;
				}
			}
		}
		return false;

	}

	public Tile[] getLine(int index) {
		Tile[] result = new Tile[4];
		for (int x = 0; x < 4; x++) {
			result[x] = tileAt(x, index);
		}

		return result;
	}

	private Tile[] rotate(int angle) {

		if (angle == 0) {
			return myTiles;
		}

		Tile[] newTiles = new Tile[4 * 4];
		int offsetX = 3, offsetY = 3;
		if (angle == 90) {
			offsetY = 0;
		} else if (angle == 270) {
			offsetX = 0;
		}

		double rad = Math.toRadians(angle);
		int cos = (int) Math.cos(rad);
		int sin = (int) Math.sin(rad);
		// System.out.println(rad + " " + cos + " " + sin);
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				int newX = (x * cos) - (y * sin) + offsetX;
				int newY = (x * sin) + (y * cos) + offsetY;
				newTiles[(newX) + (newY) * 4] = tileAt(x, y);
			}
		}
		return newTiles;
	}

	public Tile[] moveLine(Tile[] oldLine) {
		List<Tile> l = new ArrayList<Tile>();

		for (int i = 0; i < 4; i++) {
			if (!oldLine[i].isEmpty()) {
				l.add(oldLine[i]);
			}
		}
		if (l.size() == 0) {
			return oldLine;
		} else {
			Tile[] newLine = new Tile[4];
			ensureSize(l, 4);
			for (int i = 0; i < 4; i++) {
				newLine[i] = l.get(i);
			}
			return newLine;
		}

	}

	public Tile[] mergeLine(Tile[] oldLine) {
		List<Tile> l = new ArrayList<Tile>();
		for (int i = 0; i < 4 && !oldLine[i].isEmpty(); i++) {
			int num = oldLine[i].value;
			if (i < 3 && oldLine[i].value == oldLine[i + 1].value) {
				num *= 2;
				myScore += num;
				if (myScore == 2048) {
					Win = true;
				}
				i++;
			}
			l.add(new Tile(num));
		}
		if (l.size() == 0) {
			
			return oldLine;
		} else {
			ensureSize(l, 4);
			return l.toArray(new Tile[4]);
		}
	}

	public void setLine(int index, Tile[] newLine) {
		for (int i = 0; i < 4; i++) {
			myTiles[i + index * 4] = newLine[i];
		}
	}

	public void ensureSize(List<Tile> l, int s) {

		while (l.size() != s) {
			l.add(new Tile());
		}
	}

	private boolean compare(Tile[] line1, Tile[] line2) {
		for (int i = 0; i < line1.length; i++) {
			if (line1[i].value != line2[i].value) {
				return true;
			}
		}
		return false;
	}

	public void paint() {
		removeAll();
		revalidate();
		// repaint();
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				JLabel node = new JLabel("" + myTiles[x + y * 4].value, JLabel.CENTER);
				if (myTiles[x + y * 4].value == 0)
					node.setText("");
				node.setOpaque(true);
				node.setFont(new Font(FONT_NAME, Font.BOLD, 20));
				node.setForeground(myTiles[x + y * 4].getForeground());
				Border border = new LineBorder(Color.BLACK, 4);
				node.setBorder(border);
				node.setBackground(myTiles[x + y * 4].getBackground());
				this.add(node);
			}
		}
	}

}
