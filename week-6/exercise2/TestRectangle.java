package exercise2;

public class TestRectangle 
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		
		System.out.println("Data Rectangle default : ");
		System.out.println("Width : " + rect.getWidth());
		System.out.println("Length : " + rect.getLength());
		System.out.println("Area: " + rect.getArea());
		System.out.println("Perimeter : " + rect.getPerimeter());
		
		rect.setWidth(4);
		rect.setLength(2);
		
		System.out.println("\nData Rectangle setelah di ubah : ");
		System.out.println("Width : " + rect.getWidth());
		System.out.println("Length : " + rect.getLength());
		System.out.println("Area: " + rect.getArea());
		System.out.println("Perimeter : " + rect.getPerimeter());
		
		System.out.println("\nInformasi shape berupa string : ");
		System.out.println(rect.toString());
	}
}
