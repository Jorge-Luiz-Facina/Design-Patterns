
public class Gun extends Weapon {

	public Gun() {
		super(RegistredWeapon.gun);
	}

	@Override
	protected void updateWeapon() {
		System.out.println("Gun updated");	
	}
}
