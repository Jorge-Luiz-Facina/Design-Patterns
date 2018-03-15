
public class IteratorExample {

	public static void main(String[] args) {
		Level [] levels = new Level[5];
		
		levels[0] = new Level("Very Easy");
		levels[1] = new Level("Easy");
		levels[2] = new Level("Normal");
		levels[3] = new Level("Epic");
		levels[4] = new Level("Legendary");
		
		for (int i=0; i < levels.length; i++) {
			System.out.println(levels[i].name);
		}
	}
}
