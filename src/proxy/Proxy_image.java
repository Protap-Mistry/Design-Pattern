package proxy;

public class Proxy_image implements Image{
	
	private String fileName;
	private Real_image real_img;
	
	public Proxy_image(String fileName) {
		this.fileName= fileName;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		if(real_img==null) {
			real_img= new Real_image(fileName);
		}
		real_img.display();
	}

}
