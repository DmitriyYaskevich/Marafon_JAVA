package by.Marafon_Alisher_2021.Java.Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;




/*Создать класс Музыкальная Группа (англ. MusicBand) с полями name 
 * и year (название музыкальной группы и год основания).
 *  Создать 10 или более экземпляров класса MusicBand , 
 *  добавить их в список (выбирайте такие музыкальные группы, 
 *  которые были созданы как до 2000 года, так и после, жанр не важен). 
 *  Перемешать список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
Этот метод принимает список групп в качестве аргумента и возвращает
 новый список, состоящий из групп, основанных после 2000 года. Вызвать 
 метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем 
 списке из 10 групп. Вывести в консоль оба списка (оригинальный и с 
 группами, основанными после 2000 года).
*/
public class Task03 {

	public static void main(String[] args) {
		MusicBand ban1 = new MusicBand("123", 1965);
		MusicBand ban2 = new MusicBand("1234", 1970);
		MusicBand ban3 = new MusicBand("12345", 2015);
		MusicBand ban4 = new MusicBand("123456", 1980);
		MusicBand ban5 = new MusicBand("fd", 1985);
		MusicBand ban6 = new MusicBand("dfs", 1990);
		MusicBand ban7 = new MusicBand("5425324", 1995);
		MusicBand ban8 = new MusicBand("987", 2000);
		MusicBand ban9 = new MusicBand("765", 2005);
		MusicBand ban10 = new MusicBand("vcxcvx", 2010);
		
		
		List<MusicBand> musicBands = new ArrayList<>();
		
		musicBands.add(ban1);
		musicBands.add(ban2);
		musicBands.add(ban3);

		System.out.println(musicBands);
		
		Collections.shuffle(musicBands);
		System.out.println(musicBands);
		
		groupsAfter2000( musicBands);
		
		
	}

	
	public  static  void groupsAfter2000(List<MusicBand> bands){
	
		List<MusicBand> groupsAfter2000 = new ArrayList<>();
		for(MusicBand o : bands){
			if(o.getYear() > 2000)
				groupsAfter2000.add(o);
				
		}
		
		System.out.println(groupsAfter2000);
		
		
		
	}
}
