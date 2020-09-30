package hwrk6;

public class ObjectPair {
		
	Object first;
	Object second;
		
	public ObjectPair(Object a, Object b) {
		first = a;
		second = b;
	}
	
	public Object getFirst() {
		return first;
	}
	
	public Object getSecond() {
		return second;
	}
	
	public String toString() {
		return "[" + first + ", " + second + "]";
	}
	
	public static void main(String[] args) {
		
		ObjectPair bid = new ObjectPair("TWIR", 38.70);
		System.out.println(bid);
		
		ObjectPair socks = new ObjectPair("l", "r");
		System.out.println(socks);
		
		System.out.println(bid.getFirst().getClass());
		System.out.println(bid.getSecond().getClass());
		System.out.println(socks.getClass());
		
		char sock = (char) socks.getFirst();
		System.out.println(sock);
	}
	
}

