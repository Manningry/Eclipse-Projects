
public class PracticeArrays
	{

	public static void main(String[] args)
		{
		
		int total = 0;
		int totalLetters = 0;
		String [] RandomThings = {"dog", "cat", "mouse", "hornet", "beetle"};
		
		for (String assd : RandomThings)
			{
			System.out.println(assd);
			}
		
		System.out.println("");
		
		for(String Animals : RandomThings)
			{
			System.out.print(Animals + " ");
			}
		
		System.out.println("");
		System.out.println("");
		
		
		
		int[] newNumbers = {35, 64, 3, 888, 99};
		
		for(int i : newNumbers)
			
			{
			if(i%2==0)
			System.out.println(i);
			}
		
		System.out.println("");
		
		
		
		
		for(int sum : newNumbers)
			
			{	
		     total = total + sum;
			}
		
		      System.out.println("The total is " + total);
			
		
		
		
		System.out.println("");
		  	
		
		for(String printE : RandomThings)
			
			{
			
			if(printE.contains("e"))
				
				{
				
				for(int z=0; z < printE.length(); z++)
					
					if(printE.charAt(z)==('e'))
					totalLetters++;
				}
			}
			System.out.println(totalLetters);
			
		
		
		
		
		
			}
		
		}

	
