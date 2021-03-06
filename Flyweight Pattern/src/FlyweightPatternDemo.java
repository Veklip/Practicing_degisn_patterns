
public class FlyweightPatternDemo {
	
	private static final String colors[] =
		{"red","white","blue","green","black"};
	
	private static int getRandomX(){
		return (int) (Math.random()*100);
	}
	
	private static int getRandomY(){
		return (int) (Math.random()*100);
	}
	                             
	private static String getRandomColor(){
		return colors[(int) (Math.random()*colors.length)];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++){
			Circle circle = ShapeFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}

}
