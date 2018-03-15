
public class MagicStickDecorator extends MagicStick {

	MagicStick magicStick;

	public MagicStickDecorator(MagicStick magicStick) {
		this.magicStick = magicStick;
	}

	@Override
	public String getName() {
		return magicStick.getName() + " + " + name;
	}

	public int getDamage() {
		return magicStick.getDamage() + damage;
	}
}
