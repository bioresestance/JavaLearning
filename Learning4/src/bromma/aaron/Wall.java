package bromma.aaron;

public class Wall {
	
	private double width;
	private double height;
	
	/**
	 * 
	 */
	public Wall() {
		this(0.0,0.0);
	}
	/**
	 * @param width
	 * @param height
	 */
	public Wall(double width, double height) {
		if(width < 0) width = 0;
		if(height < 0) height = 0;
		this.width = width;
		this.height = height;
	}


	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		if(width < 0) width = 0;
		this.width = width;
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
		if(height < 0) height = 0;
		this.height = height;
	}
	
	public double getArea() {		
		return this.height * this.width;
	}

}
