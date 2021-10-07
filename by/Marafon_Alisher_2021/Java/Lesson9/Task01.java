package by.Marafon_Alisher_2021.Java.Lesson9;

public class Task01 {

	public static void main(String[] args) {
		Student st1 = new Student("Саша", "3 группа");
		Teacher t1 = new Teacher("Сергей Петрович", "Физику");
		
		System.out.println(st1.getGroupName());
		System.out.println(t1.getSubjectName());
		st1.printInfo();
		t1.printInfo();

	}

}
