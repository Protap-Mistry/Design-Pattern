package proxy;

public class Real_image implements Image{
	
	private String fileName;
	
	public Real_image(String fileName) {
		this.fileName= fileName;
		loadFromDisk(fileName);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying "+fileName);
	}
	
	private void loadFromDisk(String fileName) {
		System.out.println("Loading "+fileName);
	}

}
