
public class ProxyExample {

	public static void main(String[] args) {
		ProxyBank proxyBank = new ProxyBank("GM", "GM");
		info(proxyBank,"Game Master");
		
		ProxyBank anonymous = new ProxyBank("Admin", "Admin");
		info(anonymous,"Anonymous");
	}
			
	public static void info(ProxyBank bank,String name){
		System.out.println(name);
		System.out.println("Number Users: " + bank.getNumberUsers());
		System.out.println("Online Users: " + bank.getOnlineUsers());
		System.out.println("Online Mode Coop: " + bank.getOnlineModeCoop());
		System.out.println("Online Mode Pvp: " + bank.getOnlineModePvp());
	}
}
