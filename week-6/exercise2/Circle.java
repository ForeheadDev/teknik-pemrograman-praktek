package exercise2;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle()
	{
		super();
		this.radius = 1.0;
	}
	
	public Circle(double radius)
	{
		super();
		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, double radius)
	{
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea() {
		 return this.radius * this.radius * Math.PI;
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public String toString()
	{
		return "A Circle with radius=" + this.radius + ", which is a subclass of " + super.toString();
	}
	
}
