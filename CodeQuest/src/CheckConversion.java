import java.util.*;
import java.io.*;

public class CheckConversion
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner( new File("CheckConversionTextFile.txt"));
		
		String amount = file.nextLine();
		
		if(amount.contains("."))
			{
			String cents = amount.substring(amount.length()-2, amount.length());
			String tens = cents.substring(cents.length()-2, cents.length()-1);
			String hundreds = cents.substring(cents.length()-1, cents.length());
		
		switch(tens)
		{
		case "0":
		case "1":
		case "2":tens = "twenty";
		break;
		case "3":tens = "thirty";
		break;
		case "4":tens = "forty";
		break;
		case "5":tens = "fifty";
		break;
		case "6":tens = "sixty";
		break;
		case "7":tens = "seventy";
		break;
		case "8":tens = "eighty";
		break;
		case "9":tens = "ninety";
		break;
		
		}
		switch(hundreds)
		{
		case "0":
		case "1":tens = "one";
		case "2":tens = "two";
		break;
		case "3":tens = "three";
		break;
		case "4":tens = "four";
		break;
		case "5":tens = "five";
		break;
		case "6":tens = "six";
		break;
		case "7":tens = "seven";
		break;
		case "8":tens = "eight";
		break;
		case "9":tens = "nine";
		break;
		
		}
		
			}
		}
	
	

	}
