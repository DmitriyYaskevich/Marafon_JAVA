package by.Marafon_Alisher_2021.Java.Lesson6;

public class Teacher {

	private String name;
	private String subject;
	
	public Teacher(String name, String subject){
		this.setName(name);
		this.setSubject(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void evaluate (Student student){
		
		int a = (int) (Math.random() * (4) + 2);
		if(a == 2)
			System.out.println("������������� " + this.name + " ������ �������� � ������ " + student.getName() + " �� �������� " + this.subject + " �� ������: ������������������" );
		else if(a == 3)
				System.out.println("������������� " + this.name + " ������ �������� � ������ " + student.getName() + " �� �������� " + this.subject + " �� ������: ����������������" );
			else if( a == 4)
				
					System.out.println("������������� " + this.name + " ������ �������� � ������ " + student.getName() + " �� �������� " + this.subject + " �� ������: ������" );
			else 
				System.out.println("������������� " + this.name + " ������ �������� � ������ " + student.getName() + " �� �������� " + this.subject + " �� ������: �������" );
	}
}
