package lab04;

public class EquilateralTriangle1 implements RegularPolygon1 {
	
	public double length;
	
	public EquilateralTriangle1(double sideLength) {
		length = sideLength;
	}
	
	public double perimeter() {
		double perimeter = length * 3;
		return perimeter;
	}
	
	public double area() {
		double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
		return area;
	}

}
