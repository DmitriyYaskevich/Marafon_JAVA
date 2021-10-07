
package by.Marafon_Alisher_2021.Java.Lesson11;

/**
 * @author Дементор
 *
 */
public class Task01 {

	public static void main(String[] args) {
		Warehouse w1 = new Warehouse();
		Courier c1 = new Courier(w1);
		Picker p1 = new Picker(w1);
		businessProcess(p1);
		businessProcess(c1);
		System.out.println(p1.toString());
		System.out.println(c1.toString());
		System.out.println(w1.getCountDeliveredOrders());
		System.out.println(w1.getCountPickedOrders());
	}

	static void businessProcess(Worker worker){
		for(int i = 0; i <= 1000; i++)
			worker.doWork();
		worker.bonus();
	}

}
