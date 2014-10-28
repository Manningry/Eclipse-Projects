import java.util.Scanner;


public class PracticeStripping
	{
	
	public static void main(String[] args)
		{
		practice1();
		practice2();
		practice3();
		practice4();
		practice5();
		}

public static void practice1()
	{
	int[] Array= new int[7];
	int number = 7654321;
	
	for(int i = 0; i < 7; i++)
		{
		Array[i] = number%10;
		number = number/10;
		}
	for(int i = 0; i <7; i++)
		{
	System.out.println(Array[i]);
		}
	
	}
	
public static void practice2()
	{
	int number = 12345678;
	int[] Array = new int[8];
	int counter = 0;
	
	for(int i = 0; i <8; i ++)
		{
		Array[i] = number%10;
		number = number/10;
		counter++;
		}
	
	System.out.println("\nThe number of digits is " + counter + ".");
		
	}

public static void practice3()
	{
	int number = 12345678;
	int[] Array = new int[8];
	int countOdd = 0;
	
	
	for(int i = 0; i <8; i ++)
		{
		Array[i] = number%10;
		number = number/10;
		if(Array[i]%2==1)
			{
			countOdd++;
			}
		
		}
	
	System.out.println("\nThe number of odd digits is " + countOdd + ".");
	}

public static void practice4()
	{
	int number = 12345678;
	int[] Array = new int[8];
	int total = 0;
	
	
	for(int i = 0; i <8; i ++)
		{
		Array[i] = number%10;
		total = total + Array[i];
		number = number/10;
		
		
		}
	
	
	System.out.println("\nThe total of the digits is " + total + ".");
	
	
	}

public static void practice5()
	{
	Scanner userInput = new Scanner(System.in);
	
	System.out.println("\nPlease enter a number to round to the nearest 10");
	
	int answer = userInput.nextInt();
	
	if(answer%10 >=5)
		{
		answer = answer/10;
		answer = answer +1;
		answer = answer*10;
		}
	if(answer%10<5)
		{
		answer = answer/10;
		answer = answer*10;
		}
	
	System.out.println("\nYou're rounded number is: " + "\n\t" + answer);
	}













	}
