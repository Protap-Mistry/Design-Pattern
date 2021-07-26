package multi_notific_from_diff_channels;

import java.util.ArrayList;
import java.util.List;

public class SubscribersSubject {
	
	public List<Subscriber> subscriberHe= new ArrayList<Subscriber>();
	public List<Subscriber> subscriberShe= new ArrayList<Subscriber>();
	public List<Subscriber> subscriberDesignPattern= new ArrayList<Subscriber>();
	
	public void attachHe(Subscriber subscriber)
	{
		subscriberHe.add(subscriber);
	}
	public void attachShe(Subscriber subscriber)
	{
		subscriberShe.add(subscriber);
	}
	public void attachDesignPattern(Subscriber subscriber)
	{
		subscriberDesignPattern.add(subscriber);
	}
	
	public void deattachHe(Subscriber subscriber)
	{
		subscriberHe.remove(subscriber);
	}
	public void deattachShe(Subscriber subscriber)
	{
		subscriberShe.remove(subscriber);
	}
	public void deattachDesignPattern(Subscriber subscriber)
	{
		subscriberDesignPattern.remove(subscriber);
	}
	
	public void notifyAllHeSubscriber(List<Subscriber> subscriber1)
	{
		for(Subscriber subscriber: subscriber1)
		{
			subscriber.update();
		}
	}
	public void notifyAllSheSubscriber(List<Subscriber> subscriber2)
	{
		for(Subscriber subscriber: subscriber2)
		{
			subscriber.update();
		}
	}
	public void notifyAllDesignPatternSubscriber(List<Subscriber> subscriber3)
	{
		for(Subscriber subscriber: subscriber3)
		{
			subscriber.update();
		}
	}
}
