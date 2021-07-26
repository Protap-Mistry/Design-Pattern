package multi_notific_from_diff_channels;

public class SubscriberShe extends Subscriber{
	
	public SubscriberShe(SubscribersSubject ss)
	{
		this.ss= ss;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("\tFemale[She] Subscriber");
	}

}
