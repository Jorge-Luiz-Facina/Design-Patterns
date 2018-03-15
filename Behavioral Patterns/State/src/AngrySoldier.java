
public class AngrySoldier implements SoldierState{

	public SoldierState die() {
		System.out.println("dead soldier");
		return new NormalSoldier();
	}

	public SoldierState kill() {
		System.out.println("legendary soldier");
		return new LegendarySoldier();
	}

	public SoldierState damage() {
		System.out.println("damage: 30");
		return this;
	}

	public SoldierState life() {
		System.out.println("life: 90");
		return this;
	}
}
