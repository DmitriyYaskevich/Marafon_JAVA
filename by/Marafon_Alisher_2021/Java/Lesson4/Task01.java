package by.Marafon_Alisher_2021.Java.Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*1. С клавиатуры вводится число n - размер массива. 
 * Необходимо создать массив указанного размера и заполнить 
 * его случайными числами от 0 до 10 (не включительно). 
 * Затем вывести содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива

Пример: 
Введено число 10. Сгенерирован следующий массив: 
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
*/

public class Task01 {
	
		
		public static int Enter(String message){
			System.out.println(message);
			int t;
			Scanner in = new Scanner(System.in);
			while(!in.hasNextInt()){
				System.out.println("Вы ввели неверное значение!");
				in.next();
				System.out.println(message +  "заново! ");
			}
			return t = in.nextInt();
		}
		public static void main(String[] args) {
			Random random = new Random();
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int a = Enter("Введите число!");
			int [] array = new int[a];
			
			for(int i = 0; i < array.length; i++ )
				array[i] = random.nextInt(11);
			
				System.out.print(Arrays.toString(array));
				
				for(int i = 0; i < array.length; i++){
					if(array[i] %2 ==0) count3++;}
					System.out.println("\nКоличество четных чисел = " + count3);
				
			for(int k : array){
				if( k > 8)
					count2++; 
				
			}System.out.println("Количество чисел больше 8: " + count2);
			for(int k : array){
				if( k == 1)
					count1++; 
				
			}System.out.println("Количество чисел равных 1: " + count3);
		
		}
		
	}

