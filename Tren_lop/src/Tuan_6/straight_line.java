package Tuan_6;

public class straight_line implements Shape_t6{
	private double a;
	private double b;
	@Override
	public String toString() {
		if(b > 0) return "straight_line: y = " + a + "x + " + b ;
		else if(b==0) return "straight_line: y = " + a + "x";
		return "straight_line: y = " + a + "x " + b ;
	}
	public straight_line(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public straight_line() {
		super();
		this.a = 0;
		this.b = 0;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double distance() {
		return (Math.abs(this.b) / Math.sqrt(this.a * this.a +1));
	}
	
	public boolean check(double x, double y) {
		double valua = this.a * x + b;
		if(Math.abs(y - valua ) < 0.0000001) return true;
		else return false;
	}
	
}
