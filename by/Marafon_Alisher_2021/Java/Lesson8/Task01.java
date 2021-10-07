package by.Marafon_Alisher_2021.Java.Lesson8;

public class Task01 {

	public static void main(String[] args) {
String num = "";
		
		long befor = System.currentTimeMillis();
		for(int i = 1; i <= 1000; i++)
			num += i + " "; 
		long after = System.currentTimeMillis();
		System.out.println("Время работы команды String: "+(after - befor));
		System.out.println(num);
		long before1 = System.currentTimeMillis();
		StringBuilder st = new StringBuilder(" ");
		for(int i = 1; i <= 1000; i++)
		st.append(i).append(" ");
		long after1 = System.currentTimeMillis();
		System.out.println(st);
		System.out.println("Время работы Билдера: "+(after1 - before1));
		

	}

}
