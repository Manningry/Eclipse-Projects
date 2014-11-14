import java.util.Scanner;

public class Program
	{

static long cardNumber = 0;
static long[] creditCard;
static long number;
static long doubleNum;


	public static void main(String[] args)
		{
		intro();
		doubleNumbers();
		addDoublesTogether();
		checkValidity();
		}
	
	
	public static void intro()
		{
		System.out.println("Welcome to the credit card validator! Please enter your 16 digit credit card number.");
		
		Scanner userInput = new Scanner(System.in);
		cardNumber = userInput.nextLong();
		
		creditCard = new long[16];

		for(int i = 15; i >-1; i--)
			{
			creditCard[i] = cardNumber%10;
			cardNumber = cardNumber/10;
			}
	
		}
		
	public static void doubleNumbers()
		{
		
		
		for(int i = 0; i <creditCard.length; i=i+2)
			{
			number= creditCard[i];
			doubleNum= number *2;
			creditCard[i]= doubleNum;
			
			}
		
//		for(int i = 0; i < 16; i++)
//			{
//		System.out.println(creditCard[i]);
//		System.out.println(" ");
//			}
		
		}
	
	public static void addDoublesTogether()
		{
		long firstNum =0;
		long secondNum;
		long cardNumber;
		long sum= 0;
		
		for(int i = 0; i < 16; i=i+2)
			{
			if(creditCard[i] >= 10 )
				{
				cardNumber = creditCard[i];
				
				for(int z = 0; z<2; z++)
				firstNum = cardNumber%10;
				cardNumber= cardNumber/10;
				sum = cardNumber + firstNum;
				creditCard[i]= sum;
				
				}
			}
		
//		for(int i = 0; i < 16; i++)
//			{
//		System.out.println(creditCard[i]);
//			}
		
		}
	
	public static void checkValidity()
		{
		
	long total = 0;
		
		for(int i = 0; i < creditCard.length; i++)
			{
			total = total + creditCard[i];
			}
		
	if(total%10==0)
		{
		System.out.println("\nCongratulations, you have a valid credit card!");
		}
	else 
		{
		System.out.println("\nYour credit card is a fake and not valid.");
		}





		}
	}
	
