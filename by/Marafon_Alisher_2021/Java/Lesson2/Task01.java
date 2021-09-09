package by.Marafon_Alisher_2021.Java.Lesson2;

import java.util.Scanner;


/*1. –еализовать программу, котора€ принимает на вход через консоль с 
 * помощью класса Scanner, число, соответствующее количеству этажей в здании.
 *  »спользу€ условный оператор if, необходимо вывести в консоль сообщение о типе такого дома. 

”слови€: если этажей 1-4 - Ућалоэтажный домФ, 5-8 - У—реднеэтажный домФ, 9
 и более - Ућногоэтажный домФ. “акже, необходимо учесть что может быть 
 введено отрицательное значение, в таком случае сообщить Уќшибка вводаФ. 
*/
public class Task01 {

	public static int EnterInt(String message){
		int t;
		System.out.println(message);
		Scanner in = new Scanner(System.in);
		while(!in.hasNextInt()){
			in.next();
			System.out.println("¬вели неверное значение!");
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
			System.out.println("¬вели неверное значение!");
			System.out.println(message);
		}
		return t = in.nextDouble();
		
	}
	public static void main(String[] args) {
		int k = EnterInt("¬ведите число этажей: ");
		if(k >= 1 && k <= 4)
			System.out.println("ћалоэтажка");
		else if( k >= 5 && k <= 8)
			System.out.println("Cреднеэтажка");
		else if(k >= 9)
			System.out.println("ћногоэтажка");
		else if (k <= 0)
			System.out.println("ќшибка ввода");
			
	}
}
