
public class Message {

	private String message;
	private Person sender;
	private Person reciver;
	
	public Message(String message, Person sender, Person reciver) {
		this.message = message;
		this.sender = sender;
		this.reciver = reciver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Person getSender() {
		return sender;
	}

	public void setSender(Person sender) {
		this.sender = sender;
	}

	public Person getReciver() {
		return reciver;
	}

	public void setReciver(Person reciver) {
		this.reciver = reciver;
	}
	
}
