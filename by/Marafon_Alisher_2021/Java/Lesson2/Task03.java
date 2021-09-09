package by.Marafon_Alisher_2021.Java.Lesson2;




/*3. Реализовать программу №2, используя цикл while.*/
public abstract class Task03 {

	public static void main(String[] args) {
		int a = Task01.EnterInt("Введите число :") ;
		int b = Task01.EnterInt("Введите число :") ;
		if(a >= b)
			System.out.println("Некорректный ввод"); 
		while(b >= a){
			if(a %5 ==0 && a %10 != 0) System.out.print(" " + a + " ");
			a++;
		}

	}}
