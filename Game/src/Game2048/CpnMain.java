package Game2048;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CpnMain extends JPanel implements KeyListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Broad g;
	private topCpn topCpn;
    private footerCpn stepMove;

	public CpnMain() {
		this.init();
		this.setFocusable(true);
		

	}
	public void init() {
		g = new Broad();
		topCpn = new topCpn();
		stepMove = new footerCpn();
		BorderLayout layout = new BorderLayout();
		layout.setVgap(10);
		this.setLayout(layout);
		this.add(g, BorderLayout.CENTER);
		this.add(topCpn, BorderLayout.NORTH);
		this.add(stepMove,BorderLayout.SOUTH);
		this.addKeyListener(this);
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_ESCAPE) {
			g.resetGame();
		}

		if (!g.canMove()) {
			g.Lose = true;
			
		}
		if(g.Win) {
			JOptionPane.showMessageDialog(this, "You thắng","Yoi Win" ,JOptionPane.ERROR_MESSAGE);
			int continues = JOptionPane.showConfirmDialog(this, "Do You Want To Continue ?", "YES NO QUESTION ? ", JOptionPane.YES_NO_OPTION);
			if(continues == 0) {
				g.Win = false;
			}
			
		}
		if (!g.canMove()) {
			g.Lose = true;
			JOptionPane.showMessageDialog(this, "You thua","Bạn Thua" ,JOptionPane.ERROR_MESSAGE);
			int continues = JOptionPane.showConfirmDialog(this, "Do You Want To Continue ?", "YES NO QUESTION ? ", JOptionPane.YES_NO_OPTION);
			if(continues == 0) {
				g.resetGame();
			}
		}

		if (!g.Win && !g.Lose) {
			switch (keyCode) {
			
			case KeyEvent.VK_SPACE : 
				g.previousTurn();
				break;
			
			case KeyEvent.VK_LEFT:
				g.left();
				
				break;
			case KeyEvent.VK_RIGHT:
				g.right();

				break;
			case KeyEvent.VK_UP:
				g.up();

				break;
			case KeyEvent.VK_DOWN:
				g.down();

				break;
			}
		}

		g.paint();
		topCpn.setMainFrame(this);
		topCpn.setScore(g.myScore,g);
		stepMove.setStepMove(g.stepMove);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
