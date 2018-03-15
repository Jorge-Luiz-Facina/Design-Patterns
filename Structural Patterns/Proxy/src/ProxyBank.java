
public class ProxyBank extends GameBank{
	protected String user, password;

	public ProxyBank(String usuario, String senha) {
		this.user = usuario;
		this.password = senha;
	}

	public int getNumberUsers() {
		if(access())
			return super.getNumberUsers();
		return -1;
	}

	public int getOnlineUsers() {
		if(access())
			return super.getOnlineUsers();
		return -1;
	}

	public int getOnlineModePvp() {
		if(access())
			return super.getOnlineModePvp();
		return -1;
	}

	public int getOnlineModeCoop() {
		if(access())
			return super.getOnlineModeCoop();
		return -1;
	}

	private boolean access() {
		return user == "GM" && password == "GM";
	}
}
