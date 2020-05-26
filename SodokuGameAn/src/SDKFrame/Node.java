package SDKFrame;

public class Node {

	private int row;
	private int column;
	private int valua;
	private boolean lock;
	private int zone;

	// Constructor
	public Node(int row, int column, int valua, boolean lock) {
		this.row = row;
		this.column = column;
		this.valua = valua;
		this.lock = lock;
		this.zone = this.findZone();
	}

	@Override
	public String toString() {
		return "Square [row=" + row + ", column=" + column + ", valua=" + valua + "]";
	}

	// Getter & Setter
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getValua() {
		return valua;
	}

	public void setValua(int valua) {
		this.valua = valua;
	}

	// Lock
	public boolean getLock() {
		return this.lock;
	}

	// Zone
	public int getZone() {
		return this.zone;
	}

	public int findZone() {
		int r = this.row / 3;
		int c = this.column / 3;
		int zone = r * 3 + c;
		return zone;
	}

	// check column
	public boolean checkColumn(Game game) {
		for (int i = 0; i < 9; i++) {
			if (game.getElement(i, this.column).getValua() == this.valua
					&& game.getElement(i, this.column).getValua() != 0)
				return false;
		}
		return true;
	}

	// check row
	public boolean checkRow(Game game) {
		for (int i = 0; i < 9; i++) {
			if (game.getElement(this.row, i).getValua() == this.valua && game.getElement(this.row, i).getValua() != 0)
				return false;
		}
		return true;
	}

	// check zone
	public boolean checkZone(Game game) {
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++) {
				if (game.getElement(i, j).getZone() == this.zone && game.getElement(i, j).getValua() == this.valua
						&& game.getElement(i, j).getValua() != 0)
					return false;
			}
		return true;
	}
	// check lock

	public boolean checkLock(Game game) {
		return game.getElement(this.row, this.column).lock;
	}

}
