package by.Marafon_Alisher_2021.Java.Lesson9;

public class Teacher extends Human{


	private String subjectName;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public Teacher(String name, String subjectName) {
		super(name);
		this.subjectName = subjectName;
	}
	
	@Override
	public void printInfo(){
		System.out.println("Этот человек с именем: " + super.getName());
		System.out.println("Этот преподаватель с именем: " + super.getName());
	}
}
