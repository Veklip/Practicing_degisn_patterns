
public class StartState implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("player is in start state");
		context.setState(this);
	}
	
	public String toString(){
		return "start state";
	}
}
