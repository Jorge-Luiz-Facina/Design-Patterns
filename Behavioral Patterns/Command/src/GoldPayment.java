
public class GoldPayment implements CommandPayment{

	public void executePurchase(Purchase purchase) {
		System.out.println("Gold: " + purchase.getPurchase());
		
	}
}
