package by.Marafon_Alisher_2021.Java.Lesson4;

import java.util.Arrays;
import java.util.Random;




/*2. ������� ����� ������ ������� 100 � ��������� ��� ���������� ������� �� ��������� �� 0 �� 10000.
�����, ��������� ���� for each ������� � �������: 
���������� ������� �������
���������� ������� �������
���������� ��������� �������, �������������� �� 0
����� ��������� �������, �������������� �� 0

������������ ���������� ���������.*/

public class Task02 {

	public static void main(String[] args) {
		int count = 0;
		int a = Task01.Enter("������� �����: ");
		int[] array = new int[a];
		Random ran = new Random();
		int max;
		int min;
		
		for (int i = 0; i < array.length; i++)
			array[i] = ran.nextInt(10000);
		
		System.out.println(Arrays.toString(array));
		min = array[0];
		max = array[0];
		for(int i : array){
			if(max < i)
				max = i;
		}	System.out.println("������������ ��������: " + max);
		for(int i : array){
			if(min > i)
				min = i;
		}	System.out.println("����������� ��������: " + min);	
		for(int i : array){
			if(i % 10 == 0)
				count++;
		}	System.out.println("���������� �����, ��������������� �� 0: " + count);
		
		int sum = 0;
		for(int i : array){
		if(i % 10 == 0)
			{sum += i;
		}
	}	System.out.println("����� �����, ��������������� �� 0: " + sum);
	
	}

	}


