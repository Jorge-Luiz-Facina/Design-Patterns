
import java.util.Observable;
import java.util.Observer;

public class Shop implements Observer{
	
	Observable money;
	
	public Shop(Observable money){
		this.money = money;
		money.addObserver(this);
	}
	
	public void update(Observable moneySubject, Object arg1) {
		if(moneySubject instanceof Money){
			Money money = (Money)moneySubject;
			System.out.println("Congratulations you received " + money.getValue() + " pass in the store at any time to negotiate");
			
		}			
	}
}
