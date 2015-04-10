import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class PigLatin
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner( new File("pigLatin.txt"));
		while(file.hasNext())
			{
			String myLine = file.nextLine();
			String[] myArray = myLine.split(" ");
			
			for(int i = 0; i < myArray.length; i++)
				{
				String myWord = myArray[i];
				String one = myWord.substring(0,1);
				String beginning = "";
				if(one.equals("a") || one.equals("e") || one.equals("i")||one.equals("o")||one.equals("u"))
					{
					myArray[i] = myWord + "yay";
					}
				else
				{
				for(int j = 0; j < myWord.length()-1; j++)
					{
					if(myWord.substring(j,j+1).equals("a")||myWord.substring(j,j+1).equals("e")||myWord.substring(j,j+1).equals("i")||myWord.substring(j,j+1).equals("o")||(myWord.substring(j,j+1).equals("u") && !myWord.substring(j-1,j).equals("q")))
					{
					break;
					}
					else 
						beginning += myWord.substring(j,j+1);
					myArray[i] = myWord.substring(j+1) + beginning + "ay";
					}
				
					
				}
				}
			
			
			for(int i = 0; i < myArray.length; i++)
				{
				System.out.print(myArray[i] + " ");
				}
			System.out.println("");
			
			}

		}

	}
