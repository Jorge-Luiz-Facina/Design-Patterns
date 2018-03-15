
public class CompositeExample {

	public static void main(String[] args) {
		Sprite spriteTree = new Sprite("Tree");
		Sprite spriteStreet = new Sprite("Street");
		Sprite spriteGrass = new Sprite("grass");
		
		CompositeAnimation animation = new CompositeAnimation("Game Scenario One");
		
		animation.add(spriteStreet);
		animation.add(spriteTree);
		animation.add(spriteGrass);
		animation.printName();
		animation.remove("Street");
		System.out.println();
		animation.printName();

	}
}
