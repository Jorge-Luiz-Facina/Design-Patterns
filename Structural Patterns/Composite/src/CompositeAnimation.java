import java.util.ArrayList;


public class CompositeAnimation extends Animation {
	
	protected ArrayList<Animation> animations;
	
	public CompositeAnimation(String name){
		this.name = name;
		animations = new ArrayList<Animation>();
	}
	
	
	public void add(Animation animation){
		this.animations.add(animation);
	}
	
	public void remove(String thisAnimation){
		for (Animation animation : animations) {
			if(thisAnimation.equals(animation.getName())){
				animations.remove(animation);
				return;
			}
		}
		System.out.println("There is no such animation.");
	}
	
	public Animation getAnimation(String thisAnimation){
		for (Animation animation : animations) {
			if(thisAnimation.equals(animation.getName())){
				return animation;
			}
		}
		System.out.println("There is no such animation.");
		return null;		
	}
	
	@Override
	public void printName() {
		for (Animation animation : animations) {
			animation.printName();
		}
		
	}
}
