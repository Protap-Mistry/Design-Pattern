package composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name, dept;
	private int salary;
	private List<Employee> subordinates;
	
	public Employee(String n, String d, int s) {
		this.name= n;
		this.dept= d;
		this.salary= s;
		subordinates= new ArrayList<Employee>();
	}
	public void addEmployee(Employee e) {
		subordinates.add(e);
	}
	public void removeEmployee(Employee e) {
		subordinates.remove(e);
	}
	public List<Employee> getSubordinates(){
		return subordinates;
	}
	public String toString() {
		return("Employee name: "+name+"; department: "+dept+"; salary:"+salary);
	}
}
