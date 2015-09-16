
public class CommondPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock abcstock = new Stock();
		
		Order buy = new BuyStock(abcstock);
		Order sell = new SellStock(abcstock);
		
		Broker broker = new Broker();
		broker.takeOrder(buy);
		broker.takeOrder(sell);
		
		broker.placeOrder();
	}

}
