package by.Marafon_Alisher_2021.Java.Lesson5;




/*2. ������� ����� �������� (����. Motorbike) � ������ ��������,
 *  �����, ���� ��������. ������� ��������� ������ ��������, 
 *  ��������� ����������� (set ������ �� ������������). ����������
 *   �������������� ��������� ������������ � ������������ �������� 
 *   ����� this. ������� � ������� �������� ������� �� �����, ��������� get ������.*/

public class Task02 {

	public static void main(String[] args) {
		Motocycle mot = new Motocycle(2020, "Red", "Yamaha");
		System.out.println(mot.getColor());
		System.out.println(mot.getModel());
		System.out.println(mot.getYear());

	}

}
