
public abstract class LegoBuilder {
	protected Lego lego = new Lego();
	public abstract void buildEnvironment();
	public abstract void buildEnemy();
	public abstract void buildCharacter();

	public Lego getLego(){
		return lego;
	}
}
