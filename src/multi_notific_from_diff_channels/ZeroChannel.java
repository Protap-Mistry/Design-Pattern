package multi_notific_from_diff_channels;

import java.util.List;

public class ZeroChannel implements ChannelChain{

	private ChannelChain go_next_channel;
	SubscribersSubject subject = new SubscribersSubject();

	@Override
	public void setNext(ChannelChain set_next) 
	{		
		this.go_next_channel= set_next;
	}

	@Override
	public void process(TakeChannel req, List<Subscriber> subscriberHe, List<Subscriber> subscriberShe,
			List<Subscriber> subscriberDesignPattern) 
	{	
		if(req.getNum()=="zc")
		{
			System.out.println("=> Notification from Channel *Zero for:");
			subject.notifyAllDesignPatternSubscriber(subscriberDesignPattern);			
		}
		else 
		{
			System.out.println("End of Channel");
			go_next_channel.process(req,subscriberHe,subscriberShe,subscriberDesignPattern);
		}		
	}	
}
