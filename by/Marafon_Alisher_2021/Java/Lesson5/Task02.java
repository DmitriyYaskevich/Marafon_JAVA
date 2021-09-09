package by.Marafon_Alisher_2021.Java.Lesson5;




/*2. Создать класс Мотоцикл (англ. Motorbike) с полями “Модель”,
 *  “Цвет”, “Год выпуска”. Создать экземпляр класса Мотоцикл, 
 *  используя конструктор (set методы не использовать). Необходимо
 *   придерживаться принципов инкапсуляции и использовать ключевое 
 *   слово this. Вывести в консоль значение каждого из полей, используя get методы.*/

public class Task02 {

	public static void main(String[] args) {
		Motocycle mot = new Motocycle(2020, "Red", "Yamaha");
		System.out.println(mot.getColor());
		System.out.println(mot.getModel());
		System.out.println(mot.getYear());

	}

}
