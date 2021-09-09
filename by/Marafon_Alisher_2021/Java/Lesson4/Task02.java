package by.Marafon_Alisher_2021.Java.Lesson4;

import java.util.Arrays;
import java.util.Random;




/*2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя цикл for each вывести в консоль: 
наибольший элемент массива
наименьший элемент массива
количество элементов массива, оканчивающихся на 0
сумму элементов массива, оканчивающихся на 0

Использовать сортировку запрещено.*/

public class Task02 {

	public static void main(String[] args) {
		int count = 0;
		int a = Task01.Enter("Введите число: ");
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
		}	System.out.println("Максимальное значение: " + max);
		for(int i : array){
			if(min > i)
				min = i;
		}	System.out.println("Минимальное значение: " + min);	
		for(int i : array){
			if(i % 10 == 0)
				count++;
		}	System.out.println("Количество чисел, заканчивающихся на 0: " + count);
		
		int sum = 0;
		for(int i : array){
		if(i % 10 == 0)
			{sum += i;
		}
	}	System.out.println("Сумма чисел, заканчивающихся на 0: " + sum);
	
	}

	}


