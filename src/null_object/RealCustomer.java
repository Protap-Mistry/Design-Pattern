package null_object;

public class RealCustomer extends Customer{
	
	public RealCustomer(String n) {
		this.name= n;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isNil() {
		// TODO Auto-generated method stub
		return false;
	}

}
