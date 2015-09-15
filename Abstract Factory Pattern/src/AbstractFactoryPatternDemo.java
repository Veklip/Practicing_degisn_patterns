
public class AbstractFactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory = FactoryProducer.getFactory("shape");
		
		Shape shape1 = factory.getShape("circle");
		
		shape1.draw();
		
		Shape shape2 = factory.getShape("square");

		shape2.draw();

		factory = FactoryProducer.getFactory("color");

		Color color1 = factory.getColor("blue");

		color1.fill();

		Color color2 = factory.getColor("red");

		color2.fill();
	}

}
