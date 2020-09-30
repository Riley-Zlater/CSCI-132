package program2;
/**
 * This class calculates the area and perimeter of a square by implementing the RegularPolygo interface and
 * getting the color of the square from the Shape super class.
 * @author Riley
 */
public class Square extends Rectangle implements RegularPolygon {
	
	// Fields
	public double length = 1;
	
	// Constructors
	/**
	 * This constructs a Square with 
	 * @param inSide the side length of the square
	 * @param color the color of the square
	 */
	public Square(double inSide, String color) {
		super(inSide, inSide, color);
		length = inSide;
		super.setColor(color);
	}
	/**
	 * This constructs a square with the default color, white.
	 * @param inSide the side length of the square
	 */
	public Square(double inSide) {
		super(inSide, inSide);
		length = inSide;
	}
	/**
	 * This constructs a square with the default side lengths, 1.
	 * @param color the color of the square
	 */
	public Square(String color) {
		super.setColor(color);
	}
	/**
	 * This constructs a square using the default side lengths, 1, and the default color, white.
	 */
	public Square() {
		
	}
	
	// Methods
	/**
	 * @return The shape and color of the square as strings and the side lengths, area and parimeter as doubles.
	 */
	@Override
	public String toString() {
		String result = "Shape: Square\nColor: "+getColor()+"\nSide: "+length+"\n";
		result += "Area: "+area()+"\nPerimeter: "+perimeter()+"\n";
		return result;
	}
}
