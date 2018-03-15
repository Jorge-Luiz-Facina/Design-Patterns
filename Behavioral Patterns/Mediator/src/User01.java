
public class User01 extends User{

	public User01(String name) {
		super(name);
	}
	
	public void receiver(String in, String message){
		System.out.println("for user01: ");

		super.receive(in,message);
	}
}
