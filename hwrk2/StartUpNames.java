package hwrk2;

public class StartUpNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c = new Counter();
		c.set_count(8);	
		// System.out.println(c.get_count());
		
		Counter d = new Counter();
		d.increment();
		// System.out.println(d.get_count());
		
		System.out.println(Counter.howManyCounters);
		
		System.out.println(Math.max(5, 9));
		

	}

}
