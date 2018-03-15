
public class Value01 implements Visitor{

	public void visit(Visitable visitable) {
		if(visitable instanceof Item){
			Item item = (Item) visitable;
			
			item.setValue(item.getType() * 10);
		}	
	}	
}
