
public class BuilderExample {
	public static void main(String[] args) {
		LegoAssembler legoAssembler = new LegoAssembler(new RobotApocalypse());
		legoAssembler.setLego();
		
		Lego lego = legoAssembler.getLego();
		System.out.println(lego.toString());
		
		legoAssembler = new LegoAssembler(new ZombieApocalypse());
		legoAssembler.setLego();
		
		lego = legoAssembler.getLego();
		System.out.println(lego.toString());

	}
}
