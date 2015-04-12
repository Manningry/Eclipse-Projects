import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class BookWorm {

	public static void main(String[] args) throws IOException 
	{
	Scanner file = new Scanner( new File("BookWorm.txt"));
	
	while(file.hasNext())
	{
		String bookNumber = file.nextLine();
		int x = 0;
		if(bookNumber.contains("-"))
		{
			bookNumber = bookNumber.replaceAll("-","");
		}
		
		int[] myArray = new int[13];
		int counter = 0; 
		
		for(int i = 0; i < bookNumber.length(); i++)
		{
			String temp = bookNumber.substring(i, i+1);
			int temp2 = Integer.parseInt(temp);
			myArray[counter] = temp2;
			counter++;
		}
		
		int total = 0; 
		
		for(int i = 0; i < myArray.length; i++)
		{
			if(i%2==0|| i ==0)
			{
				total+= myArray[i]*1;
			}
			else
				total+=myArray[i]*3;
		}
		
//		System.out.print(total+ " ");
		if(total%10==0)
		{
			System.out.println("VALID");
		}
		else
		{
			int lastDigit = total%10;
			int neededNumber = 10-lastDigit;
			System.out.println(myArray[myArray.length-1]+neededNumber);
		}
		
		}
			
		
	}
		

	



static String validator()
{
	String answer = "";
	return answer;
	
}


}