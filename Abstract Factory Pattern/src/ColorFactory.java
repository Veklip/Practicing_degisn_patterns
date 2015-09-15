
public class ColorFactory extends AbstractFactory{
	public Color getColor(String color){
		if(color == null)
			return null;
		if(color.equalsIgnoreCase("blue"))
			return new Blue();
		if(color.equalsIgnoreCase("green"))
			return new Green();
		if(color.equalsIgnoreCase("red"))
			return new Red();
		
		//unknown shapeType
		return null;
	}
	
	Shape getShape(String shape){
		return null;
	}
}
