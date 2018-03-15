
public class ZombieApocalypse extends LegoBuilder{

	@Override
	public void buildEnvironment() {
		lego.environment = "Island";
	}

	@Override
	public void buildEnemy() {
		lego.monster = "Zombie";
	}

	@Override
	public void buildCharacter() {
		lego.character = "Archer";
	}
}
