
public class FactoryMethodExample {
	
	public static void main(String[] args) {
		FactoryCharacter factoryCharacter = new FactoryCharacter();
		factoryCharacter.getCharacter("Lery", "Archer");
		factoryCharacter.getCharacter("Engh", "Wizard");
	}
}
