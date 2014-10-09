
public class RandomProject
	{

	public static void main(String[] args)
		{
		twoDies();
		coinFlip();
		poloColor();
		}
	
	public static void twoDies()
		{
		int die1 = (int) (Math.random()*6)+1;
		int die2 = (int) (Math.random()*6)+1;
		
		System.out.println("The total of the two dice = " + (die1 + die2));
		System.out.println("");
		}

	public static void coinFlip()
		{
	int totalHead = 0;
	int totalTails = 0;
	
	
		for(int i = 0; i <1000; i++)
			{
		int roll = (int) (Math.random()*2)+1;
			if(roll == 1)
				{
				totalHead = totalHead + 1;
				}
			if(roll == 2)
				{
				totalTails = totalTails + 1;
				}
			}
			System.out.println("The total amount of tails rolled = " + totalTails + ". The total amount of heads rolled = " + totalHead + ".");
				
			
		
		}
	
	public static void poloColor()
		{
		
		String[] randomPolo = {"navy blue", "light blue", "yellow", "white", "grey"};
		int randomPoloColor = (int)(Math.random()*5);
		
		System.out.println("");
		System.out.println("The color of polo you are wearing today is " + randomPolo[randomPoloColor] + "!");
		
		
		}
	
	
	
	}
