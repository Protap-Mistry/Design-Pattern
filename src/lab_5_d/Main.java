package lab_5_d;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food= new Food("PeanutButterAndJellySandwich");
		Food bread= new Food("Bread");
		Food peanut_butter= new Food("PeanutButter");
		Food jelly= new Food("Jelly");
		
		PeanutButterAndJellySandwich flour= new SubFoods("Flour");
		PeanutButterAndJellySandwich salt= new SubFoods("Salt");
		PeanutButterAndJellySandwich fruit= new SubFoods("Fruit");
		PeanutButterAndJellySandwich sugar= new SubFoods("Sugar");
		
		food.addFood(bread);
		food.addFood(peanut_butter);
		food.addFood(jelly);
		
		bread.addFood(flour);
		bread.addFood(salt);
		
		jelly.addFood(fruit);
		jelly.addFood(sugar);
		
		food.makeFood();
		//bread.makeFood();
		//peanut_butter.makeFood();
		//jelly.makeFood();
	}

}
