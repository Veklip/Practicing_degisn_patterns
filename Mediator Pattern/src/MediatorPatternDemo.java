
public class MediatorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User jhon = new User("jhon");
		User robert = new User("robert");
		
		jhon.sendMessage("hi,i am jhon.");
		robert.sendMessage("hi,i am robert.");
	}

}
