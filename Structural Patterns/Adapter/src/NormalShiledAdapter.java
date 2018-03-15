
public class NormalShiledAdapter extends AttackShield{
	private NormalShield shield;
	
	public NormalShiledAdapter(NormalShield shield){
		this.shield = shield;
	}
	
	@Override
	public void protect(){
		shield.protect();
	}
	
	@Override
	public void attack(){
		shield.protectPlus();
	}
}
