package by.Marafon_Alisher_2021.Java.Lesson11;

public class Shaman extends Hero implements Healer{
	static final int HEAL_SELF = 50;
	static final int HEAL_TEAM = 30;
	public Shaman(){
		physAtt = 10;
		physDef = 0.2;
		magicDef = 0.2;
		magicAtt = 15;
		
	}
	@Override
	public void healHimself() {
		if(health + HEAL_SELF > MAX_HEALTH){
			health = MAX_HEALTH;
		} else{
			health += HEAL_SELF;
		}
	}

	@Override
	public void healTeammate(Hero hero) {
		if(hero.health + HEAL_TEAM > MAX_HEALTH){
			hero.health = MAX_HEALTH;
		}else {
			hero.health += HEAL_TEAM;
		}
		
	}

	 @Override
	 public String toString(){
		 return "Shaman { health: " + health + "}";
	 }

}
