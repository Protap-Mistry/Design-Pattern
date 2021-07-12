package chain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chain p= new Positive();
		Chain z= new Zero();
		Chain n= new Negative();
		
		p.setNext(z);
		z.setNext(n);
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Give your first testing value: ");
		int val1= in.nextInt();
		p.process(new Number(val1));
		
		System.out.println("\nGive your second testing value: ");
		int val2= in.nextInt();
		p.process(new Number(val2));
		
		System.out.println("\nGive your third testing value: ");
		int val3= in.nextInt();
		p.process(new Number(val3));
	}

}
