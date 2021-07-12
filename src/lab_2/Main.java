package lab_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server s= new Server();
		
		Client cl1= new Client_1();
		Client cl2= new Client_2();
		
		s.addNewClient(cl1);
		s.addNewClient(cl2);
		
		s.newData("127.0.0.1", "New_network_port");
		s.notifyNow();
		
		s.removeClient(cl1);
		s.notifyNow();
		s.newData("New_IP", "Network");
	}

}
