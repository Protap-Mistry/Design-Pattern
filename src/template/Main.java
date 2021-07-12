package template;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g= new Cricket();
		g.play();
		
		System.out.println();
		
		g= new Football();
		g.play();
	}

}
