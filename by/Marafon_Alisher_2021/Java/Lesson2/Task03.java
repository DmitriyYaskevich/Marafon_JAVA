package by.Marafon_Alisher_2021.Java.Lesson2;




/*3. ����������� ��������� �2, ��������� ���� while.*/
public abstract class Task03 {

	public static void main(String[] args) {
		int a = Task01.EnterInt("������� ����� :") ;
		int b = Task01.EnterInt("������� ����� :") ;
		if(a >= b)
			System.out.println("������������ ����"); 
		while(b >= a){
			if(a %5 ==0 && a %10 != 0) System.out.print(" " + a + " ");
			a++;
		}

	}}
