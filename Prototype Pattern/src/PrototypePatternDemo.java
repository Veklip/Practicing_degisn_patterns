
public class PrototypePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadCache();
		
		Shape shape1 = ShapeCache.getShape("1");
		System.out.println("Shape : " + shape1.getType());
		
		Shape shape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + shape2.getType());	
		
		Shape shape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + shape3.getType());	
	}

}