package by.Marafon_Alisher_2021.Java.Lesson7;

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
	
	
	public int getLenght(){
		return lenght;
	}
	public void info(){
		System.out.println("������������: " + this.producer + ", ��� �������: " + this.year + ", �����: " + this.lenght + ", ���: " + this.weight + ", ���������� ������� � ����: " + this.fuel);
	}
	
	public void fillUp(int n){
		fuel = this.fuel + n;
	}
	
	public static void compareAirplanes(AirPlane air1, AirPlane air2){
		if(air1.getLenght() > air2.getLenght())
			System.out.println("Первый самолет длинее чем второй!");
		
		else if (air1.getLenght() == air2.getLenght())
			System.out.println("Первый самолет равен  второму по длине!");
		else System.out.println("Второй самолет длинее чем первый!");
	}
}
