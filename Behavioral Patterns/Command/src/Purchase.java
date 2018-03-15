
public class Purchase {
	protected String item;
	protected String storeName;
	protected double value;

	public Purchase(String storeName) {
		this.storeName = storeName;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPurchase() {
		return new String( "\nStore: " + storeName + "  Item: " + item + "  Value: " + value);
	}
}
