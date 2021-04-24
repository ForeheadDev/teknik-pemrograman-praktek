package exercise3;

import java.util.*; // import for use calendar and Gregorian calendar

class Manager extends Employee
{
	
	private String secretaryName;
	
	/* Contstructor for Manager */
	public Manager (String n, double s, int d, int m, int y)
	{
		super(n, s, d, m, y);
		secretaryName = "";
	}
	
	/* Overidding method for raising salary */
	public void raiseSalary(double byPercent)
	{
		// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireYear());
		super.raiseSalary(byPercent + bonus);
	}
	
	/* Accessor for secretary name : return secretary name as a string */
	public String getSecretaryName()
	{
		return secretaryName;
	}
	
}
