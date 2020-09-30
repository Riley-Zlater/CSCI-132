package program2;

public class ShapeDemo {
	
	public static void main(String[] args) {
	
		// Square Tests
		Rectangle mySquare = new Square(3, "cherry red");
		System.out.println(mySquare);
		
		mySquare = new Square("green");
		System.out.println(mySquare);
		
		mySquare = new Square(3.2);
		System.out.println(mySquare);
		
		mySquare = new Square();
		System.out.println(mySquare);
		
		// Circle Tests
		Circle myCircle = new Circle(1);
		System.out.println(myCircle);
		
		myCircle = new Circle(2, "yellow");
		System.out.println(myCircle);
		
		myCircle = new Circle("green");
		System.out.println(myCircle);
		
		myCircle = new Circle();
		System.out.println(myCircle);
		
		// Rectangle Tests
		Shape myRectangle = new Rectangle(3.5, 4, "periwinkle");
		System.out.println(myRectangle);
		
		myRectangle = new Rectangle("lime");
		System.out.println(myRectangle);
		
		myRectangle = new Rectangle(2, 2);
		System.out.println(myRectangle);
		
		myRectangle = new Rectangle();
		System.out.println(myRectangle);
		
		// Triangle Tests
		RegularPolygon myTriangle = new EquilateralTriangle(5, "blue");	
		System.out.println(myTriangle);
		
		myTriangle = new EquilateralTriangle("gold");
		System.out.println(myTriangle);
		
		myTriangle = new EquilateralTriangle(4);
		System.out.println(myTriangle);
		
		myTriangle = new EquilateralTriangle();
		System.out.println(myTriangle);
		
	}
}
