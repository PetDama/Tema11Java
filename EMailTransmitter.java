
public class EMailTransmitter implements Transmitter{
	public Message message;
	

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	
	@Override
	public void store(Message message) {
		this.message = message;
		message.getReciver().notification(this);
	}

	@Override
	public Message retrieve(Person receiver) {
		return message;
		
	}

}
