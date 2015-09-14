
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory factory=new ShapeFactory();
		
		//get a circle obj
		Shape shape1 =  factory.getShape("circle");
		shape1.draw();
		
		//get a square obj
		Shape shape2 =  factory.getShape("square");
		shape2.draw();
		
		//get a rectangle obj
		Shape shape3 =  factory.getShape("rectangle");
		shape3.draw();
	}

}
