import java.util.ArrayList;
import java.util.List;


public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void showItems(){
		for(Item item : items){
			System.out.print("item:"+item.name());
			System.out.print(",packing:"+item.packing().pack());
			System.out.println(",price:"+item.price());
		}
	}
	
	public float getCost(){
		float sum=0;
		for(Item item : items){
			sum += item.price();
		}
		return sum;
	}
}
