
public class Soldier {
	
	protected SoldierState state;
	
	public Soldier(){
		state = new NormalSoldier();
	}
	
	public void die() {
		state = state.die();
	}

	public void kill() {
		state = state.kill();
	}

	public void damage() {
		state = state.damage();
	}

	public void life() {
		state = state.life();
	}
}
