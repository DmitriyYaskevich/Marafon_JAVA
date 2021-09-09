package by.Marafon_Alisher_2021.Java.Lesson6;




/*1. Для этого задания скопируйте классы Автомобиль и Мотоцикл 
 * из предыдущего дня в пакет текущего дня.


В классах Автомобиль и Мотоцикл реализуйте два метода: 
void info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
int yearDifference(int inputYear) - принимает в качестве 
аргумента целое число (год) и возвращает разницу между переданным 
годом и годом выпуска транспортного средства (возвращаться должно всегда положительное число).

В методе main() класса Task1 создайте экземпляр автомобиля или мотоцикла,
 проверьте работу каждого метода.
*/
public class Task01 {

	public static void main(String[] args) {
		Car car = new Car();
		Motocycle mot = new Motocycle(2021, "Silver", "Yamaha");
		car.setYear(2020);
		mot.info();
		System.out.println(mot.yearDifference(2025));
		car.info();
		System.out.println(car.yearDifference(2021));

	}

}
