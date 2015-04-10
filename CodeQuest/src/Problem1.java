import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Problem1
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner( new File("3x.txt"));
		while(file.hasNext())
			{
			int myInt = file.nextInt();
			String answer = "";
			
			if(myInt%3==0 && myInt%7!=0)
				{
				answer= "CODE";
				System.out.println(answer);
				}
			else if(myInt%3!=0 && myInt%7==0)
			{
			answer= "QUEST";
			System.out.println(answer);
			}
			else if(myInt%3==0 && myInt%7==0)
				{
				answer= "CODEQUEST";
				System.out.println(answer);
				}
			else 
				System.out.println(myInt);
			}

	}
	}
