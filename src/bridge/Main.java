package bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape red= new Circle(100, 100, 10, new RedCircle());
		Shape green= new Circle(100, 100, 10, new GreenCircle());
		
		red.draw();
		green.draw();
	}

}
