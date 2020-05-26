package Tuan_6;

public class Circle_tt6 implements Shape_t6 {
	private double x;
	private double y;
	private double r;
	public Circle_tt6(double x, double y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public Circle_tt6() {
		super();
		this.x = 0;
		this.y = 0;
		this.r = 0;
	}
	@Override
	public String toString() {
		return "Circle_tt6 [x=" + x + ", y=" + y + ", r=" + r + "]";
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	
	public boolean check(double a, double b) {
		double val = (a - this.x) * (a - this.x) + (b - this.y) * (b - this.y);
		if(Math.abs(this.r * this.r - val)< 0.0000001 ) return true;
		else return false;
	}
	
}
