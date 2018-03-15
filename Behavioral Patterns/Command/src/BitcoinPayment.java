
public class BitcoinPayment implements CommandPayment{
	public void executePurchase(Purchase purchase) {
		System.out.println("Bitcoin: " + purchase.getPurchase());	
	}
}
