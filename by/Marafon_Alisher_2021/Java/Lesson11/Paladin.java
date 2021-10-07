package by.Marafon_Alisher_2021.Java.Lesson11;

public class Paladin extends Hero implements Healer{

	static final int HEAL_SELF = 25;
	static final int HEAL_TEAM = 10;
	public Paladin(){
		physAtt = 15;
		physDef = 0.5;
		
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
		 return "Paladin{ health: " + health + "}";
	 }
}
