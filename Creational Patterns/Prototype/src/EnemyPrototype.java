
public abstract class EnemyPrototype {
	protected double damage;

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public abstract String info();

	public abstract EnemyPrototype clone();
}
