package multi_notific_from_diff_channels;

public class SubscriberDesignPattern extends Subscriber{
	
	public SubscriberDesignPattern(SubscribersSubject ss)
	{
		this.ss= ss;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\tDesign Pattern Subscriber");
	}

}
