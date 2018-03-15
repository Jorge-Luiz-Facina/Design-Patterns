
public class MementoExample {
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setEstado("first state");
		
		CareTaker careTaker = new CareTaker();
		careTaker.add(originator.saveStateMemento());
		
		originator.setEstado("second state");
		careTaker.add(originator.saveStateMemento());
		System.out.println(originator.getEstado());
		
		originator.getStateMemento(careTaker.get(0));
		System.out.println(originator.getEstado());

	}
}
