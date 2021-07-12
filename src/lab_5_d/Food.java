package lab_5_d;

import java.util.ArrayList;
import java.util.List;

public class Food implements PeanutButterAndJellySandwich{
	
	String name;
	List<PeanutButterAndJellySandwich> food= new ArrayList<>();
	
	public Food(String name) {
		this.name= name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void addFood(PeanutButterAndJellySandwich f) {
		food.add(f);
	}
	public void removeFood(PeanutButterAndJellySandwich f) {
		food.remove(f);
	}
	
	@Override
	public void makeFood() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(PeanutButterAndJellySandwich f: food) {
			f.makeFood();
		}
	}

}
