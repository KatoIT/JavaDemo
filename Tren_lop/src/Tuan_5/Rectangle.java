package Tuan_5;


public class Rectangle implements Operations, Calculations{
	private double x1;
	private double x2;
	private double x3;
	private double x4;
	private double y1;
	private double y2;
	private double y3;
	private double y4;
	private double i1;
	private double i2;

	

	public Rectangle(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		
	}

	@Override
	public String toString() {
		return "Rectangle [x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", y1=" + y1 + ", y2=" + y2
				+ ", y3=" + y3 + ", y4=" + y4 + ", i1=" + i1 + ", i2=" + i2 + "]";
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getX3() {
		return x3;
	}

	public void setX3(double x3) {
		this.x3 = x3;
	}

	public double getX4() {
		return x4;
	}

	public void setX4(double x4) {
		this.x4 = x4;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	public double getY3() {
		return y3;
	}

	public void setY3(double y3) {
		this.y3 = y3;
	}

	public double getY4() {
		return y4;
	}

	public void setY4(double y4) {
		this.y4 = y4;
	}


	// Tam hcn & do dai canh
	public void center() {
		this.i1 = (this.x1 + this.x3) / 2;
		this.i2 = (this.y1 + this.y3) / 2;
	}

	public double wid() {
		return Math.sqrt((this.x1 - this.x2) * (this.x1 - this.x2) + (this.y1 - this.y2) * (this.y1 - this.y2));
	}
	public double len() {
		return Math.sqrt((this.x3 - this.x2) * (this.x3 - this.x2) + (this.y3 - this.y2) * (this.y3 - this.y2));
	}

	// khoang cach den goc toa do O(0, 0)
	public double distance() {
		return Math.sqrt(this.i1 * this.i1 + this.i2 * this.i2);
	}

	// dien tich
	public double acreage() {
		return (wid() * len());
	}

	// chu vi
	public double perimeter() {
		return 2 * (wid() + len());
	}

	// di chuyen
	public void move(double x, double y) {
		this.x1 += x;
		this.x2 += x;
		this.x3 += x;
		this.x4 += x;
		this.y1 += y;
		this.y2 += y;
		this.y3 += y;
		this.y4 += y;
	}

	// thu phong
	public void zoom(double z) {
		this.x1 = z * (this.x1 - this.i1) + this.i1;
		this.x2 = z * (this.x2 - this.i1) + this.i1;
		this.x3 = z * (this.x3 - this.i1) + this.i1;
		this.x4 = z * (this.x4 - this.i1) + this.i1;
		this.y1 = z * (this.y1 - this.i2) + this.i2;
		this.y2 = z * (this.y2 - this.i2) + this.i2;
		this.y3 = z * (this.y3 - this.i2) + this.i2;
		this.y4 = z * (this.y4 - this.i2) + this.i2;
	}

	// quay
	public void rotate(double alpha) {
		double cosa = Math.cos(alpha/180);
		double sina = Math.sin(alpha/180);
		//
		double var1 = this.x1 * cosa - this.y1 * sina;
		this.y1 	= this.x1 * sina + this.y1 * cosa;
		this.x1		= var1;
		//
		var1 		= this.x2 * cosa - this.y2 * sina;
		this.y2 	= this.x2 * sina + this.y2 * cosa;
		this.x2		= var1;
		//
		var1 		= this.x3 * cosa - this.y3 * sina;
		this.y3 	= this.x3 * sina + this.y3 * cosa;
		this.x3		= var1;
		//
		var1 		= this.x4 * cosa - this.y4 * sina;
		this.y4 	= this.x4 * sina + this.y4 * cosa;
		this.x4		= var1;
	}
}
