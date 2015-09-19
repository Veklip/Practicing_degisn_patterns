
public class MementoPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("state 1");
		careTaker.add(originator.savaStateToMemento());
		
		originator.setState("state 2");
		careTaker.add(originator.savaStateToMemento());
		
		originator.setState("state 3");
		careTaker.add(originator.savaStateToMemento());
		
		System.out.println("Current State: " + originator.getState());
		
		originator.restoreStateFromMemento(careTaker.get(0));
		System.out.println("Current State: " + originator.getState());
		
		originator.restoreStateFromMemento(careTaker.get(1));
		System.out.println("Current State: " + originator.getState());
		
	}

}
