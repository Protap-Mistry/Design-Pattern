package visitor;

public class GoldCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Gold";
	}

	@Override
	public void offerAccept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
