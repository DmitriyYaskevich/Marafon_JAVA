package by.Marafon_Alisher_2021.Java.Lesson11;

public class Warrior extends Hero {

	public Warrior (){
		physAtt = 30;
		physDef = 0.8;
		magicDef = 0;
	}
	
	public String toString(){
		return "Warrior{ health: " + health + "}";
	}
}
