package by.Marafon_Alisher_2021.Java.Lesson5;



/*1. ������� ����� ���������� (����. Car) � ������ ��������, 
 * �����, ���� ��������. ������� get � set ������ ��� ������� ����. 
 * ������� ��������� ������ ����������. ������ �������� ��� ������� 
 * ����, ��������� set ������. ������� � ������� �������� ������� �� �����, ��������� get ������.
��������� ���� ����� ������ �������� ��������� ������������.
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
