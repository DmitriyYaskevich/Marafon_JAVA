package by.Marafon_Alisher_2021.Java.Lesson2;

import java.util.Scanner;


/*1. ����������� ���������, ������� ��������� �� ���� ����� ������� � 
 * ������� ������ Scanner, �����, ��������������� ���������� ������ � ������.
 *  ��������� �������� �������� if, ���������� ������� � ������� ��������� � ���� ������ ����. 

�������: ���� ������ 1-4 - ������������ ���, 5-8 - �������������� ���, 9
 � ����� - ������������� ���. �����, ���������� ������ ��� ����� ���� 
 ������� ������������� ��������, � ����� ������ �������� ������� ������. 
*/
public class Task01 {

	public static int EnterInt(String message){
		int t;
		System.out.println(message);
		Scanner in = new Scanner(System.in);
		while(!in.hasNextInt()){
			in.next();
			System.out.println("����� �������� ��������!");
			System.out.println(message);
		}
		return t = in.nextInt();
		
	}
	
	public static double EnterDouble(String message){
		double t;
		System.out.println(message);
		Scanner in = new Scanner(System.in);
		while(!in.hasNextDouble()){
			in.next();
			System.out.println("����� �������� ��������!");
			System.out.println(message);
		}
		return t = in.nextDouble();
		
	}
	public static void main(String[] args) {
		int k = EnterInt("������� ����� ������: ");
		if(k >= 1 && k <= 4)
			System.out.println("����������");
		else if( k >= 5 && k <= 8)
			System.out.println("C�����������");
		else if(k >= 9)
			System.out.println("�����������");
		else if (k <= 0)
			System.out.println("������ �����");
			
	}
}
