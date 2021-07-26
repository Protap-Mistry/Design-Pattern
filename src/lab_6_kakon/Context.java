package lab_6_kakon;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy)
	{
		this.strategy=strategy;
	}
	public String strategyfun()
	{
		return strategy.sort();
	}
}
