
public abstract class Weapon {
	protected Weapon next;
	protected RegistredWeapon registredWeapon;
	
	public Weapon(RegistredWeapon weapon){
		next = null;
		registredWeapon = weapon;
	}

	public void setNext(Weapon weapon) {
		if(this.next == null){
			this.next = weapon;
		}
		else{
			this.next.setNext(weapon);
		}
	}
	
	public void updateWeapon(RegistredWeapon weapon){
		if(verifyUpdate(weapon)){
			updateWeapon();
		}else {
			if(next == null){
				System.out.println("\nunregistered weapon\n");
				return;
			}
			next.updateWeapon(weapon);
		}
		
	}
	
	private boolean verifyUpdate(RegistredWeapon weapon) {
		if (registredWeapon == weapon) {
			return true;
		}
		return false;
	}
	
	protected abstract void updateWeapon();
}
