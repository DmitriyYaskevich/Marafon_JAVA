package by.Marafon_Alisher_2021.Java.Lesson12.Task05;

public class MusicArtist {
	private String name;
	private int age;
	
	public MusicArtist(String name, int age){
		this.setAge(age);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
