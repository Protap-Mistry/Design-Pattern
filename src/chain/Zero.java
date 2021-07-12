package chain;

public class Zero implements Chain{
	private Chain nextInChain;
	
	@Override
	public void setNext(Chain nextInChain) {
		// TODO Auto-generated method stub
		this.nextInChain= nextInChain;
	}

	@Override
	public void process(Number req) {
		// TODO Auto-generated method stub
		if(req.getNumber()==0) {
			System.out.println("Choose (0) processor.");
		}else {
			nextInChain.process(req);
		}
	}

}
