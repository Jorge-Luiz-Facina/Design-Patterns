
public class VisitorExample {

	public static void main(String[] args) {
		Item item = new Item();
		
		item.setName("item01");
		item.setType(2);
		item.accept(new Value01());
		System.out.println(item.getValue());
		
		item.accept(new Value02());
		System.out.println(item.getValue());	
	}
}
