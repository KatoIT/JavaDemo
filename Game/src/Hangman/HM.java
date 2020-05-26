package Hangman;

public class HM {

	public void out(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
	public boolean checkAll(char a[], String b) {
		for (int i = 0; i < b.length(); i++) {
			if(a[i] != b.charAt(i)) return false;
		}
		return true;
	}
	
}
