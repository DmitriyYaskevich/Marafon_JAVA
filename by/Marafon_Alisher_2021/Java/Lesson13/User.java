package by.Marafon_Alisher_2021.Java.Lesson13;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userName;
	private List<User> podpiski;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
		this.podpiski = new ArrayList<>();
	}
	public List<User> getPodpiski() {
		return podpiski;
	}
	public void setPodpiski(List<User> podpiski) {
		this.podpiski = podpiski;
	}
	
	public User(String userName){
		this.userName = userName;
		
	}
	
	public void podpisivaet(User user){
		podpiski.add(user);
	}
	
	public boolean podpiskiTrue(User user){
		for(User o : podpiski){
			if(o.getUserName().equals(user.getUserName()))
				return true;
		}
		return false;
	}
	
	public boolean isFriend(User user){
		return user.isFriend(this) && this.podpiskiTrue(user);
	}
	
	public void sendMessage(User user, String text){
		MessageDataBase.addNewMessage(this, user, text);
	}
	
	@Override
	public String toString(){
		return "Имя пользователя: " + userName ;
	}
}
