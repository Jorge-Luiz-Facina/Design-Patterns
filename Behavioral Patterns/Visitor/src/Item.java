
public class Item implements Visitable{

	private String name;
	private int type;
	private double value;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);	
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}
