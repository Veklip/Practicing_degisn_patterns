import java.util.ArrayList;
import java.util.List;


public class Broker {
	private List<Order> order =new ArrayList<Order>();
	
	public void takeOrder(Order o){
		order.add(o);
	}
	
	public void placeOrder(){
		for(Order o : order){
			o.execute();
		}
		order.clear();
	}
}
