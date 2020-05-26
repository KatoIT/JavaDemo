package chap02.oop;

public class Student extends Person {

	public Student(int date, String name, String sex) {
		super(date, name, sex);
		// TODO Auto-generated constructor stub
	}
	private String lop;

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Class:\t" + this.getLop());
	}
}
