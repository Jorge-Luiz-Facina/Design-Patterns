
import java.util.Observable;

public class Money extends Observable {

	private double value;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
		setChanged();
		this.notifyObservers();
	}
}
