
public class ConsoleLogger extends AbstractLogger {

	public ConsoleLogger(int level){
		this.level = level;
	}
	
	@Override
	 protected void Write(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Standard Console::Logger: " + msg);
	}

}
