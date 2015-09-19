
public class ObserverPatternDemo {
	 public static void main(String[] args) {
		 
		 Subject subject = new Subject();
		 
		 new HexaObserver(subject);
		 new OctalObserver(subject);
		 new BinaryObserver(subject);
		 
		 System.out.println("set  state to 15");	
		 subject.setState(15);
		 
	 }
}
