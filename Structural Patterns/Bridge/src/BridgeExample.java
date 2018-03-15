
public class BridgeExample {
	public static void main(String[] args) {
		AbstractWindow window = new ErrorWindow(new AndroidWindow());
		window.create();
		
		window = new ErrorWindow(new IOSWindow());
		window.create();
		
		window = new NotificationsWindow(new IOSWindow());
		window.create();
	}
}
