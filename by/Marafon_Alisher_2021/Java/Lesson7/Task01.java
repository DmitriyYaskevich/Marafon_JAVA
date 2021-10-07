package by.Marafon_Alisher_2021.Java.Lesson7;

public class Task01 {

	public static void main(String[] args) {
		AirPlane air1 = new AirPlane("Boing", 2000, 150, 1000);
		AirPlane air2 = new AirPlane("Tupolev", 2010, 200, 200);
		AirPlane.compareAirplanes(air1, air2);
		
	}

}
