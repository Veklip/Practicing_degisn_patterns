
public class ChainofResponsibilityDemo {
	
	public static AbstractLogger getChain(){
		AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		
		infoLogger.setNextLogger(errorLogger);
		errorLogger.setNextLogger(fileLogger);
		
		return infoLogger;
		
	}
	
	public static void main(String[] args){
		AbstractLogger chain = getChain();
		chain.logMessage(AbstractLogger.INFO,"this is info log msg");
		chain.logMessage(AbstractLogger.DEBUG,"this is debug log msg");
		chain.logMessage(AbstractLogger.ERROR,"this is error log msg");
	}
}
