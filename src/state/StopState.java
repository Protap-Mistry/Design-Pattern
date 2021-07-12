package state;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Game is in stop mode.");
		context.setState(this);
	}
	public String toString() {
		return "Pause";
	}

}
