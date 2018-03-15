
public class StrategyExample {

	public static void main(String[] args) {
		Sword sword = new Sword();
		
		double swordLow = sword.calculateDamage(1, new Low());
		System.out.println(swordLow);
		
		double swordMedium = sword.calculateDamage(2, new Medium());
		System.out.println(swordMedium);
		
		double swordHigh = sword.calculateDamage(1, new High());
		System.out.println(swordHigh);
	}
}
