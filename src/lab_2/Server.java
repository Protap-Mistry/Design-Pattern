package lab_2;

import java.util.ArrayList;
import java.util.List;

public class Server {
	private String currentIP, networkName;
	
	private List<Client> clients= new ArrayList<>();
	
	public void addNewClient(Client c) {
		clients.add(c);
	}
	public void removeClient(Client c) {
		clients.remove(c);
	}
	
	public void setCurrentIP(String c_ip) {
		this.currentIP= c_ip;
	}
	public String getCurrentIP() {
		return currentIP;
	}
	
	public void setNetworkName(String name) {
		this.networkName= name;
	}
	public String getNetworkName() {
		return networkName;
	}
	
	public void newData(String currentIP, String networkName) {
		this.currentIP= currentIP;
		this.networkName= networkName;
		notifyAllClients();
	}
	
	public void notifyNow() {
		currentIP= getCurrentIP();
		networkName= getNetworkName();
		notifyAllClients();
	}
	
	public void notifyAllClients() {
		for(Client c:clients) {
			c.dataChanged(currentIP, networkName);
		}
	}
}
