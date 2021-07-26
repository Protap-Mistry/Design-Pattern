package multi_notific_from_diff_channels;

import java.util.ArrayList;
import java.util.List;

public class PositiveChannel implements ChannelChain{

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
		if(req.getNum()=="pc")
		{
			System.out.println("=> Notification from Channel *Positive for:");
			subject.notifyAllHeSubscriber(subscriberHe);
		}
		else 
		{
			System.out.println("\n");
			go_next_channel.process(req,subscriberHe,subscriberShe,subscriberDesignPattern);
		}		
	}	
}
