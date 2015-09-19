import java.util.Hashtable;


public class ShapeCache {
	private static Hashtable<String,Shape> hashmap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String shapeid){
		Shape cacheShape = (Shape)hashmap.get(shapeid).clone();
		return cacheShape;
	}
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		hashmap.put(circle.getId(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("2");
		hashmap.put(rectangle.getId(), rectangle);
		
		Square square = new Square();
		square.setId("3");
		hashmap.put(square.getId(), square);
	}
	
}
