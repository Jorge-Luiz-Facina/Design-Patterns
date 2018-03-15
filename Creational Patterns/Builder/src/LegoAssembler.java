
public class LegoAssembler {
	protected LegoBuilder assembler;
	
	public LegoAssembler(LegoBuilder assembler) {
		this.assembler = assembler;
	}
	 
	public void setLego() {
		assembler.buildEnvironment();
		assembler.buildEnemy();
		assembler.buildCharacter();
	}
	 
	public Lego getLego() {
		return assembler.getLego();
	}
}
