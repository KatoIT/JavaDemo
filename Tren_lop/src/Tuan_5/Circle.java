package Tuan_5;

public class Circle implements Operations, Calculations{
	private int x;
	private int y;
	private int r;

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	// khoang cach den goc toa do O(0, 0)
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	// dien tich
	public double acreage() {
		return (Math.PI * this.r * this.r);
	}

	// chu vi
	public double perimeter() {
		return (2 * Math.PI * this.r);
	}

	// di chuyen
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}

	// thu phong
	public void zoom(double z) {
		this.r *= z;
	}

	// quay
	public void rotate(double alpha) {
		// N.A
	}
}
