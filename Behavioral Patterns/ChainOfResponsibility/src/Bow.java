
public class Bow extends Weapon{

	public Bow() {
		super(RegistredWeapon.bow);
	}

	@Override
	protected void updateWeapon() {
		System.out.println("Bow updated");	
	}
}
