
public class CommandExample {
	public static void main(String[] args) {
		Store storeMMORPG = new Store("MMORPG");
		storeMMORPG.purchase("Shield", 0.00001, new BitcoinPayment());
		storeMMORPG.purchase("Magic", 100, new GoldPayment());
		storeMMORPG.purchase("Weapon", 10, new CashPayment());
	}
}
