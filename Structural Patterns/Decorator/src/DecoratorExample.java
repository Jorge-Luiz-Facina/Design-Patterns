
public class DecoratorExample {

	public static void main(String[] args) {
		MagicStick magicEpicStick = new MagicEpicStick();
		System.out.println(magicEpicStick.getName() +"\nDamage: " + magicEpicStick.getDamage());
		
		magicEpicStick = new MagicFire(magicEpicStick);
		System.out.println(magicEpicStick.getName() +"\nDamage: " + magicEpicStick.getDamage());
		
		magicEpicStick = new MagicIce(magicEpicStick);
		System.out.println(magicEpicStick.getName() +"\nDamage: " + magicEpicStick.getDamage());
	}
}
