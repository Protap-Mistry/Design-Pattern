package lab_6_kakon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context=new Context(new Bubblesort());
		String s=context.strategyfun();
		System.out.println(s);
		
	    context=new Context(new Mergesort());
		s=context.strategyfun();
		System.out.println(s);
		
	    context=new Context(new Insertionsort());
		s=context.strategyfun();
		System.out.println(s);
		
		context=new Context(new Quicksort());
		s=context.strategyfun();
		System.out.println(s);
	}

}
