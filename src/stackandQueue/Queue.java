package stackandQueue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue {
	public static void main(String args[]) {
		PriorityQueue<Double> B=new PriorityQueue<Double>();
		
		B.add(3.14);
		B.add(4.56);
		B.add(5.25);
		B.add(6.75);
		B.add(7.56);
		System.out.println("Size of Queue:"+B.size());
		System.out.println(B.peek());
		System.out.println(B.isEmpty());
		System.out.println("The Queue Elements:");
		
		for(Double d: B) {
			System.out.println(d);
			
		}
		System.out.println(B.remove(6.75));
		System.out.println("The Queue Elements:");
		
		Iterator<Double> ite=B.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
			
		}
	}
}
