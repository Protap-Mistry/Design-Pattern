package lab_5_d;

public class SubFoods implements PeanutButterAndJellySandwich{
	
	String name;
	
	public SubFoods(String name) {
		this.name= name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public void makeFood() {
		// TODO Auto-generated method stub
		System.out.println("Sub-foods: "+name);
	}

}
