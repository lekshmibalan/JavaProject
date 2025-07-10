package Programs;

public class Palindrome {

	public static void main(String[] args) {
	// Check if a number is a palindrome
		/*int num=12321;
		int originalNum=num;// Store the original number for comparison
		int reverse=0;
		while(num!=0)
		{
			int digit =num % 10; // Get the last digit
			reverse = reverse * 10 + digit;// Append the digit to reverse
			num=num /10; // Remove the last digit from number
			}
		  if (originalNum == reverse) {
	            System.out.println(originalNum + " is a palindrome number.");
	        } else {
	            System.out.println(originalNum + " is not a palindrome number.");
	        } */
// Check if the string is a palindrome
		String str="madam"; 
		 String reversedStr = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversedStr += str.charAt(i);
	        }
	        if (str.equals(reversedStr)) {
	            System.out.println(str + " is a palindrome string.");
	        } else {
	            System.out.println(str + " is not a palindrome string.");
	        }
		  
		  
		  
	}

}
