
public class exerciseOne
	{

	public static void main(String[] args)
		{


		String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
			
		String noSpaces = (alphabet.replaceAll(" ",""));
		int total = 0;
			{
			System.out.println(noSpaces);
			
			for(int x=0 ; x<noSpaces.length(); x++)
		
				if (x%2==0)
				
					System.out.print(noSpaces.charAt(x)+" ");
					System.out.println(" ");
			
			for(int x=0 ; x<noSpaces.length(); x++)
				
				if(x%2==1)
					
					System.out.print(noSpaces.charAt(x));
					System.out.println(" ");
					
			for(int x=0 ; x<noSpaces.length(); x++)
				
				System.out.println(noSpaces.charAt(x));
				System.out.println(" ");
		
			System.out.println("The number of characters is " + alphabet.length());
			
			for(int h=0; h<alphabet.length(); h++)
			
				if(alphabet.substring(h,h+1).equals(" "))
					
					total++;
						
						
			System.out.println("The number of spaces is " + total);
		}

	}
	}
