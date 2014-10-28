import java.util.Scanner;

public class Program
	{

static long cardNumber = 0;
static long[] creditCard;


	public static void main(String[] args)
		{
		intro();
		validatorProgram();
		}
	
	
	public static void intro()
		{
		System.out.println("Welcome to the credit card validator! Please enter your 16 digit credit card number, without any spaces or hyphens.");
		
		Scanner userInput = new Scanner(System.in);
		cardNumber = userInput.nextLong();
		
		long[] creditCard = new long[16];

		for(int i = 0; i < 16; i++)
			{
			creditCard[i] = cardNumber%10;
			cardNumber = cardNumber/10;
			}
		
		}
	
	public static void validatorProgram()
		{
		
		
		
		for(int i = 0; i <6; i++)
			{
			creditCard[i] = creditCard[i]*2;
			i = i +2;
			}
		
		for(int i = 0; i < 16; i++)
			{
		System.out.println(creditCard[i]);
			}
		
		}

	}
