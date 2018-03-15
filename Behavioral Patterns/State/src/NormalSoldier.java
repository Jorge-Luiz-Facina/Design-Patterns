
public class NormalSoldier implements SoldierState{

	public SoldierState die() {
		System.out.println("dead soldier");
		return this;
	}

	public SoldierState kill() {
		System.out.println("angry soldier");
		return new AngrySoldier();
	}

	public SoldierState damage() {
		System.out.println("damage: 20");
		return this;
	}

	public SoldierState life() {
		System.out.println("life: 80");
		return this;
	}
}
