
public class BridgePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redcircle = new Circle(100,100,10,new RedCircle());
		Shape greencircle = new Circle(100,100,10,new GreenCircle());
		
		redcircle.draw();
		greencircle.draw();
	}

}
