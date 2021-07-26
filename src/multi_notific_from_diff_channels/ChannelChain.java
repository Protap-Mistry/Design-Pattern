package multi_notific_from_diff_channels;

import java.util.List;

public interface ChannelChain {
	
	public abstract void setNext(ChannelChain go_next_channel);
	public abstract void process(TakeChannel req, List<Subscriber> subscriberHe, List<Subscriber> subscriberShe, List<Subscriber> subscriberDesignPattern);
}
