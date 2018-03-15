
public class ObserverExample {
	public static void main(String[] args) {
		
		Money money = new Money();
		Shop shop = new Shop(money);
		money.setValue(1500);
		
	}
}
