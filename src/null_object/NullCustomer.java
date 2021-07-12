package null_object;

public class NullCustomer extends Customer{
	
	public NullCustomer(String n) {
		this.name= n;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Not Available in Customer Database";
	}

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return true;
	}

}
