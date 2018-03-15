
public class PrototypeExample {

	public static void main(String[] args) {
		ZombiePrototype zombiePrototype = new ZombiePrototype(23);
		System.out.println(zombiePrototype.info());
		
		EnemyPrototype zombie = zombiePrototype.clone();
		zombie.setDamage(12);
		System.out.println(zombie.info());
	}
}
