package by.Marafon_Alisher_2021.Java.Lesson6;




/*1. ��� ����� ������� ���������� ������ ���������� � �������� 
 * �� ����������� ��� � ����� �������� ���.


� ������� ���������� � �������� ���������� ��� ������: 
void info() - ������� � ������� ������ ���� ����������� (��� ���� ��������),
int yearDifference(int inputYear) - ��������� � �������� 
��������� ����� ����� (���) � ���������� ������� ����� ���������� 
����� � ����� ������� ������������� �������� (������������ ������ ������ ������������� �����).

� ������ main() ������ Task1 �������� ��������� ���������� ��� ���������,
 ��������� ������ ������� ������.
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
