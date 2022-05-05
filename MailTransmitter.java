
public class MailTransmitter implements Transmitter {

	public Message message;
	public Message buffer[];
	static int contor = 0;
	
	public MailTransmitter(int number){
		buffer = new Message[number];
	}
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public void store(Message message) {
		
		buffer[contor] = message;
		contor++;
		
		if(contor == buffer.length)
		{
			for(int i=0;i<buffer.length;i++) {
				//buffer[i].getReciver().notification(this);
				System.out.println(buffer[i].getMessage());
			}
		}
		
	
	}

	@Override
	public Message retrieve(Person receiver) {
		for(int i=0;i<contor;i++) {
			if(receiver.nume == this.message.getReciver().nume)
				return buffer[i];
		}
		return null;
	}

}
