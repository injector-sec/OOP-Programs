import java.util.Scanner;
public class Zakat{
	public static void main(String [] args)
	{
		double zakat =0.0025;
		Scanner in = new Scanner(System.in);
		int amount;
		System.out.print("Enter the amount : ");
		amount = in.nextInt();
		double Zakat = amount*zakat;
		System.out.println("\nHere is amount of Zakat : "+Zakat);

	}
}