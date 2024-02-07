import java.util.Scanner;
public class Sorting {
	public static void main(String [] args)
	{
		int num [] = new int[5];
		// Scanner input= new Scanner(System.in);
			for(int i=0;i<5;i++)
		{
			System.out.println("\nEnter number of your Choice : ");
			Scanner inp = new Scanner(System.in);
			num[i]= inp.nextInt();
		} 



			for(int i=0;i<4;i++) // 7,2,8,4
		{

			for(int j=0;j<4;j++) 
			{
				if(num[j]>num[j+1] )
			{	
				int temp ;
				temp= num[j+1];
				num [j+1]= num [j];
				num[j]=temp; 
			
			}
		}
	}
		System.out.println(" HERE is the sorted form");
		for(int i=0;i<5;i++)
			System.out.println(" "+num[i]);



		}
	}

