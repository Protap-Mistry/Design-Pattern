package visitor;

public class BronzeCreditCard implements CreditCard{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Bronze";
	}

	@Override
	public void offerAccept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
