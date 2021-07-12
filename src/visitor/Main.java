package visitor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard bronze=new BronzeCreditCard();
		CreditCard silver=new SilverCreditCard();
		CreditCard gold=new GoldCreditCard();
		
		Visitor visitor1=new FoodOffer();
		Visitor visitor2=new GasOffer();
		
		//gold.offerAccept(visitor1);
		silver.offerAccept(visitor1);
		
		//silver.offerAccept(visitor2);
		//gold.offerAccept(visitor2);
	}

}
