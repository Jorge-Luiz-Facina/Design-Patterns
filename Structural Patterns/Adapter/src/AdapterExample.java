

public class AdapterExample {
	public static void main(String[] args) {
		NormalShield normalShield = new NormalShield();
		AttackShield attackShield = new AttackShield();
		
		NormalShiledAdapter normalShiledAdapter = new NormalShiledAdapter(normalShield);
		AttackShield[] attackShields = {attackShield, normalShiledAdapter};
		
		for(AttackShield shield : attackShields){
			shield.protect();
			shield.attack();
		}
	}
}

