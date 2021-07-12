package singleton;

public class Main {

	public static void main(String[] args) {
		//illegal construct
	    //Compile Time Error: The constructor SingleObject() is not visible
		//Single_object object= new Single_object();
		
		Single_object object= Single_object.getInstance();
		
		object.showMessage();
	}

}
