package Events;

import org.apache.commons.math3.distribution.ExponentialDistribution;

import findLibrary.DESSheduler;

public class Einkauf implements Event{
	private long timeStamp;
	private DESSheduler mySheduler;
	private int verteilung = (int)Math.round(new ExponentialDistribution(7500).sample());;
	private String name = "Einkauf";
	
	public Einkauf(long l, DESSheduler mySheduler) {
		this.timeStamp = l;
		this.mySheduler = mySheduler;
		
	}

	@Override
	public void execute() {
		System.out.println("Currenttime: " + timeStamp );
		Event newEvent = new Abwiegen(this.timeStamp + verteilung , this.mySheduler);
		
		mySheduler.Queue.remove(this);
		mySheduler.Queue.add(newEvent);
		System.out.println(mySheduler.Queue);
		this.mySheduler.CountEvents ++;
		mySheduler.Queue.peek().execute();
		
		
	}

	public String getName() {
		return this.name;
	}
	
	public long getTimeStamp() {
		return timeStamp;
	}

	@Override
	public int compareTo(Event o) {
		if (this.timeStamp == o.getTimeStamp()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return this.name + timeStamp ;
	}
	
}
