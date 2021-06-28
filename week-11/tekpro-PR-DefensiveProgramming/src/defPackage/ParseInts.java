// ****************************************************************
// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//
// ****************************************************************

package defPackage;

import java.util.Scanner;

public class ParseInts 
{
	public static void main(String[] args)
	{
		int val, sum=0;
		Scanner scan = new Scanner(System.in);
		String line;
		
		// read a line of text
		System.out.println("Enter a line of text");
		Scanner scanLine = new Scanner(scan.nextLine());
		
		

		// scan while it's has next input
		while (scanLine.hasNext())
		{
			try 
			{
				val = Integer.parseInt(scanLine.next());
				sum += val;
			}catch(NumberFormatException e)
			{
				// catch error if there is non-number value
			}
			
		}
		
		
		// prints sum of input
		System.out.println("The sum of the integers on this line is " + sum);
	}

}
