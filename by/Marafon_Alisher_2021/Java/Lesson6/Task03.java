package by.Marafon_Alisher_2021.Java.Lesson6;




/*3. ������� ����� Teacher (�������������), ������� ���� �����, 
 * ��������. ������� ����� Student (�������) � ����� �����.
������ ����� ����� ����������� (� �����������), set � get ������ 
�� �������������, � ����� � ������������� ���� ����� evaluate (������� ��������),
 ����������� � �������� ��������� ��������, � ���������� ��������� �������:
  ������ ������ ��������� ������� ������������ ����� �� 2 �� 5, ����� � ������� 
  ��������� ������: "������������� ���������������� ������ �������� � ������ 
  ����������� �� �������� ����������� �� ������ ������."
��� �����, ���������� �������� �������, ������ ���� �������� ���������������� 
����������. ������ ������ ��������� �������� "�������, "������, "�����������������"
 ��� "�������������������", � ����������� �� �������� �������� ���������������� �����.

�������� �� 1 ���������� ������� ������, � ������������� �������� ����� ������
 ��������, ������� �������� � �������� ��������� ������.
*/
public class Task03 {

	public static void main(String[] args) {
		Student stud = new Student("Jack");
		Teacher teac = new Teacher("Jonh", "Mathematics");
		
		teac.evaluate(stud);

	}

}