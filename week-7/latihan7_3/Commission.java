package latihan7_3;

public class Commission extends Hourly
{
	private double totalSale;
	private double commissionRate;
	
	// Sets up a commission employee using the specified information
	public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate, double cmsRate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
			
		commissionRate = cmsRate / 100;
		totalSale = 0;
	}
	
	// Adds the specified number of sales to this employee's
	// accumulated sales.
	public void addSales (double totalSale)
	{
		this.totalSale += totalSale;
	}
	
	// Computes and returns the pay for this commission employee.
	public double pay ()
	{
		double payment = super.pay() + (totalSale * commissionRate);
		
		totalSale = 0;
		
		return payment;
	}
	
	// Returns information about this commissions employee as a string.
		public String toString ()
		{
			String result = super.toString();
			
			result += "\nTotal Sale: " + totalSale;
			
			return result;
		}
}
