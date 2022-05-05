
public class Person {
	String nume; 
	
	Transmitter transmitter;

	public Person(String nume) {
		this.nume = nume;
	}
	
	public void setTransmitter(Transmitter t) {
		transmitter = t;
	}
	
	public void send(Person person, String message) {
		Message msg = new Message(message, this, person);
		transmitter.store(msg);
    }
	
	public void notification (Transmitter t) {
		System.out.println(t.retrieve(this).getSender().nume +
				" send to " + this.nume + " " + t.retrieve(this).getMessage());
	}
	
}