package mvc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m= database();
		View v= new View();
		
		Controller c= new Controller(m, v);
		c.output();
		
		c.setUpdateName("Sarwar");
		c.setUpdateRoll("17CSE016");
		
		c.output();
	}

	private static Model database() {
		// TODO Auto-generated method stub
		Model stu= new Model();
		stu.setName("Protap");
		stu.setRoll("17CSE029");
		
		return stu;
	}

}
