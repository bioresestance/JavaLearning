
public class Cylinder extends Circle {

	public double height;
	
	public Cylinder(double radius, double height) {
		super(radius);
		if(height < 0.0) height = 0.0;
		this.height = height;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		if(height < 0.0) height = 0.0;
		this.height = height;
	}

	public double getVolume() {
		return height * super.getArea();
	}
	
}
