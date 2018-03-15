
public class Sprite extends SpriteFlyweight{

	protected Image image;

	public Sprite(String name) {
		image = new Image(name);
	}

	@Override
	public void renderImage() {
		image.renderImage();
		System.out.println("render image at random point of the map");
	}
}
