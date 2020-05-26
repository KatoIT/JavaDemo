package CaculatorTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaculatorListener implements ActionListener{
	
	Calc_Frame frame ;
	private double firstNumber;
	private double secondNumber;
	private int operation = 0;
	private boolean isContinue = false;
//	String abc = 
	
	@Override
	public void actionPerformed(ActionEvent e)  {
		String cmd = e.getActionCommand();
//		System.out.println(abc);
		if ("C".equals(cmd)) {
			frame.textFld.setText("0");
			operation = 0;
			isContinue = false;
		}
		if ("0".equals(cmd) || "1".equals(cmd) || "2".equals(cmd) || "3".equals(cmd) || "4".equals(cmd)
				|| "5".equals(cmd) || "6".equals(cmd) || "7".equals(cmd) || "8".equals(cmd) || "9".equals(cmd)) {
			if (isContinue) {
				frame.textFld.setText("0");
				if ("0".equals(frame.textFld.getText())) {
					frame.textFld.setText(cmd);
				} else {
					frame.textFld.setText(frame.textFld.getText() + cmd);
				}
				isContinue = false;
			} else {
				frame.textFld.setText("000000");
				if ("0".equals(frame.textFld.getText())) {
					frame.textFld.setText(cmd);
				} else {
					frame.textFld.setText(frame.textFld.getText() + cmd);
				}
			}
		}
		if ("=".equals(cmd)) {
			if (operation != 0) {
				secondNumber = Double.parseDouble(frame.getText());
				double result = 0;
				switch (operation) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				}
				frame.textFld.setText("" + result);
				operation = 0;
			}
		}
		if ("+".equals(cmd)) {
			if (operation == 0) {
				firstNumber = Double.parseDouble(frame.textFld.getText());
				operation = 1;
			} else {
				secondNumber = Double.parseDouble(frame.textFld.getText());
				double result = 0;
				switch (operation) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				}
				frame.textFld.setText("" + result);
				operation = 1;
				firstNumber = result;
			}
			isContinue = true;
		}

		if ("-".equals(cmd)) {
			if (operation == 0) {
				firstNumber = Double.parseDouble(frame.textFld.getText());
				operation = 2;
			} else {
				secondNumber = Double.parseDouble(frame.textFld.getText());
				double result = 0;
				switch (operation) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				}
				frame.textFld.setText("" + result);
				operation = 2;
				firstNumber = result;
			}
			isContinue = true;
		}

		if ("x".equals(cmd)) {
			if (operation == 0) {
				firstNumber = Double.parseDouble(frame.textFld.getText());
				operation = 3;
			} else {
				secondNumber = Double.parseDouble(frame.textFld.getText());
				double result = 0;
				switch (operation) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				}
				frame.textFld.setText("" + result);
				operation = 3;
				firstNumber = result;
			}
			isContinue = true;
		}

		if ("/".equals(cmd)) {
			if (operation == 0) {
				firstNumber = Double.parseDouble(frame.textFld.getText());
				operation = 4;
			} else {
				secondNumber = Double.parseDouble(frame.textFld.getText());
				double result = 0;
				switch (operation) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
				}
				frame.textFld.setText("" + result);
				operation = 4;
				firstNumber = result;
			}
			isContinue = true;
		}

		if ("DEL".equals(cmd)) {
			String value = frame.textFld.getText();
			if (value.length() == 1) {
				frame.textFld.setText("0");
			} else {
				value = value.substring(0, value.length() - 1);
				frame.textFld.setText(value);
			}
		}
	}
}
