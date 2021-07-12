package visitor;

public interface Visitor {
	void visit(BronzeCreditCard bronze);
	void visit(SilverCreditCard silver);
	void visit(GoldCreditCard gold);
}
