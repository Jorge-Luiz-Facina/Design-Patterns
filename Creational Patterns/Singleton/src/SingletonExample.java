
public class SingletonExample {
	public static void main(String[] args) {
		Character character = new Character();
		character.setName("yret");
		System.out.println(character.getName());

		character = character.getInstancia();
		character = new Character();
		
		System.out.println(character.getName());
	}
}
