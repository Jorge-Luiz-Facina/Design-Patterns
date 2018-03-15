
public abstract class User {

	private String name;
	private GeneralChat chat;
	
	public User(String name){
		this.name = name;
	}

	public GeneralChat getChat() {
		return chat;
	}

	public void setChat(GeneralChat chat) {
		this.chat = chat;
	}

	public String getName() {
		return name;
	}
	
	public void submit(String destiny, String message){
		chat.sendMessage(name, destiny, message);
	}
	
	public void receive(String in, String message){
		System.out.println(in +" destiny " + name +": " + message);
	}
}
