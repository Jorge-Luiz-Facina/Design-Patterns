
public abstract class Weapon {

	public final void shoot(){
		weaponPosition();
		toAim();
		fire();
		recharge();
	}
	
	public abstract void weaponPosition();
	
	public void toAim(){
		System.out.println("point to the enemy");
	}
		
	public void recharge(){
		System.out.println("reloading");
	}
	
	public abstract void fire();

}
