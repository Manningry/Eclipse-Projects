import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program
	{

	public static void main(String[] args)
		{
		
		Welcome();

		}

	public static void Welcome()
	
		{
		Scanner userInput = new Scanner(System.in);
		int num1 = userInput.nextInt();
		ArrayList <Integer> numberLine = new ArrayList<Integer>();
		
		System.out.println("Welcome to the binary sorter.\n");
		System.out.println("First we need to make a list of numbers! Input as many numbers (1-20) as you would like, one at a time, pressing "
				+ "\nenter after each number. Please enter '-1' when you're finished!\n");
		
		while(num1 != -1)
			{
			if(num1 > -1)
				{
				numberLine.add(userInput.nextInt());
				Collections.sort(numberLine);
				}
			if(num1 < -1)
				{
				System.out.println("Sorry, that number does not work! Please try again.");
				}
			
			}
		
		
			for(int i = 0; i < numberLine.size(); i++)
				{
				System.out.println(numberLine.get(i));
				}
			
		
		
		
		
		
		
		}
	
	}
