package lab04;

public class Pentagon implements RegularPolygon1 {
	
	public double length;
	
	public Pentagon(double sideLength) {
		length = sideLength;
	}
	
	public double perimeter() {
		double perimeter = length * 5;
		return perimeter;
	}

	public double area() {
		double area = (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(length, 2)) / 4;
		return area;
	}
}
