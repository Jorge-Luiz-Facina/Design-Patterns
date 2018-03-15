
public class ZombiePrototype extends EnemyPrototype{
	
	public ZombiePrototype(double damage){
		this.damage = damage;
	}
	
	public ZombiePrototype(){
		this.damage = 10;
	}
	
	public ZombiePrototype(ZombiePrototype zombiePrototype){
		this.damage = zombiePrototype.damage;
	}

	@Override
	public String info() {
		return "Zombie \nDamage: " + getDamage();
	}

	@Override
	public EnemyPrototype clone() {
		return new ZombiePrototype(this); 
	}
}
