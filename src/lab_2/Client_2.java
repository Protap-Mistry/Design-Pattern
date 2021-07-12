package lab_2;

public class Client_2 implements Client{

	@Override
	public void dataChanged(String currentIP, String networkName) {
		// TODO Auto-generated method stub
		System.out.println(" < Client2:Notified > [ CurrentIP: "+currentIP+", NetworkName: "+networkName+" ]");
	}

}
