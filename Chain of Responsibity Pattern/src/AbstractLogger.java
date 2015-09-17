
public abstract class AbstractLogger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	protected int level;
	
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger abstractLogger){
		this.nextLogger = abstractLogger;
	}
	
	public void logMessage(int level,String msg){
		if(this.level == level)
			Write(msg);
		if(this.nextLogger != null)
			nextLogger.logMessage(level, msg);
	}
	
	protected abstract void Write(String msg);
}
