
public class FileLogger extends AbstractLogger {

	public FileLogger(int level){
		this.level = level;
	}

	@Override
	protected void Write(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Error File::Logger: " + msg);
	}

}
