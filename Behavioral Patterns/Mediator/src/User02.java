
public class User02 extends User{
	
	public User02(String name) {
		super(name);
	}

	public void receiver(String in, String message){
		System.out.println("for user02: ");

		super.receive(in,message);
	}
}
