package Tuan_5;

public class point3d extends point2d {

	private double z;


	public point3d(double x2, double y2, double z) {
		super(x2, y2);
		this.z = z;
	}

	@Override
	public String toString() {
		return "point3d [x=" + getX() + ", y=" + getY() + ", z=" + z + "]";
	}

	public void move(double x, double y, double z) {
		super.move(x, y);
		this.z += z;
	}

	// khoang cach den goc toa do O(0, 0)
	@Override
	public double distance() {
		return Math.sqrt(this.z * this.z + super.distance() * super.distance());
	}

	

}
