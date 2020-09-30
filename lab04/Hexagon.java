package lab04;

public class Hexagon implements RegularPolygon1{
	
	public double length;
	
	public Hexagon(double sideLength) {
		length = sideLength;
	}
	
	public double perimeter() {
		double perimeter = length * 6;
		return perimeter;
	}
	
	public double area() {
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(length, 2);
		return area;
	}
}
