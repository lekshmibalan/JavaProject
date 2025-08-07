package collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {
		// Declaration
		HashMap <Integer,String> hm=new HashMap <Integer,String> ();
		
		//Adding pairs
		hm.put(101, "lekshmi");
		hm.put(102, "lekshmi1");
		hm.put(103, "lekshmi2");
		hm.put(104, "lekshmi3");
		hm.put(101, "lekshmi12");
		System.out.println(hm);   //{101=lekshmi12, 102=lekshmi1, 103=lekshmi2, 104=lekshmi3}

		// Size of hashmap
		System.out.println("Size of hashmap:"+hm.size());  //4
		
		//Remove pair
		hm.remove(102);    //102 is key of the pair
		System.out.println("After removing pair:"+ hm);    //{101=lekshmi12, 103=lekshmi2, 104=lekshmi3}
		
    // Access value of the key
		System.out.println(hm.get(104));   //104 is key   //lekshmi3
		
		//Get all the keys from hashmap
		System.out.println(hm.keySet());   //[101, 103, 104]
		
		//Get all the values from hashmap
		System.out.println(hm.values());    //[lekshmi12, lekshmi2, lekshmi3]
		
		// Get all keys and the values from hashmap
		System.out.println(hm.entrySet());       //[101=lekshmi12, 103=lekshmi2, 104=lekshmi3]
		
		
		//Reading data from hashmap
		//using for..each
		/* for(int k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
	     }  */
		
		//Using Iterator
		Iterator<Entry<Integer, String>> it=hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		
		
		//Clearing all the elements in hashmap
		
		hm.clear();
		System.out.println(hm.isEmpty());  //true
		
	}
	
	}
