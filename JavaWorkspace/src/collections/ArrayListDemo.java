package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Declaration
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		//ArrayList <Integer>mylist=new ArrayList<Integer>(); 
		
       //Adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
	//Size of arraylist
	System.out.println("Size of an arraylist:"+ mylist.size());    //8
	
	//printing arraylist
	System.out.println("Printing data from arraylist:"+mylist);   //[100, 10.5, welcome, A, true, 100, null, null]

	//Remove element from arraylist
	mylist.remove(5);  //here 5 is index of element
	System.out.println("After removing:"+mylist);
	
   //Inserting element in the arraylist
	mylist.add(2,"java");
	System.out.println("After insertion:"+mylist);
	
	//Modify element in the arraylist(modify/replace/change)
	mylist.set(2,"python");
	System.out.println("After replacing:"+mylist);
	
	//Access specific element from arraylist
	System.out.println(mylist.get(3)); 
	
	//Reading all the elements from arraylist
	//Using normal for loop
	/* for (int i=0;i<mylist.size();i++)
	{
		System.out.println(mylist.get(i));
	} */
	//Using for..each loop
	/* for(Object x:mylist)
	{
		System.out.println(x);
	} */
	
	// Using iterator
	Iterator it=mylist.iterator();
	
	while(it.hasNext())
		{
		System.out.println(it.next());  
		}
	
	//Checking arraylist is empty or not
	System.out.println("Is arraylist empty?"+mylist.isEmpty());   //false
	
	// Remove all the elements from array list
	ArrayList mylist2=new ArrayList();
	mylist2.add(100);
	mylist2.add("welcome");

	
	mylist.removeAll(mylist2);
	System.out.println("After removing multiple element:"+mylist);  //[10.5, python, A, true, null, null]
	
	//remove all the elements/clear
	mylist.clear();
	System.out.println("Is arraylist empty?"+mylist.isEmpty());   //true
	
	}

}
