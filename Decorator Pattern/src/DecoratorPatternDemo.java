
public class DecoratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();
		
		Shape redcircle= new RedShapeDecorator(circle);
		
		redcircle.draw();
	}

}
