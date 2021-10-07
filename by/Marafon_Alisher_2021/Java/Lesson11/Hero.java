package by.Marafon_Alisher_2021.Java.Lesson11;

public abstract class Hero implements PhysAttack, MagicAttack{

	 int health;
	 double physDef;
	 double magicDef;
	 int physAtt;
	 int magicAtt;
	 static final int MAX_HEALTH = 100;
	 static final int MIN_HEALTH = 0;
	
	public Hero(){
		health = 100;
	}
	
	@Override
		public void physicalAttack(Hero hero){
		double attack =  physAtt - physAtt * hero.physDef;
		
		if(hero.health - attack < 0)
			hero.health = MIN_HEALTH;
		else hero.health -= attack;
		
}
	
	@Override
	public void magicalAttack(Hero hero){
		double attack =  magicAtt - magicAtt * hero.magicDef;
		
		if(hero.health - attack < 0)
			hero.health = MIN_HEALTH;
		else hero.health -= attack;
		
	}


	public int getHealth() {
		return health;
	}
	public  void setHealth(int health){
		this.health = health;
	}
	

	public double getPhysDef() {
		return physDef;
	}

	public  void setPhysDef(double d){
		this.physDef = d;
	}

	public int getMAX_HEALTH() {
		return MAX_HEALTH;
	}

	public int getMIN_HEALTH() {
		return MIN_HEALTH;
	}

	public double getMagicDef() {
		return magicDef;
	}

	

	public int getPhysAtt() {
		return physAtt;
	}

	public  void setPhysAtt(int physAtt){
		this.physAtt = physAtt;
	}

	public int getMagicAtt() {
		return magicAtt;
	}

	
	
}
