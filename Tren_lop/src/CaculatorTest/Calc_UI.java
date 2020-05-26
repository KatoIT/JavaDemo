package CaculatorTest;

public class Calc_UI {

	static CaculatorListener caculatorListener = new CaculatorListener();
	public static void main(String[] args) {
		Calc_Frame myFrame = new Calc_Frame(caculatorListener);
		myFrame.setVisible(true);
	}

}
