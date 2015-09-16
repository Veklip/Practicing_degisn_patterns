
public class FacadePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapemaker = new ShapeMaker();
		
		shapemaker.drawCircle();
		shapemaker.drawRectangle();
		shapemaker.drawSquare();
	}

}
