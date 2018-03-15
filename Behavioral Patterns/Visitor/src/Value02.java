
public class Value02 implements Visitor{

	public void visit(Visitable visitable) {
		if(visitable instanceof Item){
			Item item = (Item) visitable;
			item.setValue(valueRandom());
		}	
	}	
	
	public double valueRandom(){
		return Math.random() * 100;
	}
}
