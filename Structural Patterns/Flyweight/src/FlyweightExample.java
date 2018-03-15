
public class FlyweightExample {

	public static void main(String[] args) {
		FlyweightFactory  factory = new FlyweightFactory();
		
		factory.getCharacter().renderImage();
		factory.getMonster().renderImage();
		factory.getZombie().renderImage();
		factory.getCharacter().renderImage();
		factory.getCharacter().renderImage();
		factory.getZombie().renderImage();
	}
}
