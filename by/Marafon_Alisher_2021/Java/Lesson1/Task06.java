package by.Marafon_Alisher_2021.Java.Lesson1;


/*
6. �������� ���������� ���� int, ��� ���������� - k. ��������� ���� 
���������� �����-������ ����� �� 1 �� 9. ��������� ���� �� ���� ���������� (for ��� while), 
�������� � ������� ������� ��������� ��� ���� ����� � ��������� �������:
1 x k = �
2 x k = �
3 x k = �
��
9 x k = �


������:
k = 3

����� � �������:
1 x 3 = 3
2 x 3 = 6
3 x 3 = 9
��
9 x 3 = 27*/

public class Task06 {

	public static void main(String[] args) {
		int k = 5;
		for(int i = 1; i <= 9; i++){
			System.out.println(i + " x " + k + " = " + i * k);
		}
		

	}

}
