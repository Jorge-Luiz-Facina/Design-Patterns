
public class TitanCreation implements MonsterCreation{

	public PoisonMonster createPoisonMonster() {
		return new Scout();
	}

	public ExplosiveMonster createExplosiveMonster() {
		return new Transformer();
	}
}
