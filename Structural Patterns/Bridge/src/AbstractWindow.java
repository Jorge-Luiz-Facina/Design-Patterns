
public abstract class AbstractWindow {

	protected MobileWindow window;
	
	public AbstractWindow(MobileWindow window){
		this.window = window;
	}
	
	public void createWindow(String title){
		window.createWindow(title);
	}
	
	public void createDescription(String description){
		window.createDescription(description);
	}
	
	public abstract void create();	
}
