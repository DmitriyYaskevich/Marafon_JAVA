package by.Marafon_Alisher_2021.Java.Lesson11;

public class Task02 {

	public static void main(String[] args) {
		Warrior war1 = new Warrior();
		Paladin pal1 = new Paladin();
		Shaman sh1 = new Shaman();
		Magician mag1 = new Magician();
		
		
		System.out.println(pal1.toString());
		war1.physicalAttack(pal1);
		war1.physicalAttack(pal1);
		System.out.println(pal1.toString());
		System.out.println(war1.toString());
		pal1.physicalAttack(war1);
		
		System.out.println(war1.toString());
		pal1.healHimself();
		System.out.println(pal1.toString());
		
		pal1.healTeammate(war1);
		System.out.println(war1.toString());
		
		System.out.println(sh1.toString());
		mag1.magicalAttack(sh1);
		System.out.println(sh1.toString());
		sh1.healHimself();
		System.out.println(sh1.toString());
	}

}
