import java.util.Scanner;


public class SwitchChallenge
	{

	public static void main(String[] args)
		{
		PoloOfTheDay();
		number90();
		UserRandom();

		}

	
	
	public static void PoloOfTheDay()
	
		{
		
		String[] randomPolo = {"navy blue", "light blue", "yellow", "white", "grey"};
		int randomPoloColor = (int)(Math.random()*5);
		
		switch(randomPolo[randomPoloColor])
		{
		case "navy blue":
		case "light blue":
			{
			System.out.println("Wow, you got " + randomPolo[randomPoloColor] + ". That shade of blue always look good at school!");
			break;
			}
		case "yellow":
		case "white":
		case "grey":
			{
			
			System.out.println("Wow, you got " + randomPolo[randomPoloColor] + ". That's a spectacular color to wear!");
			break;
			}
		
		}
		
		
		}
	
	public static void number90()
		{
		
		boolean small = true;
		
		int counter = 0;
		
		
		while(small)
			{
			int random = (int)(Math.random()*100+1);
				{
				if(random < 90)
					{
					counter++;
					}
				if(random>=90)
					{
				small = false;
					{
					if(counter<2)
						{
						System.out.println("");
						System.out.println("It took you one try to generate a number ninety or above!");
						System.out.println("");
						}
					else
						{		
				
				System.out.println("");
				System.out.println("It took you " + counter + " tries to generate a number ninety or above!");
				System.out.println("");
						}
					}
					}
			}
			}
		}
		
	
	public static void UserRandom()
		{
		
		boolean keepGoing = true;
		System.out.println("I am going to generate a random number!");
		
		while (keepGoing)
			{
			
			System.out.println("");
			int random = (int)(Math.random()*1000 +1);
			System.out.println("Your random number is " + random + ", would you like to continue playing?");
			System.out.println("");
			Scanner keyboard = new Scanner(System.in);
			String userInput = keyboard.nextLine();
			
			switch(userInput)
			{
			case "yes":
			case "Yes":
				{
				System.out.println("");
				System.out.println("Great!");
				break;
				}
			case "no":
			case "No":
				{
				System.out.println("");
				System.out.println("Not a problem, Goodbye!");
				
				System.exit(0);
				
				}
			}
				{
				
				}
		
			}
		}
	}


	
	
