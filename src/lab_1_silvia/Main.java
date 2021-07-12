package lab_1_silvia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File d1 =new File("f1",2,"binary file");
		File d2 =new File("f2",3,"txt file");
		File d3 =new File("f3",4,"txt file");
		File d4 =new File("f4",6,"txt file");
		File d5 =new File("f5",3,"txt file");
		File d6 =new File("Bisection",1,"txt file");
			
		Folder folder1=new Folder("Builder");
		Folder folder2=new Folder("Decorator");
		Folder folder3=new Folder("Stategy");
		Folder folder4=new Folder("State");
		
		folder1.addFile(folder2);
		folder1.addFile(folder3);
		folder1.addFile(d1);
		
		folder2.addFile(d2);
		folder2.addFile(d3);
		folder2.addFile(d4);
		
		folder3.addFile(folder4);
		folder3.addFile(d5);
		
		folder4.addFile(d6);
		
		folder1.showDetails();				

	}
}
