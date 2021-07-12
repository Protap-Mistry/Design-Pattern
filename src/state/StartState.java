package state;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Game is in start mode");
		context.setState(this);
	}
	public String toString() {
		return "Start State";
	}

}
