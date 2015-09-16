
public interface ComputerPartVistor {
	public void visit(Monitor monitor);
	public void visit(Keyboard keyboard);
	public void visit(Mouse mouse);
	public void visit(Computer computer);
}
