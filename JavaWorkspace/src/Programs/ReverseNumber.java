package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		// Reverse a number using % and /
		int num = 12345;
		int reverse =0;
		while(num!=0)
		{
			int digit = num % 10; // Get the last digit
			reverse = reverse *10 + digit; // Append the digit to reverse
			num = num /10; // Remove the last digit from number		
			}
		System.out.println("Reversed number: " + reverse);
	}

}
