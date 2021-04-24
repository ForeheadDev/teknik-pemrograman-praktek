package exercise2;

public class TestCircle 
{
	public static void main(String[] args) 
	{
		Circle circle = new Circle();
		
		System.out.println("Data Circle default : ");
		System.out.println("Radius : " + circle.getRadius());
		System.out.println("Area : " + circle.getArea());
		System.out.println("Perimeter : " + circle.getPerimeter());
		
		circle.setRadius(3);
		
		System.out.println("\nData circle setelah di ubah : ");
		System.out.println("Radius : " + circle.getRadius());
		System.out.println("Area : " + circle.getArea());
		System.out.println("Perimeter : " + circle.getPerimeter());
		
		System.out.println("\nInformasi shape berupa string : ");
		System.out.println(circle.toString());
	}
}
