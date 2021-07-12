package bridge;

public class Circle extends Shape{
	
	private int x, y, radius;
	
	public Circle(int x, int y, int radius, DrawAPI d) {
		super(d);
		this.x= x;
		this.y= y;
		this.radius= radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		d.drawCircle(radius, x, y);
	}

}
