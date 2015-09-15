
public class ShapeFactory extends AbstractFactory{
	public Shape getShape(String shapeType){
		if(shapeType == null)
			return null;
		if(shapeType.equalsIgnoreCase("circle"))
			return new Circle();
		if(shapeType.equalsIgnoreCase("square"))
			return new Square();
		if(shapeType.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		
		//unknown shapeType
		return null;
	}
	
	Color getColor(String color){
		return null;
	}
}
