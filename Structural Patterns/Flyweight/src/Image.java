
public class Image {
	protected String name;

	public Image(String name) {
		this.name = name;
	}

	public void renderImage() {
		System.out.println(name + " rendered");
	}
}
