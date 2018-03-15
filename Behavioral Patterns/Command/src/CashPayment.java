
public class CashPayment implements CommandPayment {
	public void executePurchase(Purchase purchase) {
		System.out.println("Cash: " + purchase.getPurchase());		
	}
}
