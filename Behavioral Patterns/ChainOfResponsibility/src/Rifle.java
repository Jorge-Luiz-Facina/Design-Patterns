
public class Rifle extends Weapon {

	public Rifle() {
		super(RegistredWeapon.rifle);		
	}

	@Override
	protected void updateWeapon() {
		System.out.println("Rifle updated");
	}
}
