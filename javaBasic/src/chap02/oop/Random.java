package chap02.oop;
public class Random {
	public static void main(String[] args) {
		int i =(int) (Math.random()*2);
		if(i!=0) System.out.println("Ve que an Tet");
		else System.out.println("Hoc Hanh La Tren Het");
	}
}