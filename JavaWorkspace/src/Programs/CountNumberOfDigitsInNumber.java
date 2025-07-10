package Programs;

public class CountNumberOfDigitsInNumber {

	public static void main(String[] args) {
		// Count the number of digits in a number 
		   int num = 12345;
	        int count = 0;
	        int temp = num; // Preserve the original number

	        while (temp != 0) {
	            temp = temp / 10;
	            count++;
	        }

	        System.out.println("Number of digits in " + num + " is: " + count);
	    }
	
		

	}


