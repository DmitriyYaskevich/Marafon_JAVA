package by.Marafon_Alisher_2021.Java.Lesson13;

public class Task01 {

	public static void main(String[] args) {
		User user1 = new User("user1");
		User user2 = new User("user2");
		User user3 = new User("user3");
		
		user1.sendMessage(user2, "Hello  user2!");
		user1.sendMessage(user2, "How are you?");
		
		user2.sendMessage(user1, "Hello user1");
		user2.sendMessage(user1, "I'm user2. Nice ti meet you!");
		
		MessageDataBase.showDialog(user1, user2);
		
		
	}

}
