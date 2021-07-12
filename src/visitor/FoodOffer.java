package visitor;

public class FoodOffer implements Visitor{

	@Override
	public void visit(BronzeCreditCard bronze) {
		// TODO Auto-generated method stub
		System.out.println(bronze.getName()+" Credit Card will get 5% discount on Food");
	}

	@Override
	public void visit(SilverCreditCard silver) {
		// TODO Auto-generated method stub
		System.out.println(silver.getName()+" Credit Card will get 8% discount on Food");
	}

	@Override
	public void visit(GoldCreditCard gold) {
		// TODO Auto-generated method stub
		System.out.println(gold.getName()+" Credit Card will get 12% discount on Food");
	}

}
