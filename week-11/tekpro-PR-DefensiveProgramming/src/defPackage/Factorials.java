// ****************************************************************
// Factorials.java
// Reads integers from the user and prints the factorial of each.
//
// ****************************************************************

package defPackage;

import java.util.Scanner;

public class Factorials 
{
	public static void main(String[] args)
	{
		String keepGoing = "y";
		Scanner scan = new Scanner(System.in);
		
		
		while (keepGoing.equals("y") || keepGoing.equals("Y"))
		{
			try
			{
				// scan an integer
				System.out.print("Enter an integer: ");
				int val = scan.nextInt();
				
				// Check if the value is not negative number
				if(val < 0)
					throw new IllegalArgumentException("Value must not be negative number");
				
				// Check if the value is greater than 16 : because int can handle it
				if(val > 16)
					throw new IllegalArgumentException("Value must not be greater than 16");
				
				// calculate the factorial
				System.out.println("Factorial(" + val + ") = "+ MathUtils.factorial(val));
				
			}catch (IllegalArgumentException e)
			{
				// catch an invalid input : print why is invalid
				System.out.println(e.getMessage());
			}
			
			// ask for another input
			System.out.print("Another factorial? (y/n) ");
			keepGoing = scan.next();
		}
	}

}
