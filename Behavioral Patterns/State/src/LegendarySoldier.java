
public class LegendarySoldier implements SoldierState {

	public SoldierState die() {
		System.out.println("neutralized soldier");
		return new NormalSoldier();
	}

	public SoldierState kill() {
		System.out.println("legendary soldier!!!");
		return new LegendarySoldier();
	}

	public SoldierState damage() {
		System.out.println("damage: 40");
		return this;
	}

	public SoldierState life() {
		System.out.println("life: 100");
		return this;
	}
}
