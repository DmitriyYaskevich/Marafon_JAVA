package by.Marafon_Alisher_2021.Java.Lesson13;

import java.util.Date;

public class Message {

	private User sender;
	private User receiver;
	private String text;
	private Date data;
	
	public Message (User sender, User receiver, String text){
		this.setSender(sender);
		this.setReceiver(receiver);
		this.setText(text);
		this.setData(new Date());
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public String toString(){
		return "FROM: " + sender.getUserName() + "\nTO: " + receiver.getUserName() + "\nON: " +  data + "\n" + this.text;
				
	}
}
