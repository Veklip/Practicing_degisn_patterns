
public class StatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		State state1 = new StartState();
		state1.doAction(context);
		System.out.println(context.getState().toString());
		
		State state2 = new StopState();
		state2.doAction(context);
		System.out.println(context.getState().toString());
	}

}
