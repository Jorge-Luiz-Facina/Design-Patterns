
import java.util.HashMap;

public class GeneralChat extends Chat{

	private HashMap<String, User> list = new HashMap<String, User>();

	@Override
	public void register(User user) {
		if(!list.containsValue(user))
			list.put(user.getName(), user);
		
		user.setChat(this);
	}
	
	public void sendMessage(String in,String destiny,  String message) {
		User user = list.get(destiny);
		
		if(user != null)
			user.receive(in, message);	
	}
}
