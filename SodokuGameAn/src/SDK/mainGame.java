package SDK;

import java.util.Scanner;

public class mainGame {
	public static void main(String[] args) {

		Game game = new Game();
		Scanner scanner = new Scanner(System.in);
		try {
			game.readData(Constants.FILE_IN);
//			E.readData();
//			System.out.println("Read OK");
		} catch (MyException e) {
			System.out.println(e.toString());
		}
		Node node = null;
		while (!game.checkGame()) {
			try {
				// ShowGame
				game.showGame();
				// input
				node = Input(scanner);
				// checkLock
				if (node.checkLock(game)) {
					throw new MyException(6, "Error: node is Locked!");
				}

				if (!node.checkRow(game)) {
					throw new MyException(6, "Error: node value is duplicated in Row!");
				}

				if (!node.checkColumn(game)) {
					throw new MyException(6, "Error: node value is duplicated in Column!");
				}

				if (!node.checkZone(game)) {
					throw new MyException(6, "Error: node value is duplicated in Zone!");
				}
				game.setGameNode(node);
				game.witeData(Constants.FILE_OUT);

			} catch (MyException e) {

				System.out.println(e.toString());
			}
		}
	}

	private static Node Input(Scanner sc) throws MyException {
		int row, col, val;
		System.out.println("\nRow: ");
		row = -1 + sc.nextInt();
		System.out.println("Column: ");
		col = -1 + sc.nextInt();
		System.out.println("Valua: ");
		val = sc.nextInt();

		if (row < 0 || row > 8) {
			throw new MyException(5, "error: value of ROW must be from 0 to 9!");
		}

		if (col < 0 || col > 8) {
			throw new MyException(5, "error: value of COLUMN must be from 0 to 9!");
		}

		if (val < 0 || val > 9) {
			throw new MyException(5, "error: value of EACH NODE must be from 0 to 9!");
		}
		Node node = new Node(row, col, val, false);
		return node;
	}

}
