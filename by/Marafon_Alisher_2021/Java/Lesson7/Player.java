package by.Marafon_Alisher_2021.Java.Lesson7;

public class Player {
	private int stamina;
	private int MAX_STAMINA = 100;
	private int MIN_STAMINA = 0;
	private static int countPlayers;
	
	public Player (int stamina){
		this.stamina = stamina;
		if(countPlayers < 6)
			countPlayers++;
	}
	
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	public void run(){
		if(stamina == 0)
			return;
		stamina--;
		if(stamina == 0){
			countPlayers--;
		}
		
		
	}
	
	public static void info(){
		if(countPlayers < 6 && countPlayers > 0)
			System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " мест");
		else  System.out.println("На поле нет свободных мест");
	}
}
