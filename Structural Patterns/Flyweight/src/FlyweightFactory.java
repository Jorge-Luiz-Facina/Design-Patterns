
public class FlyweightFactory {
	
	protected SpriteFlyweight character;
	protected SpriteFlyweight monster;
	protected SpriteFlyweight zombie;
	
	public FlyweightFactory() {
		character = new Sprite("character");
		monster = new Sprite("monster");
		zombie = new Sprite("zombie");
	}

	public SpriteFlyweight getCharacter() {
		return character;
	}

	public SpriteFlyweight getMonster() {
		return monster;
	}

	public SpriteFlyweight getZombie() {
		return zombie;
	}	
}
