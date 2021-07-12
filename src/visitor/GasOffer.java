package visitor;

public class GasOffer implements Visitor{

	@Override
	public void visit(BronzeCreditCard bronze) {
		// TODO Auto-generated method stub
		System.out.println(bronze.getName()+" Credit Card will get 2% discount on Gas");
	}

	@Override
	public void visit(SilverCreditCard silver) {
		// TODO Auto-generated method stub
		System.out.println(silver.getName()+" Credit Card will get 4% discount on Gas");
	}

	@Override
	public void visit(GoldCreditCard gold) {
		// TODO Auto-generated method stub
		System.out.println(gold.getName()+" Credit Card will get 10% discount on Gas");
	}

}
