package exercise2;

public class TestSquare 
{
	public static void main(String[] args)
	{
		Square square = new Square();
		
		System.out.println("Data Rectangle default : ");
		System.out.println("Width : " + square.getWidth());
		System.out.println("Length : " + square.getLength());
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter : " + square.getPerimeter());
		
		square.setSide(4.0);
		
		System.out.println("\nData Rectangle setelah di ubah : ");
		System.out.println("Width : " + square.getWidth());
		System.out.println("Length : " + square.getLength());
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter : " + square.getPerimeter());
		
		System.out.println("\nInformasi shape berupa string : ");
		System.out.println(square.toString());
	}
}
