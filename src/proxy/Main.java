package proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image img= new Proxy_image("test.jpg");
		
		//image will be loaded from disk
		img.display(); 
	    System.out.println("");
	      
      //image will not be loaded from disk
      img.display();
      
	}

}
