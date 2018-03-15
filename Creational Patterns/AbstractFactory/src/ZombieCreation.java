
public class ZombieCreation implements MonsterCreation{

	public PoisonMonster createPoisonMonster() {
		return new Village();
	}

	public ExplosiveMonster createExplosiveMonster() {	
		return new Butcher();
	}
}
