package Tuan_5;

public class point2d  implements Operations, Calculations {

	private double x;
	private double y;

	@Override
	public String toString() {
		return "point2d [x=" + x + ", y=" + y + "]";
	}

	public point2d(double x2, double y2) {
		this.x = x2;
		this.y = y2;
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

	// khoang cach den goc toa do O(0, 0)
	public double distance() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}

	// dien tich
	public double acreage() {
		return 0.0;
	}

	// chu vi
	public double perimeter() {
		return 0.0;
	}

	// di chuyen
	public void move(double x, double y) {
		this.x += x;
		this.y += y;
	}

	// thu phong
	public void zoom(double z) {
		// N.A
	}

	// quay
	public void rotate( double alpha) {
		// N.A
	}


}
