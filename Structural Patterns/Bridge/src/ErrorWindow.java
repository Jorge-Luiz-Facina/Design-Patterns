
public class ErrorWindow extends AbstractWindow{

	public ErrorWindow(MobileWindow window) {
		super(window);
	}

	@Override
	public void create() {
		createWindow("unknown error");
		createDescription("error number: xxxxxx");
		createDescription("more information on: www.???");
	}	
}
