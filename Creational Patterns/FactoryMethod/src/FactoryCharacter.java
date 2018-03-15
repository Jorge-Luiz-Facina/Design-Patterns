
public class FactoryCharacter {
	
	public Character getCharacter(String name, String type){
		if(type.equals("Archer"))
			return new Archer(name);
		
		if(type.equals("Wizard"))
			return new Wizard(name);
		
		return null;
	}
}
