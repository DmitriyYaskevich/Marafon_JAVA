package by.Marafon_Alisher_2021.Java.Lesson4;

import java.util.Arrays;
import java.util.Random;

/*4. Создать новый массив размера 100 и заполнить его случайными 
 * числами из диапазона от 0 до 10000.
 Найти максимум среди сумм трех соседних элементов. Для найденной тройки 
 с максимальной суммой выведите значение суммы и индекс первого элемента тройки.

 Пример:
 *Для простоты пример показан на массиве размера 10

 [1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 3254]

 Тройка с максимальной суммой: [8742, 1040, 3254]

 Вывод в консоль:
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
