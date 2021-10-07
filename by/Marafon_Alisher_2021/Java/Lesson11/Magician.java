package by.Marafon_Alisher_2021.Java.Lesson11;

public class Magician extends Hero{

	public Magician(){
		physAtt = 5;
		physDef = 0;
		magicDef = 0.8;
		magicAtt = 20;
	}
	
	 @Override
	 public String toString(){
		 return "Magician { health: " + health + "}";
	 }
}
