package by.Marafon_Alisher_2021.Java.Lesson11;

public class Courier implements Worker{

	private int salary;
	private boolean isPayed;
	private Warehouse w;
	
	public Courier(Warehouse w){
		this.w = w;;
		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isPayed() {
		return isPayed;
	}
	public void setPayed(boolean isPayed) {
		this.isPayed = isPayed;
	}
	
	
	@Override
	public String toString(){
		return "Заработная плата: " + getSalary() + " Был ли выплачен бонус: " + isPayed();
	}
	@Override
	public void doWork() {
		salary += 100;
		w.incrementD();
	}
	@Override
	public void bonus() {
		if(w.getCountDeliveredOrders() < 10000 )
			{System.out.println("Бонус пока что недоступен!");
			return;
			}
		
		if(isPayed ){
			System.out.println("Бонус уже был выплачен!");
			return;
		}
			salary += 50000;
			isPayed = true;
		
		
	}
	
	
	/*if(w.getCountD() < 10000){
		System.out.println("����� ���� �� ��������!");
		return;
	}
	if(isPayed){
		System.out.println("����� ��� ��� ��������!");
		return;
}
		salary+=50000;
	isPayed = true;*/
}
