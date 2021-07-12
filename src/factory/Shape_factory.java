package factory;

public class Shape_factory {
	public Shape getShape(String str) {
		if(str==null) {
			return null;
		}
		if(str.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(str.equalsIgnoreCase("square")) {
			return new Square();
		}
		return null;
	}
	
}
