package program2;
/**
 * This class calculates the area and perimeter of a rectangle and gives it a color.
 * It gets the color from the Shape super class.
 * @author Riley
 */
public class Rectangle extends Shape {
	
	// Fields
	public double height = 1;
	public double width = 1;
	
	// Constructors
	/**
	 * This constructs a rectangle using the width, height and color.
	 * @param inWidth the width of the rectangle
	 * @param inHeight the height of the rectangle
	 * @param color the color of the rectangle
	 */
	public Rectangle(double inWidth, double inHeight, String color) {
		height = inHeight;
		width = inWidth;
		super.setColor(color);
	}
	/**
	 * The constructs a rectangle using the width, height and the default color white.
	 * @param inWidth the width of the rectangle
	 * @param inHeight the height of the rectangle
	 */
	public Rectangle(double inWidth, double inHeight) {
		height = inHeight;
		width = inWidth;
	}
	/**
	 * This constructs a rectangle using the default side lengths and a color.
	 * @param color the color of the rectangle
	 */
	public Rectangle(String color) {
		super.setColor(color);
	}
	/**
	 * This constructs the rectangle using the default side lengths, 1, and default color, white.
	 */
	public Rectangle() {
		
	}	
	// Methods
	/**
	 * This method calculates the perimeter of the rectangle.
	 * @return the perimeter of the rectangle as a double
	 */
	public double perimeter() {
		double perimeter = 2 * (height + width);
		return perimeter;
	}
	/**
	 * This method calculates the area of the rectangle
	 * @return the area of the rectangle as a double
	 */
	public double area() {
		double area = height * width;
		return area;
	}
	/**
	 * @return The shape and color of the rectangle and the height, width, area and parimeter as doubles.
	 */
	@Override
	public String toString() {
		String result = "Shape: Rectangle\nColor: "+super.getColor()+"\nWidth: "+width+"\nHeight: "+height+"\n";
		result += "Area: "+area()+"\nPerimeter: "+perimeter()+"\n";
		return result;
	}
}
