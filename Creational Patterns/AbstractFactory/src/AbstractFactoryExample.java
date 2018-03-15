
public class AbstractFactoryExample {

	public static void main(String[] args) {
		MonsterCreation monsterCreation = new ZombieCreation();
		PoisonMonster poisonZombie = monsterCreation.createPoisonMonster();
		ExplosiveMonster explosiveZombie = monsterCreation.createExplosiveMonster();
		poisonZombie.infoPoisonMonster();
		explosiveZombie.infoExplosiveMonster();
		
		monsterCreation = new TitanCreation();
		PoisonMonster poisonTitan = monsterCreation.createPoisonMonster();
		ExplosiveMonster explosiveTitan = monsterCreation.createExplosiveMonster();
		poisonTitan.infoPoisonMonster();
		explosiveTitan.infoExplosiveMonster();
	}
}
