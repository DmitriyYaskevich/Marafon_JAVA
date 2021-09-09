package by.Marafon_Alisher_2021.Java.Lesson4;

import java.util.Random;

/*3. ��������� ��������� ������ (�������) ���������� ������� �� 0 �� 50. 
 * ������ ������� ������ m=12, n=8 (m - ����������� �� �������, n - 
 * ����������� �� ��������). � ������� ������� ������ ������, ����� ����� 
 * � ������� �����������. ���� ����� ����� ���������, ������� ������ ��������� �� ���.
 ������ ��������������� ������� (��� �������� m=3, n=5):

 3 2 1 5 7     // ����� - 18
 1 2 5 6 2     // ����� - 16 
 3 4 9 6 4    // ����� - 26

 �����: 2 (������ ������, ����� ����� � ������� �����������)*/

public class Task03 {

	public static void main(String[] args) {
		int[][] array = new int[12][8];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ran.nextInt(50);
				System.out.print(array[i][j] + " ");
			}
		}

		int max = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			int sum = 0;

			for (int j = 0; j < array[i].length; j++)
				sum += array[i][j];
			System.out.println(sum);
			if (sum > max) {
				max = sum;
				index = i;
			}

		}
		System.out.println("-------");
		System.out.println("�����: " + index + " (������ ������, ����� ����� � ������� �����������) " + max);
	

	}

}
