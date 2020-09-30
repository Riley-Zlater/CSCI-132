package program2;
/**
 * This class calculates the area and perimeter of an equilateral triangle.
 * It does this by implementing information from the RegularPolygon interface and
 * gets the color from the Shape super class.
 * @author Riley
 */
public class EquilateralTriangle extends Shape implements RegularPolygon {
	
	// Fields
	public double length = 1;
	
	// Constructors
	/**
	 * This constructs an equilateral triangle with a specified side length and color.
	 * @param sideLength the side length of the triangle
	 * @param color the color of the triangle
	 */
	public EquilateralTriangle(double sideLength, String color) {
		length = sideLength;
		super.setColor(color);
	}
	/**
	 * This constructs an equilateral triangle with only a specified side length.
	 * It also overloads the EquilateralTriangle constructor.
	 * @param sideLength the side length of the triangle
	 */
	public EquilateralTriangle(double sideLength) {
		length = sideLength;
	}
	/**
	 * This constructs a equilateral triangle using the default side length, 1.
	 * @param color the color of the triangle
	 */
	public EquilateralTriangle(String color) {
		super.setColor(color);
	}
	/**
	 * This constructor creates a default base case of calling the class without inputing information.
	 */
	public EquilateralTriangle() {
		
	}
	
	// Methods
	/**
	 * Calculates the perimeter of the equilateral triangle and returns that value.
	 * @return the triangles perimeter as a double
	 */
	public double perimeter() {
		double perimeter = length * 3;
		return perimeter;
	}
	/**
	 * Calculates the area of the equilateral triangle and returns that value.
	 * @return the triangles area as a double
	 */
	public double area() {
		double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
		return area;
	}
	/**
	 * @return The shape and color of the equilteral triangle as string and the side length, area, and parimeter as doubles.
	 */
	@Override
	public String toString() {
		String result = "Shape: Equilateral Triangle\nColor: "+super.getColor()+"\nSide: "+length+"\n";
		result += "Area: "+area()+"\nPerimeter: "+perimeter()+"\n";
		return result;
	}
}
