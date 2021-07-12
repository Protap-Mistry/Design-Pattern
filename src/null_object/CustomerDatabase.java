package null_object;

public class CustomerDatabase {
	public static final String[] names= {"Protap","Sarwar","Dipayan"};
	
	public static Customer getCustomer(String name) {
		for(int i=0; i<names.length; i++) {
			if(names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer(name);
	}
}
