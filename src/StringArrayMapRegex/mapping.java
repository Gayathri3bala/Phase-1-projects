package StringArrayMapRegex;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class mapping {
	
	public static void main(String[] args) {
			
		//HashMap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"HashMap");    
	      hm.put(2,"HashTable");    
	      hm.put(3,"TreeMap"); 
	      System.out.println("\nThe elements of Hashmap are "+hm); 
	      
	      hm.replace(2, null);
	      System.out.println("\nThe elements of Hashmap are ");
	      
	      for(Map.Entry<Integer,String> m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
	     
	      hm.clear();
	      System.out.println("\nThe elements of Hashmap are ");
	      
	     
	      //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Atmosphere");  
	      ht.put(5,"Environment");  
	      ht.put(6,"Ecosystem");  
	      ht.put(7,"Surroundings"); 
	     	      
	      System.out.println("\nThe elements of HashTable are ");  
	      	      
	      for(Map.Entry<Integer,String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      System.out.println(ht.contains("Ecosystem"));
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Alpha");    
	      map.put(9,"Beta");    
	      map.put(10,"Gamma");
	     	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      
	      for(Map.Entry<Integer,String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}



