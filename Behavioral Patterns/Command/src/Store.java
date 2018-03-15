
public class Store {
	protected String name;
	
	public Store(String name){
		this.name = name;
	}
	
	public void purchase(String item,double string,CommandPayment  wayBuy){
		Purchase purchase = new Purchase(name);
		purchase.setValue(string);
		purchase.setItem(item);
		wayBuy.executePurchase(purchase);
	}
}
