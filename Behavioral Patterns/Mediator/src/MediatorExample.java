
public class MediatorExample {	
	public static final String NAME_LENO = "Leno";
	public static final String NAME_Tari= "Tari";
	public static final String NAME_JOSE = "Jose";
	
	public static void main(String[] args) {
		GeneralChat chat = new GeneralChat();
		
		User leno = new User01(NAME_LENO);
		User tari = new User02(NAME_Tari);
		User jose = new User01(NAME_JOSE);
		
		chat.register(leno);
		chat.register(tari);
		chat.register(jose);
		
		leno.submit(NAME_Tari, "Hello");
		tari.submit(NAME_LENO, "Hello!!!");
		
		leno.submit(NAME_JOSE, "Hello Jose");
		jose.submit(NAME_LENO, "Hello Leno");
	}
}
