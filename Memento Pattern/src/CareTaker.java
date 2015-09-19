import java.util.ArrayList;
import java.util.List;


public class CareTaker {
	private List<Memento> mementolist = new ArrayList<Memento>();
	
	public void add(Memento m){
		mementolist.add(m);
	}
	
	public Memento get(int index){
		return mementolist.get(index);
	}
}
