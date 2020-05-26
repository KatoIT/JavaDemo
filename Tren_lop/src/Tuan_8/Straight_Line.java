package Tuan_8;

public class Straight_Line implements Operator {

	private double a;
	private double b;

	public Straight_Line(double a, double b) {
		super();
		this.a = a;
		this.b = b;
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

	@Override
	public String toString() {
		return "\nStraight_Line: [ y = " + a + "x + " + b + " \t]";
	}

	// distance
	public double distance() {
		double var = this.b / Math.sqrt(this.a * this.a + 1);
		return Math.abs(var);
	}
	public String writeFile() {
		return a + ", " + b;
	}

}
