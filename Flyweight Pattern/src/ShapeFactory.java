import java.util.HashMap;


public class ShapeFactory {
	
	private static final HashMap<String,Shape> hashmap = new HashMap<String,Shape>();
	
	public static Circle getCircle(String color){
		Circle circle = (Circle) hashmap.get(color);
		if (circle == null){
			circle = new Circle(color);
			hashmap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
