
public class Originator {

	private String state;

	public String getEstado() {
		return state;
	}

	public void setEstado(String state) {
		this.state = state;
	}
	
	public Memento saveStateMemento(){
		return new Memento(state);
	}
	
	public void getStateMemento(Memento lastState){
		state = lastState.getState();
	}
}
