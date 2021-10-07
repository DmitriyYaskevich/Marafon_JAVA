package by.Marafon_Alisher_2021.Java.Lesson9;

public class Student extends Human{
	
	private String groupName;
	
	public Student(String name, String groupName) {
				super(name);
				this.groupName = groupName;
		
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public void printInfo(){
		System.out.println("Этот человек с именем: " + super.getName());
		System.out.println("Этот студент с именем: " + super.getName());
	}
}
