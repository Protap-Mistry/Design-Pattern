package multi_notific_from_diff_channels;

public class SubscriberHe extends Subscriber{
	
	public SubscriberHe(SubscribersSubject ss)
	{
		this.ss= ss;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\tMale[He] Subscriber");
	}

}
