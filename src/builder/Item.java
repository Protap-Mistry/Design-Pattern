package builder;

public interface Item {
	public String name();
	public float price();
	
	//from Packing interface class
	public Packing packing();
}
