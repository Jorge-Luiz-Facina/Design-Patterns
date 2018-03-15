
public abstract class Expression {
	public void interpret(Context context) {
		if (context.getInput().length() == 0) {
			return;
		}

		if (context.getInput().startsWith(nine())) {
			addValueOutput(context, 9);
			context.setInput(context.getInput().substring(2));
		} else if (context.getInput().startsWith(four())) {
			addValueOutput(context, 4);
			context.setInput(context.getInput().substring(2));
		} else if (context.getInput().startsWith(five())) {
			addValueOutput(context, 5);
			context.setInput(context.getInput().substring(1));
		}

		while (context.getInput().startsWith(one())) {
			addValueOutput(context, 1);
			context.setInput(context.getInput().substring(1));
		}
	}

	private void addValueOutput(Context contexto, int number) {
		contexto.setOutput(contexto.getOutput() + (number * multiplier()));
	}

	public abstract String one();

	public abstract String four();

	public abstract String five();

	public abstract String nine();

	public abstract int multiplier();
}
