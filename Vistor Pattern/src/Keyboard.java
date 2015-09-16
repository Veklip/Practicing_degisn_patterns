
public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVistor computerPartVistor) {
		// TODO Auto-generated method stub
		computerPartVistor.visit(this);
	}

}
