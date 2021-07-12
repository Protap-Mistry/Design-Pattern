package decorator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle= new Circle();
		Shape redCircle= new RedShapeDecorator(new Circle());
		
		Shape redSquare= new RedShapeDecorator(new Square());
		
		System.out.println("Circle with normal border");
		circle.draw();
		
		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nSquare of red border");
		redSquare.draw();
	}

}
