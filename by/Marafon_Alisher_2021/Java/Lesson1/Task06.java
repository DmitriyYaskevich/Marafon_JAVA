package by.Marafon_Alisher_2021.Java.Lesson1;


/*
6. ќбъ€вите переменную типа int, им€ переменной - k. ѕрисвойте этой 
переменной какую-нибудь цифру от 1 до 9. »спользу€ цикл на ваше усмотрение (for или while), 
выведите в консоль таблицу умножени€ дл€ этой цифры в следующем формате:
1 x k = Е
2 x k = Е
3 x k = Е
ЕЕ
9 x k = Е


ѕример:
k = 3

¬ывод в консоль:
1 x 3 = 3
2 x 3 = 6
3 x 3 = 9
ЕЕ
9 x 3 = 27*/

public class Task06 {

	public static void main(String[] args) {
		int k = 5;
		for(int i = 1; i <= 9; i++){
			System.out.println(i + " x " + k + " = " + i * k);
		}
		

	}

}
