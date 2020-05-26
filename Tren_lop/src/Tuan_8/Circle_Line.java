package Tuan_8;

public class Circle_Line implements Operator{

	private Double a;
	private Double b;
	private Double r;
	public Circle_Line(Double a, Double b, Double r) {
		super();
		this.a = a;
		this.b = b;
		this.r = r;
	}
	public Double getA() {
		return a;
	}
	public void setA(Double a) {
		this.a = a;
	}
	public Double getB() {
		return b;
	}
	public void setB(Double b) {
		this.b = b;
	}
	public Double getR() {
		return r;
	}
	public void setR(Double r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "\nCircle_Line:   [ (x - " + a + ")^2 + (y - " + b + ")^2 = " + r + "^2\t]";
	}
	// distance
	public double distance() {
		double var = Math.sqrt(this.a * this.a + this.b * this.b);
		return var;
	}
	public String writeFile() {
		return a + ", " + b + ", " + r;
	}
}
