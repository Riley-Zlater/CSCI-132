package hwrk2;

public class Counter {
	
	//Fields
	private int count;
	public static int howManyCounters = 0;
	
	//Constructor
	public Counter() {
		this.count = 0;
		howManyCounters++;
	}
	
	public Counter(int initial) {
		this.count = 0;
		howManyCounters++;
	};
	
	//Methods
	public int get_count() {
		return this.count;
	}
	
	public void set_count(int delta) {
		count = delta;
	}
	
	public void increment() {
		this.count++;
	}
	
	public void increment(int delta) {
		this.count += delta;
	}
	
	public void reset() {
		this.count = 0;
	}

}
