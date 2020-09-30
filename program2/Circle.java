package program2;
/**
 * This class calculates the area and perimeter of a circle and gives it a color.
 * It gets the color for the Shape super class.
 * @author Riley
 */
public class Circle extends Shape {
	
	// Fields
	double radius = 1;
	
	// Constructors
	/**
	 * This constructs the circle with the radius and the color.
	 * @param inRadius the radius of the circle
	 * @param color the color of the circle
	 */
	public Circle(double inRadius , String color) {
		super.setColor(color);
		radius = inRadius;
	}
	/**
	 * This overloads the circle constructor and omits the color using the default of white.
	 * @param inRadius the radius of the circle
	 */
	public Circle(double inRadius) {
		radius = inRadius;
	}
	/**
	 * This constructs a circle using the default radius, 1.
	 * @param color the color of the circle
	 */
	public Circle(String color) {
		super.setColor(color);
	}
	/**
	 * This constructs a circle and uses the default radius, 1, and the default color, white.
	 */
	public Circle() {
		
	}
	
	// Methods
	/**
	 * This method calculates the perimeter of the circle.
	 * @return the perimeter as a double
	 */
	public double perimeter() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	/**
	 * This method calculates the area of the circle.
	 * @return the area as a double
	 */
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	/**
	 * @return The shape and color of the circle as strings and the radius, area, and perimeter as doubles.
	 */
	@Override
	public String toString() {
		String result = "Shape: Circle\nColor: "+super.getColor()+"\nRadius: "+radius+"\nArea: "+area()+"\n";
		result += "Perimeter: "+perimeter()+"\n";
		return result;
	}
}
