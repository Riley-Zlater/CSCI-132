package lab04;
/**
 * This class calculates the area and perimeter of a square by implementing the RegularPolygo interface and
 * getting the color of the square from the Shape super class.
 * @author Riley
 */
public class Square1 implements RegularPolygon1 {
	
	// Fields
	public double length = 1;
	
	// Constructors
	/**
	 * This constructs a Square with 
	 * @param inSide 
	 */
	public Square1(double sideLength) {
		length = sideLength;
	}

	public Square1() {
		
	}
	 public double area() {
		 double area = length * length;
		 return area;
	 }
	 
	 public double perimeter() {
		 double perimeter = 4 * length;
		 return perimeter;
	 }
}
