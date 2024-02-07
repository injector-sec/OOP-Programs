import java.util.Scanner;
public class Quiz
{
	public static void main(String [] args)
	{
		int score=0;
		Scanner choice = new Scanner(System.in);
		char ans;

		System.out.println("\t\t\tQuiz Game\n\n ");
		System.out.println("What is the answer of 4+3 ?");
		System.out.print("A) 4\tB) 7\tC) 12\tD) 10\n>>");
		ans= choice.next().charAt(0);
		if(ans=='B')
		{
			score+=10;
			System.out.println("\t\t\tQuiz Game\n\n ");
			System.out.println("What is the answer of 4+9 ?");
			System.out.print("A) 13\tB) 7\tC) 12\tD) 10\n>>");
			
			ans= choice.next().charAt(0);
			
				if(ans=='A')
				{
					score+=10;
					System.out.println("\t\t\tQuiz Game\n\n ");
					System.out.println("What is the answer of 8+3 ?");
					System.out.print("A) 4\tB) 11\tC) 16\tD) 10\n>>");
						
						ans= choice.next().charAt(0);
						
							if(ans=='B')
							{
								score+=10;
										System.out.println("\t\t\tQuiz Game\n\n ");
										System.out.println("What is the answer of 4-3 ?");
										System.out.print("A) 4\tB) 7\tC) 12\tD) 1\n>>");
										
										ans = choice.next().charAt(0);
										
										if(ans=='D')
										
										{
											score+=10;
													System.out.println("\t\t\tQuiz Game\n\n ");
													System.out.println("What is the answer of 13+3 ?");
													System.out.print("A) 15\tB) 7\tC) 12\tD) 10\n>>");
												
													ans= choice.next().charAt(0);
												
														if(ans=='A')
														{
															score+=10;
															System.out.println("\t\t\tQuiz Game\n\n ");
															System.out.println("What is the answer of 15-3 ?");
															System.out.print("A) 4\tB) 7\tC) 12\tD) 10\n>>");
																
																ans= choice.next().charAt(0);
																
																if(ans=='C')
																
																{
																	score+=10;

																}
																else
																{
																	System.out.println("\nWrong Answer! You lose");
																}

														}
														
														else
														
														{
															System.out.println("\nWrong Answer! You lose");
														}

										}
										
										else
										
										{
											System.out.println("\nWrong Answer! You lose");
										}

							}
							else
							{
								System.out.println("\nWrong Answer! You lose");
							}

				}
				else
				{
					System.out.println("\nWrong Answer! You lose");
				}

		}
		else
		{
			System.out.println("\nWrong Answer! You lose");
		}
		System.out.println("\nGame Over!\n \t\t\tYour Score :  "+score);

	}

}