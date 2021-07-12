package decorator;

public abstract class Shape_decorator implements Shape{
	protected Shape decoratedShape;
	
	public Shape_decorator(Shape decoratedShape) {
		this.decoratedShape= decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
}
