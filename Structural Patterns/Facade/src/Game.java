
public class Game {
	private Enemy enemy;
	private Trap trap;
	private Character character;

	public Game(){
		enemy = new Enemy();
		trap = new Trap();		
		character = new Character();
	}
	
	public void start(){	
		enemy.prepare();
		trap.prepare();
		character.prepare();
		
		enemy.ready();
		trap.ready();
		character.ready();
	}
}
