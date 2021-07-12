package visitor;

public interface CreditCard {
	public String getName();
	
	void offerAccept(Visitor v);
}
