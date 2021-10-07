package by.Marafon_Alisher_2021.Java.Lesson12.Task05;

import java.util.List;

public class MusicBand {
private String name;
private int year;
private List<MusicArtist> FIO;

public MusicBand(String name, int year, List<MusicArtist> FIO){
	this.name = name;
	this.year = year;
	this.FIO = FIO;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString(){
	return "Band { name = " + name + ", year = " + year + " }"; 
}
public List<String> getFIO() {
	return FIO;
}
public void setFIO(List<String> fIO) {
	FIO = fIO;
}


/*public void transferMembers(MusicBand b){
	for(String FIO : this.FIO)
		b.getFIO().add(FIO);
	this.getFIO().clear();
}*/
public static void transferMembers(MusicBand mus1, MusicBand mus2){
	for(String FIO : mus1.getFIO()){
		mus2.getFIO().add(FIO);
	}
	mus2.getFIO().clear();
}

public void printMembers(){
	System.out.println(this.FIO);
}
}
