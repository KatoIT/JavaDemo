package chap02.oop;

public class Teacher extends Person{

	public Teacher(int date, String name, String sex) {
		super(date, name, sex);
		// TODO Auto-generated constructor stub
	}
	private int luong;
	
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
}
