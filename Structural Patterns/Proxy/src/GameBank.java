
public class GameBank {

	private int numberUsers;
	private int onlineUsers;
	private int onlineModePvp;
	private int onlineModeCoop;

	public GameBank() {
		numberUsers = 10 + (int) (Math.random() * 100);
		onlineUsers = 9 + (int) (Math.random() * 10);
		onlineModePvp = (int) (Math.random() * 5);
		onlineModeCoop = (int) (Math.random() * 5);
	}

	public int getNumberUsers() {
		return numberUsers;
	}

	public int getOnlineUsers() {
		return onlineUsers;
	}

	public int getOnlineModePvp() {
		return onlineModePvp;
	}

	public int getOnlineModeCoop() {
		return onlineModeCoop;
	}
}
