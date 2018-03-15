
public class MagicStick extends Weapon{

	public MagicStick() {
		super(RegistredWeapon.magicStick);
	}

	@Override
	protected void updateWeapon() {
		System.out.println("Magic Stick updated");	
	}
}
