package by.Marafon_Alisher_2021.Java.Lesson11;

public class Warehouse {

	private int countPickedOrders = 0 ;
	private int countDeliveredOrders = 0;
	
	public void incrementP(){
		countPickedOrders++;
	}
	
	public void incrementD(){
		countDeliveredOrders++;
	}
	public int getCountPickedOrders() {
		return countPickedOrders;
	}
	public void setCountPickedOrders(int countPickedOrders) {
		this.countPickedOrders = countPickedOrders;
	}
	public int getCountDeliveredOrders() {
		return countDeliveredOrders;
	}
	public void setCountDeliveredOrders(int countDeliveredOrders) {
		this.countDeliveredOrders = countDeliveredOrders;
	}
	
	@Override
	public String toString(){
		return "Количество собранных заказов: " + getCountPickedOrders() + " Количество доставленных заказов " + getCountDeliveredOrders();
	}
}
