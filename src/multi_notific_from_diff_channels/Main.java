package multi_notific_from_diff_channels;

public class Main {

	public static void main(String[] args) {
		
		ChannelChain c1= new PositiveChannel();
		ChannelChain c2= new NegativeChannel();
		ChannelChain c3= new ZeroChannel();
		
		SubscribersSubject subject= new SubscribersSubject();
		
		Subscriber he= new SubscriberHe(subject);
		Subscriber she= new SubscriberShe(subject);
		Subscriber dp= new SubscriberDesignPattern(subject);
		
		subject.attachHe(he);
		subject.attachHe(she);
		
		subject.attachShe(she);
		subject.attachShe(dp);
		
		subject.attachDesignPattern(dp);
		subject.attachDesignPattern(he);
		
		c1.setNext(c2);
		c2.setNext(c3);
		
		c1.process(new TakeChannel("pc"),subject.subscriberHe,subject.subscriberShe,subject.subscriberDesignPattern);
		c1.process(new TakeChannel("nc"),subject.subscriberHe,subject.subscriberShe,subject.subscriberDesignPattern);
		c1.process(new TakeChannel("zc"),subject.subscriberHe,subject.subscriberShe,subject.subscriberDesignPattern);
	}
}
