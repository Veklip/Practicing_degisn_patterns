
public class BuilderPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder builder = new MealBuilder();
		Meal meal = builder.prepareChickenMeal();
		System.out.println("get chicken meal");
		meal.showItems();
		System.out.println("total cost of meal="+meal.getCost());
		
		meal = builder.prepareVegMeal();
		System.out.println("get veg meal");
		meal.showItems();
		System.out.println("total cost of meal="+meal.getCost());
	}

}
