
public class VistorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVistor());
	}

}
