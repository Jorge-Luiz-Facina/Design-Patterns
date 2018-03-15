
public class RobotApocalypse extends LegoBuilder {

	@Override
	public void buildEnvironment() {
		lego.environment = "Nuclear empty";
	}

	@Override
	public void buildEnemy() {
		lego.monster = "Robot";
	}

	@Override
	public void buildCharacter() {
		lego.character = "Shooter";
	}
}
