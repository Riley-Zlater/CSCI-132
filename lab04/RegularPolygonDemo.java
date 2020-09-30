package lab04;

import java.util.Scanner;

public class RegularPolygonDemo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter value: ");
		while (!scr.hasNextDouble()) {
			System.out.println("A number please: ");
			scr.nextLine();
		}
		double sideLength = Math.abs(scr.nextDouble());
		
		System.out.println("----------------------------------------------------");
		System.out.printf("%20S %15S %15S %n", "Regular Polygon", "Area", "Perimeter");
		
		// Uncomment the following code when you have the triangle and square implemented
		
		System.out.printf("%20s", "Equilateral Triangle");
		RegularPolygon1 myPoly = new EquilateralTriangle1(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
 
		System.out.printf("%20s", "Square");
		myPoly = new Square1(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
		
		System.out.printf("%20s", "Pentagon");
		myPoly = new Pentagon(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
		
		System.out.printf("%20s", "Hexagon");
		myPoly = new Hexagon(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
		
		System.out.println("----------------------------------------------------");
		System.out.println("<end>");
		scr.close();

	}
}
