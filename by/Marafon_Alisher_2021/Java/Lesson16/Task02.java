package by.Marafon_Alisher_2021.Java.Lesson16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Task02 {

	public static void main(String[] args) throws FileNotFoundException {
		Random random = new Random();
		
		File file1 = new File("file1.txt");
		PrintWriter pw1 = new PrintWriter(file1);
		
		
		for(int i = 0; i < 1000; i++)
			pw1.println(random.nextInt(100));
			
			pw1.close();
		
		
	}
}
