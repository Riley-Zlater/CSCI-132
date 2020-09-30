package hwrk1;

import hwrk2.Counter;

public class CounterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c;		
		c = new Counter();
		
		c.increment(30);
		
		System.out.println(c.get_count());
		
		c.reset();
		
		System.out.println(c.get_count());
		
		
		// REFERENCE DATA TYPES
		
		Counter e;
		Counter d;
		
		d = new Counter();
		
		d.increment();
		
		e = d;
		
		e.reset();
		
		System.out.println("Reference vars d and e: ");
		System.out.println(d.get_count());
		
		d.set_count(50);
		
		System.out.println(d.get_count());
		
		
	}

}
