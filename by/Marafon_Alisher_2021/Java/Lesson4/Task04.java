package by.Marafon_Alisher_2021.Java.Lesson4;

import java.util.Arrays;
import java.util.Random;

/*4. ������� ����� ������ ������� 100 � ��������� ��� ���������� 
 * ������� �� ��������� �� 0 �� 10000.
 ����� �������� ����� ���� ���� �������� ���������. ��� ��������� ������ 
 � ������������ ������ �������� �������� ����� � ������ ������� �������� ������.

 ������:
 *��� �������� ������ ������� �� ������� ������� 10

 [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

 ������ � ������������ ������: [8742, 1040, 3254]

 ����� � �������:
 13036
 7*/

public class Task04 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10000);
		}
		System.out.println(Arrays.toString(array));
		int maxSum = 0;
		int index = 0;
		int sum;
		for (int i = 0; i < array.length - 2; i++) {
			sum = 0;
			for (int j = i; j < i + 3; j++) {
				sum += array[j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(index);
		System.out.println(maxSum);
	}

}
