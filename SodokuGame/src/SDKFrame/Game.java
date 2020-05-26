package SDKFrame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Game {

	private Node[][] gameNode;

	// Constructor
	public Game(Node[][] gameNode) {
		super();
		this.gameNode = gameNode;
	}

	public Game() {
		this.gameNode = new Node[Constants.GAME_SIZE][Constants.GAME_SIZE];
	}

	public void readData() throws MyException{
		try {

			for (int i = 0; i < Constants.GAME_SIZE; i++) {
				for (int j = 0; j < Constants.GAME_SIZE; j++) {
					Node node = null;
					int valua = Constants.DATA_GAME[i][j];
					if (valua == 0) {
						node = new Node(i, j, valua, false);
					} else {
						node = new Node(i, j, valua, true);
					}
					gameNode[i][j] = node;
				}
			}
		} catch (Exception e) {
			throw new MyException(1, "Error: data input is not validate!");
		}
	}

	public void readData(String fileName) throws MyException {
		File file = null;
		BufferedReader br = null;
		FileReader fr = null;
		try {
			file = new File(fileName);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data;
			int r = 0;
			int c = 0;
			while ((data = br.readLine()) != null) {
				c = 0;
				String[] datas = data.split(" ");
				for (String d : datas) {
					int valua = Integer.parseInt(d);
					Node node = null;
					if (valua == 0) {
						node = new Node(r, c, valua, false);
					} else {
						node = new Node(r, c, valua, true);
					}
					this.gameNode[r][c] = node;
					c++;
				}
				r++;
			}
		} catch (NumberFormatException e) {
			throw new MyException(1, "errer: data input is not validate!");
		} catch (FileNotFoundException e) {
			throw new MyException(2, "errer: file input not found!");
		} catch (IOException e) {
			throw new MyException(3, "errer: cannot open/close file!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				throw new MyException(3, "errer: cannot open/close file!");
			}
		}
	}

	public void witeData(String fileName) throws MyException {
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			file = new File(fileName);
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for (int i = 0; i < Constants.GAME_SIZE; i++) {
				for (int j = 0; j < Constants.GAME_SIZE; j++) {
					bw.write(getElement(i, j).getValua() + ", ");
				}
				bw.newLine();
			}

		} catch (FileNotFoundException e) {
			throw new MyException(2, "errer: file input not found!");
		} catch (IOException e) {
			throw new MyException(3, "errer: cannot open/close file!");
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				throw new MyException(3, "errer: cannot open/close file!");
			}
		}

	}

	public void showGame() {
		for (int i = 0; i < Constants.GAME_SIZE; i++) {
			System.out.println("\n------------------------------------");
			for (int j = 0; j < Constants.GAME_SIZE; j++) {
				int valua = getElement(i, j).getValua();
				if (valua == 0) {
					System.out.print("  " + getElement(i, j).getLock() + " |");
				} else {
					System.out.print(" " + valua + getElement(i, j).getLock() + " |");
				}

			}
		}
		System.out.println("\n------------------------------------");

	}

	public boolean checkGame() {
		for (Node[] nodes : gameNode) {
			for (Node node : nodes) {
				if (node.getValua() == 0) {
					return false;
				}
			}

		}
		return true;
	}
	public Node getElement(int row, int col) {
		return this.gameNode[row][col];
	}

	public void setGameNode(Node node) {
		this.gameNode[node.getRow()][node.getColumn()].setValua(node.getValua());
	}
	
	
}
