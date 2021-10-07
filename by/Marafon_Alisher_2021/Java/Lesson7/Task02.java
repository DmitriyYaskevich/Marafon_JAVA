package by.Marafon_Alisher_2021.Java.Lesson7;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Player pl1 = new Player(ran.nextInt(10) );
		Player pl2 = new Player(ran.nextInt(90) + 100);
		Player pl3 = new Player(ran.nextInt(90) + 100);
		/*Player pl4 = new Player(ran.nextInt(90) + 100);
		Player pl5 = new Player(ran.nextInt(90) + 100);
		Player pl6 = new Player(ran.nextInt(90) + 100);*/
		pl1.info();
		Player pl7 = new Player(ran.nextInt(90) + 100);
		Player pl8 = new Player(ran.nextInt(90) + 100);
		Player pl9 = new Player(ran.nextInt(90) + 100);
		Player.info();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.run();
		pl1.getStamina();
		
		Player.info();
	}

}
