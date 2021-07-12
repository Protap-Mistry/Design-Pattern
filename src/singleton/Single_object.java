package singleton;

public class Single_object {
	//static is used for a constant variable or method that is same for every instance of class
	private static Single_object instance= new Single_object();
	//instance variables hold values that must be referenced by more than one method, constructor or 
	//block or essential parts of an objects state that must be present throughout the class
	private Single_object() {};
	
	public static Single_object getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Singleton Pattern");
	}
}
