package Programs;

public class SearchingElementInArray {

	public static void main(String[] args) {
		// Search Element in array(Linear search)
		int a[]= {10,20,30,40,50};
		int search_element=30;
		boolean status=false; // false -not found , true-found
		
		/* for(int i=0;i<a.length;i++) 
		{
			if(a[i]==search_element) 
			{
		System.out.println("Element is found");
			status=true;
		break;
		}

	} */
		for(int x:a)
		{
			if(x==search_element)
			{
				System.out.println("Element is found");
					status=true;
				break;
				}
		}
		if(status==false)
		{
		System.out.println("Element not found");
		}
}
}
