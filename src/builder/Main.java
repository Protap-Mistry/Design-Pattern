package builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Meal_builder mb= new Meal_builder();
		
		Meal vegMeal= mb.prepareVegMeal();
		System.out.println("Vegetable Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: "+vegMeal.getCost());
		
		 Meal nonVegMeal = mb.prepareNonVegMeal();
	     System.out.println("\n\nNon-Veg Meal");
	     nonVegMeal.showItems();
	     System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}
