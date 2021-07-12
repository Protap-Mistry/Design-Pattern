package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers= new ArrayList<Observer>();
	
	private int state;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state= state;
		notifyAllObservers();
	}
	public void attach(Observer obs) {
		observers.add(obs);
	}
	public void dettach(Observer obs) {
		observers.remove(obs);
	}
	public void notifyAllObservers() {
		for(Observer obs:observers) {
			obs.update();
		}
	}
}
