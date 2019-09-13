package bromma.aaron;

public class Point {
	
	private int x;
	private int y;
	
	/**
	 * 
	 */
	public Point() {
		this(0,0);
	}
	/**
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	public double distance( int x, int y ) {
		int deltaX= x - this.x;
		int deltaY= y - this.y;		
		return Math.sqrt( (double)((deltaX*deltaX) + (deltaY*deltaY)) );				
	}
	
	public double distance() {		
		return distance(0,0);		
	}
	
	public double distance ( Point p ) {	
		return distance(p.x,p.y);
	}
}
