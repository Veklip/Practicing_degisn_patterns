
public class ShapeMaker {
	private Shape circle;
	private Shape square;
	private Shape rectangle;
	
	public ShapeMaker(){
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}
	
	public void drawCircle(){
		System.out.println("draw a circle");
	}
	
	public void drawSquare(){
		System.out.println("draw a square");
	}
	
	public void drawRectangle(){
		System.out.println("draw a rectangle");
	}
}
