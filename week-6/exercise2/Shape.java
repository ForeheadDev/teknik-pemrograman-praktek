package exercise2;

public class Shape 
{
	
	private String color;
	private boolean filled;
	
	/* Constructor 1st : no argument */
	public Shape()
	{
		this.color = "red";
		this.filled = true;
	}
	
	/* Constructor 2nd : with argument of color and filled */
	public Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	/* Accessor for color field */
	public String getColor()
	{
		return this.color;
	}
	
	/* Mutator for color field */
	public void setColor(String color)
	{
		this.color = color;
	}
	
	/* Accessor for filled field */
	public boolean isFilled()
	{
		return this.filled;
	}
	
	/* Mutator for filled field */
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public String toString()
	{
		return "A Shape with color of " + getColor() + " and " + isFilled() + " filled";
	}
}
