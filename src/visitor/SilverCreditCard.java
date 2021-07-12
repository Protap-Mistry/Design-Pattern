package visitor;

public class SilverCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public void offerAccept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
