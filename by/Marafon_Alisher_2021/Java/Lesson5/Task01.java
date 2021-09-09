package by.Marafon_Alisher_2021.Java.Lesson5;



/*1. —оздать класс јвтомобиль (англ. Car) с пол€ми УћодельФ, 
 * У÷ветФ, У√од выпускаФ. —оздать get и set методы дл€ каждого пол€. 
 * —оздать экземпл€р класса јвтомобиль. «адать значение дл€ каждого 
 * пол€, использу€ set методы. ¬ывести в консоль значение каждого из полей, использу€ get методы.
—озданный вами класс должен отвечать принципам инкапсул€ции.
*/



public class Task01 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setColor("Black");
		car1.setModel("Mercedec");
		car1.setYear(2021);

		System.out.println(car1.getColor());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());

	}

}
