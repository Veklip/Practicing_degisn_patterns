
public class ComputerPartDisplayVistor implements ComputerPartVistor {

	@Override
	public void visit(Monitor monitor) {
		// TODO Auto-generated method stub
		System.out.println("dispaly monitor");
	}

	@Override
	public void visit(Keyboard keyboard) {
		// TODO Auto-generated method stub
		System.out.println("dispaly keyboard");
	}

	@Override
	public void visit(Mouse mouse) {
		// TODO Auto-generated method stub
		System.out.println("dispaly mouse");
	}

	@Override
	public void visit(Computer computer) {
		// TODO Auto-generated method stub
		System.out.println("dispaly computer");
	}

}
