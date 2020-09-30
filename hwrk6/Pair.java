package hwrk6;

public class Pair<A, B> {
	
	A first;
	B second;

	public Pair(A a, B b) {
		first = a;
		second = b;
	}
	
	public A getFirst() {
		return first;
	}
	
	public B getSecond() {
		return second;
	}
	
	public String toString() {
		return "[" + first + ", " + second + "]";
	}
	
	public static void main(String[] args) {
		Pair<String, Double> bid = new Pair<>("TWIR", 38.70);
		System.out.println(bid);
		
		String sock = bid.getFirst();
		System.out.println(sock);
	}
}
