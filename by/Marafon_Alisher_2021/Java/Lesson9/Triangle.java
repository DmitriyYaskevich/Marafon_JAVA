package by.Marafon_Alisher_2021.Java.Lesson9;

public class Triangle extends Figure{
	private int a;
	private int b;
	private int c;
	
	public Triangle(String color, int a, int b, int c){
		super(color);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public double area() {
		double halF = perimeter() / 2;
		return Math.sqrt(halF) * (halF - a) * (halF - b) * (halF - c);
	}

	@Override
	public double perimeter() {
		return a + b + c;
	}

}
