
public class Originator {
	private String state;

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}
	
	public Memento savaStateToMemento(){
		return new Memento(state);
	}
	
	public void restoreStateFromMemento(Memento m){
		state = m.getState();
	}


}
