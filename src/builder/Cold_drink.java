package builder;

public abstract class Cold_drink implements Item{

	@Override
	public abstract float price();

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
