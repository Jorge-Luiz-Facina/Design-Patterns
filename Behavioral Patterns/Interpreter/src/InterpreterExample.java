
import java.util.ArrayList;

public class InterpreterExample {
	
	public static void main(String[] args) {
		String numberRoman = "MCXVI";
		Context context = new Context(numberRoman);
		
		ArrayList<Expression> interpreters = new ArrayList<Expression>();
		interpreters.add(new ThousandExpression());
		interpreters.add(new HundredExpression());
		interpreters.add(new TenExpression());
		interpreters.add(new OneExpression());

		
		for (Expression interpreter : interpreters) {
			interpreter.interpret(context);
		}

		System.out.println(numberRoman + " = " + Integer.toString(context.getOutput()));
	}
}
