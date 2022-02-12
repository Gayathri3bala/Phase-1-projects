package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class VectorDemo {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		
		System.out.println("Size of Arraylist:"+a.size());
		a.add("Audi");
		a.add("Benz");
		a.add("Mustang");
		a.add("Lambhorgini");
		a.add(null);
		
		System.out.println("Size of Arraylist:"+a.size());
		System.out.println("List of names:"+a);
		a.add(2, "Suzuki");
		System.out.println("List of names:"+a);
		System.out.println("Is the list contains banana?"+a.contains("banana"));
		a.remove(1);
		a.remove("Lambhorgini");
		System.out.println("List of names:"+a);
		System.out.println("Third Name is:"+a.get(2));
		
		//Foreach loop
		for(String s:a) {
			System.out.println(s);
			
		}
		Iterator<String> ite=a.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		
		
		
			}

}
