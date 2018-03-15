
public class ChainOfResponsibilityExample {
	public static void main(String[] args) {
		Weapon weapon = new Rifle(); 
		weapon.setNext(new Bow());
		weapon.setNext(new Gun());
		
		weapon.updateWeapon(RegistredWeapon.rifle);
		weapon.updateWeapon(RegistredWeapon.bow);
		weapon.updateWeapon(RegistredWeapon.gun);
		
		weapon.updateWeapon(RegistredWeapon.magicStick);	
	}
}
