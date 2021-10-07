package by.Marafon_Alisher_2021.Java.Lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
	
		File file = new File("D:\\java_proect\\eclipse\\by.Marafon_Alisher_2021.Java\\src\\by\\Marafon_Alisher_2021\\Java\\Lesson16\\input.txt");
		
		
		try{
			Scanner scanner = new Scanner(file);
			String line = scanner.nextLine();
			String[] numbers = line.split(" ");
			
			int sum = 0;
			for(String number : numbers){
				sum+=Integer.parseInt(number);
			}
			
			double result = sum / (double)numbers.length;
			
			System.out.printf(result + " --> %.3f", result );
		} catch (FileNotFoundException e){
			System.out.println("Файл не найден!");
		}
	}

}
