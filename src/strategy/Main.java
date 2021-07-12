package strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context con_add= new Context(new Add());
		System.out.println("10+5= "+con_add.executeStrategy(10, 5));
		
		Context con_sub= new Context(new Sub());
		System.out.println("10-5= "+con_sub.executeStrategy(10, 5));
		
		Context con_mult= new Context(new Mult());
		System.out.println("10*5= "+con_mult.executeStrategy(10, 5));
	}

}
