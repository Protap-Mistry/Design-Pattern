package lab_2;

public class Client_1 implements Client{

	@Override
	public void dataChanged(String currentIP, String networkName) {
		// TODO Auto-generated method stub
		System.out.println(" < Client1:Notified > [ CurrentIP: "+currentIP+", NetworkName: "+networkName+" ]");
	}

}
