
public class TemplateMethodExample {

	public static void main(String[] args) {
		AK47 ak47= new AK47();
		BarrettM82 barrettM82 = new BarrettM82();
		
		ak47.shoot();
		System.out.println();
		barrettM82.shoot();
	}
}
