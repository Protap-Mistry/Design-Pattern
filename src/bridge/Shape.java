package bridge;

public abstract class Shape {
	protected DrawAPI d;
	
	protected Shape(DrawAPI d) {
		this.d= d;
	}
	
	public abstract void draw();
}
