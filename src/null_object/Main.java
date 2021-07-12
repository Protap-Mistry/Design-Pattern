package null_object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= CustomerDatabase.getCustomer("Protap");
		Customer c2= CustomerDatabase.getCustomer("xdcftgyhjkl");
		Customer c3= CustomerDatabase.getCustomer("Sarwar");
		Customer c4= CustomerDatabase.getCustomer("cvbnm");
		Customer c5= CustomerDatabase.getCustomer("Dipayan");
		
		System.out.println("Customers:");
		System.out.println(c1.getName());
		System.out.println(c2.getName());
		System.out.println(c3.getName());
		System.out.println(c4.getName());
		System.out.println(c5.getName());
	}

}
