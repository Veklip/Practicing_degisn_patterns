
public class TemplatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Cricket();
		game.play();
		
		game = new Football();
		game.play();
	}

}
