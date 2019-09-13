
public class Circle {
	/**
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		if( radius < 0.0 ) radius = 0.0;
		this.radius = radius;
	}

	public double radius;
	
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		if( radius < 0.0 ) radius = 0.0;
		this.radius = radius;
	}
}
