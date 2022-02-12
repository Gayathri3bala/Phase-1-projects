package Collections;

import java.util.LinkedList;

import java.util.Iterator;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> b=new LinkedList<Integer>();
		
		b.add(10);
		b.add(15);
		b.add(20);
		b.add(40);
		b.add(10);
		b.add(150);
		b.add(100);
		System.out.println("Size of the list is:"+b.size());
		System.out.println("List of no.s:"+b);
		
		b.remove(4);
		b.add(4, 55);
		System.out.println("List of no.s:"+b);
		System.out.println("Second no.is:"+b.get(2));
		
		//Foreach loop
		for(Integer i :b) {
			System.out.println(i);
			
		}
		//Iterator loop
		Iterator<Integer> ite=b.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		
		
		
	}

}
