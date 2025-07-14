package Programs;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	
		public static void main(String[] args) {
			// int num=20; //hard coded value
			Scanner sc=new Scanner(System.in);   //Scanner class is used to take input from keyboard
			/* System.out.println("Enter a number:");
			int num=sc.nextInt();
			System.out.println("Given number is:" +num); */
			/* System.out.println("Enter a decimal number:");
			double num=sc.nextDouble();
			System.out.println("Given value is:"+num); */
			System.out.println("Enter your city:");
			String city=sc.next();
			System.out.println("Your city is:"+ city);

			}
			}