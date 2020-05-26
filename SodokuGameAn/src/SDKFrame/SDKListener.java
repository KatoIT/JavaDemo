package SDKFrame;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SDKListener implements ActionListener, KeyListener, MouseListener {

	SDKFrame sdkPanel;
	private SDKLabel selectedLbl = null;
	private boolean isSelected = false;
	private boolean isResumeLevel = true;
	String fileName = Constants.FILE_IN_LV1;

	public void setMain(SDKFrame sdkPanel) {
		this.sdkPanel = sdkPanel;
	}

	/*
	 * KeyListener
	 */

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * ActionListener
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if ("Exit".equals(cmd)) {
			System.exit(0);
		} else {
			if (this.isSelected && this.selectedLbl != null) {
				if (e.getSource() instanceof JButton) {
					JButton btn = (JButton) e.getSource();
					int valua = Integer.parseInt(btn.getText());
					Node node = this.selectedLbl.getNode();
					Node nodeS = new Node(node.getRow(), node.getColumn(), valua, false);
					Game game = this.sdkPanel.panel.getGame();
					try {
						game.validatesGame(nodeS);
						node.setValua(valua);
						this.selectedLbl.setText();
					} catch (MyException ex) {
						JOptionPane.showMessageDialog(this.sdkPanel, "Error: " + ex.getMessage(), "Error",
								JOptionPane.INFORMATION_MESSAGE);
					}
					if (game.checkGame()) {
						JOptionPane.showMessageDialog(this.sdkPanel, "Conglatulation, you won the game", "Winner",
								JOptionPane.INFORMATION_MESSAGE);
					}

				}
			} else {
				if ("Level_1".equals(cmd)) {
					fileName = Constants.FILE_IN_LV1;
					isResumeLevel = false;
				} else {
					if ("Level_2".equals(cmd)) {
						fileName = Constants.FILE_IN_LV2;
						isResumeLevel = false;
					} else {
						if ("Level_3".equals(cmd)) {
							fileName = Constants.FILE_IN_LV3;
							isResumeLevel = false;
						} else {
							if ("Level_4".equals(cmd)) {
								fileName = Constants.FILE_IN_LV4;
								isResumeLevel = false;
							} else {
								if ("Level_5".equals(cmd)) {
									fileName = Constants.FILE_IN_LV5;
									isResumeLevel = false;
								} else {
									if ("Level_6".equals(cmd)) {
										fileName = Constants.FILE_IN_LV6;
										isResumeLevel = false;
									}
								}
							}
						}
					}
				}
			}
			if ("New".equals(cmd)) {
//				System.out.println("new" + fileName);
				try {
					this.sdkPanel.panel.getGame().readData(fileName);
					this.selectedLbl = null;
					this.isSelected = true;
					this.sdkPanel.panel.refreshGame();
				} catch (MyException e1) {
					JOptionPane.showMessageDialog(this.sdkPanel, "Error: ", fileName, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			if ("Save".equals(cmd)) {
				try {
					this.sdkPanel.panel.getGame().writeData(Constants.FILE_OUT_RESUME);
				} catch (MyException ex) {
					JOptionPane.showMessageDialog(this.sdkPanel, "Error: " + ex.getMessage(), "Error",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			if ("Resume".equals(cmd)) {
				try {
					if (isResumeLevel) {
						this.sdkPanel.panel.getGame().readDataResume(Constants.FILE_OUT_RESUME);
					} else {
						this.sdkPanel.panel.getGame().readDataResume(fileName);
					}

					this.selectedLbl = null;
					this.isSelected = true;
					this.sdkPanel.panel.refreshGame();
				} catch (MyException e1) {
					JOptionPane.showMessageDialog(this.sdkPanel, "Error: ", fileName, JOptionPane.INFORMATION_MESSAGE);
				}
			}
			if ("About game".equals(cmd)) {
				//
				JOptionPane.showMessageDialog(this.sdkPanel,
						" App: Sodoku Game\n Admin: Nguyen Van An\n Học phần: Công nghệ Java\n University: University of Transport and Communications.(UTC) ",
						"About Game", JOptionPane.INFORMATION_MESSAGE);

				//
//				AboutGame aboutGame = new AboutGame();
//				aboutGame.setVisible(true);
			}
			if ("Game rule".equals(cmd)) {
				JOptionPane.showMessageDialog(this.sdkPanel,
						" Điền các con số từ 1 đến 9 cho cả các ô còn trống và thỏa mãn 2 điều kiện sau:\r\n" + "\r\n"
								+ "I: Số bạn điền không bị trùng trong 9 ô nhỏ tỉ lệ 3x3.\r\n" + "\r\n"
								+ "II: Số bạn điền phải là duy nhất trong 9 số dãy hàng ngang, hàng dọc mà nó nằm lên trên. ",
						"Game Rule", JOptionPane.INFORMATION_MESSAGE);

			}
			if ("Hint".equals(cmd) && this.isSelected && this.selectedLbl != null) {

				JDialog aboutGame = new JDialog(sdkPanel, "Hint");
				aboutGame.setSize(500, 200);
				aboutGame.setLocation(750, 350);
				aboutGame.setVisible(true);

				JPanel mainDialog = new JPanel();
				mainDialog.setLayout(new BorderLayout());

				String hintInt = "";

				Node node = this.selectedLbl.getNode();
				Node nodeS = new Node(node.getRow(), node.getColumn(), 0, false);
				Game game = this.sdkPanel.panel.getGame();
				boolean[] isHint = game.hint(nodeS);
				int i = 1;
				for (boolean b : isHint) {
//					System.out.println(b);
					if (b) {
						hintInt += " [ " + i + " ] ";
					}
					i++;
				}

				JLabel comment = new JLabel("Các giá trị có thể điền ở vị trí này:" + hintInt);
				mainDialog.add(comment);
				aboutGame.setContentPane(mainDialog);

			} else {
				if ("Hint".equals(cmd)) {
					JOptionPane.showMessageDialog(this.sdkPanel, "Chọn ô cần trợ giúp!", "Chú ý",
							JOptionPane.INFORMATION_MESSAGE);

				}
			}
		}
	}

	/*
	 * MouseListener
	 */

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println(e.getSource());
		if (e.getSource() instanceof SDKLabel) {
			if (this.isSelected) {
				SDKLabel lbl = (SDKLabel) e.getSource();
//				System.out.println(lbl.getText());
				if (this.selectedLbl != null) {
					this.selectedLbl.setSelected(false);
					this.selectedLbl.setBackground();
				}
				lbl.setSelected(true);
				this.selectedLbl = lbl;
				this.selectedLbl.setBackground();
			}
		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

}
