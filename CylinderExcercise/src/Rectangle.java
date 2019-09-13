
public class Rectangle {
	
	private double width;
	private double length;
	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double length) {
		super();
		if(width < 0.0) width = 0.0;
		if(length < 0.0) length = 0.0;
		this.width = width;
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @return the height
	 */
	public double getLength() {
		return length;
	}
	
	public double getArea() {
		return length * width;
	}
}
