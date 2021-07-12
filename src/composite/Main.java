package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ceo= new Employee("John", "ceo", 30000);
		Employee headSaller= new Employee("dfgh", "Head Sales", 20000);
		Employee headMarketing= new Employee("dcfgvbh", "Head Marketer", 20000);
		Employee clerk= new Employee("cvbn", "Clerk", 15000);
		Employee salesExecutive= new Employee("dfgvhjkl", "Executive", 10000);
		
		ceo.addEmployee(headSaller);
		ceo.addEmployee(headMarketing);
		
		headSaller.addEmployee(clerk);
		
		clerk.addEmployee(salesExecutive);
		
		System.out.println(ceo);
		
		for(Employee headEmployee:ceo.getSubordinates()) {
			System.out.println(headEmployee);
			
		for(Employee employee:headEmployee.getSubordinates()) {
			System.out.println(employee);
		}
		}
	}

}
