package Programs;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int search_element=30;
		for(int i=0;i<a.length;i++) {
			if(a[i]==search_element) {
			System.out.println("Element is found");
			break;
		}

	}

}
}
