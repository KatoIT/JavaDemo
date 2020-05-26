package SDK;

//import java.util.Scanner;

public class mainTest {
	public static void main(String[] args) {
		SDKFrame frame = new SDKFrame();
		
		frame.setVisible(true);
		
		//		int a=2;
//		int b=2;
//		int r = a / 3;
//		int c = b / 3;
//		int zone = r * 3 + c;
//		System.out.println(zone);
//		int a[][] = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
//
//				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
//
//				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };
//
//		Game E = new Game();
//
//		E.readData(a);
//		E.showGame();
//		System.out.println(E.getElement(0, 0).getValua());
//		E.getElement(1, 1).showTest(E, 1, 1);
//		Scanner scanner = new Scanner(System.in);
//
//		while (!E.checkGame()) {
//			System.out.println("\nRow: ");
//			int row = -1 + scanner.nextInt();
//			System.out.println("Col: ");
//			int col = -1 + scanner.nextInt();
//			if (!E.getElement(row, col).getLock()) {
//				System.out.println("Vi tri nay khong duoc thay doi. Moi chon lai!");
//			} else {
//				System.out.println("Valua: ");
//				int val = scanner.nextInt();
//				
//				E.getElement(row, col).setValua(val);
////				System.out.println(E.getElement(row, col).getValua());
//				
//				
//				
//					
//				
//			}
//			E.showGame();
///
		}
//		scanner.close();
//	}

}

//package SDK;
//
//import javax.swing.JFrame;
//
//public class SDKFrame extends JFrame {
//
//	private static final long serialVersionUID = 1L;
//
//	SDKMenu menu = new SDKMenu();
//	SDKPanel panel = new SDKPanel();
//
//	public SDKFrame() {
//		super("Sodoku Game");
//
//		// Thiết lập các thông số giao diện
//		this.setLocation(560, 315);
//		this.setSize(630, 600);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setResizable(false);
//
//		this.init();
//
//	}
//
//	private void init() {
//		this.setJMenuBar(menu);
//		this.setContentPane(panel);
//	}
//
//}

