package exercise2;

public class TestShape 
{
	public static void main(String[] args)
	{
		Shape shape = new Shape();
		
		System.out.println("Data shape default : ");
		System.out.println("Warna : " + shape.getColor());
		System.out.println("Apakah terisi ? " + shape.isFilled());
		
		shape.setColor("Green");
		shape.setFilled(false);
		
		System.out.println("\nData shape setelah di ubah : ");
		System.out.println("Warna : " + shape.getColor());
		System.out.println("Apakah terisi ? " + shape.isFilled());
		
		System.out.println("\nInformasi shape berupa string : ");
		System.out.println(shape.toString());
	}
}
