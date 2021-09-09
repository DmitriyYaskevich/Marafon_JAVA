package by.Marafon_Alisher_2021.Java.Lesson5;

public class Motocycle {

	private int year;
	private String color;
	private String model;
	
	public Motocycle(int year, String color, String model){
		this.color = color;
		this.model = model;
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
