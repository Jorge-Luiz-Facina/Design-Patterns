
public class Character {
	public static Character instancia;
	protected static String name;
	 
    protected Character() {
    }
 
    public static Character getInstancia() {
        if (instancia == null)
            instancia = new Character();
        return instancia;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		Character.name = name;
	}
}
