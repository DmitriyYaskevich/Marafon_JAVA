package by.Marafon_Alisher_2021.Java.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*1. � ���������� �������� ����� n - ������ �������. 
 * ���������� ������� ������ ���������� ������� � ��������� 
 * ��� ���������� ������� �� 0 �� 10 (�� ������������). 
 * ����� ������� ���������� ������� � �������, � ����� ������� � ������� ���������� �:
�) ����� �������
�) ���������� ����� ������ 8
�) ���������� ����� ������ 1
�) ���������� ������ �����
�) ���������� �������� �����
�) ����� ���� ��������� �������

������: 
������� ����� 10. ������������ ��������� ������: 
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
*/

public class Task01 {
	
		
		public static int Enter(String message){
			System.out.println(message);
			int t;
			Scanner in = new Scanner(System.in);
			while(!in.hasNextInt()){
				System.out.println("�� ����� �������� ��������!");
				in.next();
				System.out.println(message +  "������! ");
			}
			return t = in.nextInt();
		}
		public static void main(String[] args) {
			Random random = new Random();
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int a = Enter("������� �����!");
			int [] array = new int[a];
			
			for(int i = 0; i < array.length; i++ )
				array[i] = random.nextInt(11);
			
				System.out.print(Arrays.toString(array));
				
				for(int i = 0; i < array.length; i++){
					if(array[i] %2 ==0) count3++;}
					System.out.println("\n���������� ������ ����� = " + count3);
				
			for(int k : array){
				if( k > 8)
					count2++; 
				
			}System.out.println("���������� ����� ������ 8: " + count2);
			for(int k : array){
				if( k == 1)
					count1++; 
				
			}System.out.println("���������� ����� ������ 1: " + count3);
		
		}
		
	}

