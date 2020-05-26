package Pokemon_2048;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class File_IO extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titleScore;
	private JLabel myScore;
	private int score = 0;

	public void ScoreCpn() {
		this.setLayout(new GridLayout(2, 1));
		titleScore = new JLabel("SCORE", JLabel.CENTER);
		myScore = new JLabel("0", JLabel.CENTER);
		this.add(titleScore);
		this.add(myScore);
		titleScore.setForeground(Color.WHITE);
		myScore.setForeground(Color.WHITE);
		myScore.setFont(new Font("", Font.ITALIC, 20));
		this.setBackground(new Color(187, 173, 160));
	}

	// Ghi lại điểm cao nếu Score > bestScore
	public void setScore(int num) {
		if (num > Integer.parseInt(File_IO.readScore())) {
			File_IO.writeScore(score);
		}
		this.remove(myScore);
		this.revalidate();
		this.score = num;
		myScore = new JLabel(this.score + "", JLabel.CENTER);
		myScore.setFont(new Font("", Font.ITALIC, 20));
		myScore.setForeground(Color.WHITE);
		this.add(myScore);

	}

	// Doc Bestscore
	public static String readScore() {
		File f = new File("E:\\GameIO.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			try {
				return br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return "0";

	}

	// Ghi BestScore
	public static void writeScore(int score) {
		File f = new File("F:\\GameIO.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write("" + score);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
