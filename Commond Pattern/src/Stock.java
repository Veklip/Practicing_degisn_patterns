
public class Stock {
	private String name = "abc";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("stock:"+name+" quantity="+quantity+" bought");
	}
	
	public void sell(){
		System.out.println("stock:"+name+" quantity="+quantity+" sold");
	}
}
