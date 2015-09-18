
public class StrategyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());

		System.out.println("10+5="+context.execStragety(10,5));

		context = new Context(new OperationSubstract());
		System.out.println("10-5="+context.execStragety(10,5));

		context = new Context(new OperationMultiply());
		System.out.println("10*5="+context.execStragety(10,5));
		//context.execStragety(num1, num2)
	}

}
