
public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBuger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal prepareChickenMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBuger());
		meal.addItem(new Coke());
		return meal;
	}
}
