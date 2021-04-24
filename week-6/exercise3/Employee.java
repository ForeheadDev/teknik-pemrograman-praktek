package exercise3;

class Employee extends Sortable
{
	
	private String name;
	private double salary;
	private int hireday;
	private int hiremonth;
	private int hireyear;
	
	/* Constructor for Employee */
	public Employee(String n, double s, int day, int month, int year)
	{
		 name = n;
		 salary = s;
		 hireday = day;
		 hiremonth = month;
		 hireyear = year;
	}
	
	/* Print info method */
	public void print()
	{
		System.out.println(name + " " + salary + " " + hireYear());
	}
	
	/* Method for adding salary */
	public void raiseSalary(double byPercent)
	{
		salary *= 1 + byPercent / 100;
	}
	
	/* Accessor for hireyear : return hire year */
	public int hireYear()
	{
		return hireyear;
	}
	
	@Override
	public int compare(Sortable b)
	{
		Employee eb = (Employee) b;
		if (salary<eb.salary) return -1;
		if (salary>eb.salary) return +1;
		return 0;
	}
	
	
}
