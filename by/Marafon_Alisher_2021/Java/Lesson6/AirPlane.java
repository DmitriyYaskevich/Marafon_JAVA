package by.Marafon_Alisher_2021.Java.Lesson6;

public class AirPlane {

	private String producer;
	private int year;
	private int lenght;
	private int weight;
	private int fuel;
	
	public AirPlane(String producer, int year, int lenght, int weight){
		this.fuel = 0;
		this.producer = producer;
		this.lenght = lenght;
		this.weight = weight;
		this.year = year;
	}
	public void setProducer(String producer){
		this.producer = producer;
	}
	public void setYear(int year){
		this.year = year;
	}
	public void setLenght(int lenght){
		this.lenght = lenght;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public void setFuel(int fuel){
		this.fuel = fuel;
	}
	
	public int getFuel(){
		return fuel;
	}
	
	public void info(){
		System.out.println("Изготовитель: " + this.producer + ", год выпуска: " + this.year + ", длина: " + this.lenght + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
	}
	
	public void fillUp(int n){
		fuel = this.fuel + n;
	}
}
