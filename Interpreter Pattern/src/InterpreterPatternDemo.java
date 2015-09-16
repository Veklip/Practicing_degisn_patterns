
public class InterpreterPatternDemo {

	public static Expression getMaleExpression(){
		Expression jhon = new TerminalExpression("jhon");
		Expression robert = new TerminalExpression("robert");
		return new OrExpression(jhon,robert);
	}
	
	public static Expression getMarriedExpression(){
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie,married);
	}
	
	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression ismale = getMaleExpression();
		Expression ismarried = getMarriedExpression();
		
		System.out.println("jhon is a male? "+ismale.interpret("jhon"));
		System.out.println("Julie is married? "+ismarried.interpret("Julie Married"));
	}

}
