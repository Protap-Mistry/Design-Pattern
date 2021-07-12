package state;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c= new Context();
		
		StartState start= new StartState();
		start.doAction(c);
		System.out.println(c.getState().toString()+"\n");
		
		StopState stop= new StopState();
		stop.doAction(c);
		System.out.println(c.getState().toString());
	}

}
