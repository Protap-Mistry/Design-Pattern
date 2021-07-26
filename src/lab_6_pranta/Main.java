package lab_6_pranta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context bubble = new Context(new BubbleSort());
		Context quick =  new Context(new QuickSort());


		int number[]= {10,15,30,35,40};
		bubble.executeAlogrithm(number);
		
		quick.executeAlogrithm(number);
	}

}
