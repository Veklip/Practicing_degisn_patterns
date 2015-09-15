
public class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(Shape decoratedShape){
		super(decoratedShape);
	}
	
	public void draw() {
		decoratedShape.draw();
		setRedBorder();
	}
	
	public void setRedBorder(){
		System.out.println("set red border");
	}
}
