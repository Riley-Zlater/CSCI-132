package program2;
/**
 * This class creates the color of the the shape.
 * @author Riley
 */
public abstract class Shape {
	
	// Fields
	String color = "white";
	
	// Methods
	/**
	 * This method sets the new color.
	 * @param newColor the new color of the object
	 */
	public void setColor(String newColor) {
		color = newColor;
	}
	/**
	 * This method returns the objects new color.
	 * @return the color of the object as a string
	 */
	public String getColor() {
		return color;
	}

}
