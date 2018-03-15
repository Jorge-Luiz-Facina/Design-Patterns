
public class LevelIterator {
	Level[] items;
	int position = 0;
	
	public LevelIterator(Level[] items) {
		this.items = items;
	}
	
	public Object next() {
		Level level = items[position];
		position++;
		return level;
	}
	
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
