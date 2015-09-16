
public class Computer implements ComputerPart {

	private ComputerPart[] parts;
	
	public Computer(){
		parts = new ComputerPart[]{new Keyboard(),new Monitor(),new Mouse()};
	}
	
	@Override
	public void accept(ComputerPartVistor computerPartVistor) {
		// TODO Auto-generated method stub
		for(ComputerPart part: parts){
			part.accept(computerPartVistor);
		}
		computerPartVistor.visit(this);
	}

}
