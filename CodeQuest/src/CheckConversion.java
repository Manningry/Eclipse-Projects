import java.util.*;
import java.io.*;

public class CheckConversion
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner( new File("CheckConversionTextFile.txt"));
		
		String amount = file.nextLine();
		String cents ="";
		String tens = "";
		String hundreds= "";
		String totalDollars = "";
		String answerDollar = " dollars ";
		String sevensPl = "";
		String sixesPl = "";
		String fivesPl = "";
		String foursPl = "";
		String threesPl = "";
		String twosPl = "";
		String onesPl = "";
		
		//if check has decimal and cents
		
		if(amount.contains("."))
			{
			cents = amount.substring(amount.length()-2, amount.length());
			tens = cents.substring(cents.length()-2, cents.length()-1);
			hundreds = cents.substring(cents.length()-1, cents.length());
			totalDollars = amount.substring(0,amount.length()-3);
			
	//Decimal print out 		
			
		switch(tens)
		{
		case "1":
			switch(hundreds)
			{
			case "0":
			case "1":tens = "eleven";
			case "2":tens = "twelve";
			break;
			case "3":tens = "thirteen";
			break;
			case "4":tens = "fourteen";
			break;
			case "5":tens = "fifteen";
			break;
			case "6":tens = "sixteen";
			break;
			case "7":tens = "seventeen";
			break;
			case "8":tens = "eighteen";
			break;
			case "9":tens = "nineteen";
			break;
			}
			break;
			
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
		case "1":hundreds = "one";
		case "2":hundreds = "two";
		break;
		case "3":hundreds = "three";
		break;
		case "4":hundreds = "four";
		break;
		case "5": hundreds= "five";
		break;
		case "6":hundreds = "six";
		break;
		case "7":hundreds = "seven";
		break;
		case "8":hundreds = "eight";
		break;
		case "9":hundreds = "nine";
		break;
		
		}
		
		//Before Decimal 
		
		switch(totalDollars.length())
		{
		case 1:
		
			switch(totalDollars)
			{
			case "0":totalDollars = "zero";
			break;
			case "1":totalDollars = "one";
			answerDollar = " dollar ";
			break;
			case "2":totalDollars  = "two";
			break;
			case "3":totalDollars  = "three";
			break;
			case "4":totalDollars  = "four";
			break;
			case "5": totalDollars = "five";
			break;
			case "6":totalDollars = "six";
			break;
			case "7":totalDollars  = "seven";
			break;
			case "8":totalDollars  = "eight";
			break;
			case "9":totalDollars = "nine";
			break;
			}
			
			System.out.println(totalDollars + answerDollar + " and " + tens+" "+ hundreds + " cents");	
		break;
		
		case 2:
		
		twosPl = amount.substring(0,1);
		onesPl = amount.substring(1,2);
		
		switch(twosPl)
		{
		case "1":
			switch(onesPl)
			{
			case "0":
			case "1":onesPl = "eleven";
			case "2":onesPl = "twelve";
			break;
			case "3":onesPl = "thirteen";
			break;
			case "4":onesPl = "fourteen";
			break;
			case "5":onesPl = "fifteen";
			break;
			case "6":onesPl = "sixteen";
			break;
			case "7":onesPl = "seventeen";
			break;
			case "8":onesPl = "eighteen";
			break;
			case "9":onesPl = "nineteen";
			break;
			}
			break;
			
		case "2":twosPl = "twenty";
		break;
		case "3":twosPl = "thirty";
		break;
		case "4":twosPl = "forty";
		break;
		case "5":twosPl = "fifty";
		break;
		case "6":twosPl = "sixty";
		break;
		case "7":twosPl = "seventy";
		break;
		case "8":twosPl = "eighty";
		break;
		case "9":twosPl = "ninety";
		break;
		
		}
		
		switch(onesPl)
		{
		case "1":onesPl = "one";
		break; 
		case "2":onesPl = "two";
		break;
		case "3":onesPl= "three";
		break;
		case "4":onesPl = "four";
		break;
		case "5": onesPl= "five";
		break;
		case "6":onesPl = "six";
		break;
		case "7":onesPl = "seven";
		break;
		case "8":onesPl = "eight";
		break;
		case "9":onesPl = "nine";
		break;
		
		}
		System.out.println(twosPl +" " + onesPl + answerDollar + "and " + tens+" "+ hundreds + " cents");	
		
		break;
		
		
		case 3: 
		
		threesPl = amount.substring(0,1);
		twosPl = amount.substring(1,2);
		onesPl = amount.substring(2,3);
		
		switch(threesPl)
		{
		case "1":threesPl = "one";
		break; 
		case "2":threesPl = "two";
		break;
		case "3":threesPl= "three";
		break;
		case "4":threesPl = "four";
		break;
		case "5": threesPl= "five";
		break;
		case "6":threesPl = "six";
		break;
		case "7":threesPl = "seven";
		break;
		case "8":threesPl = "eight";
		break;
		case "9":threesPl = "nine";
		break;
		
		}
		
		switch(twosPl)
		{
		case "1":
			switch(onesPl)
			{
			case "0":
			case "1":onesPl = "eleven";
			case "2":onesPl = "twelve";
			break;
			case "3":onesPl = "thirteen";
			break;
			case "4":onesPl = "fourteen";
			break;
			case "5":onesPl = "fifteen";
			break;
			case "6":onesPl = "sixteen";
			break;
			case "7":onesPl = "seventeen";
			break;
			case "8":onesPl = "eighteen";
			break;
			case "9":onesPl = "nineteen";
			break;
			}
			break;
			
		case "2":twosPl = "twenty";
		break;
		case "3":twosPl = "thirty";
		break;
		case "4":twosPl = "forty";
		break;
		case "5":twosPl = "fifty";
		break;
		case "6":twosPl = "sixty";
		break;
		case "7":twosPl = "seventy";
		break;
		case "8":twosPl = "eighty";
		break;
		case "9":twosPl = "ninety";
		break;
		
		}
		
		switch(onesPl)
		{
		case "1":onesPl = "one";
		break; 
		case "2":onesPl = "two";
		break;
		case "3":onesPl= "three";
		break;
		case "4":onesPl = "four";
		break;
		case "5": onesPl= "five";
		break;
		case "6":onesPl = "six";
		break;
		case "7":onesPl = "seven";
		break;
		case "8":onesPl = "eight";
		break;
		case "9":onesPl = "nine";
		break;
		
		}
		
		System.out.println(threesPl + " hundred " + twosPl +" " + onesPl + answerDollar + "and " + tens+" "+ hundreds + " cents");	
		
		break;
		
		case 4:
		
		foursPl = amount.substring(0,1);
		threesPl = amount.substring(1,2);
		twosPl = amount.substring(2,3);
		onesPl = amount.substring(3,4);
		
		switch(foursPl)
		{
		case "1":foursPl = "one";
		break; 
		case "2":foursPl = "two";
		break;
		case "3":foursPl= "three";
		break;
		case "4":foursPl = "four";
		break;
		case "5": foursPl= "five";
		break;
		case "6":foursPl = "six";
		break;
		case "7":foursPl = "seven";
		break;
		case "8":foursPl = "eight";
		break;
		case "9":foursPl = "nine";
		break;
		
		}
		
		switch(threesPl)
		{
		case "1":threesPl = "one";
		break; 
		case "2":threesPl = "two";
		break;
		case "3":threesPl= "three";
		break;
		case "4":threesPl = "four";
		break;
		case "5": threesPl= "five";
		break;
		case "6":threesPl = "six";
		break;
		case "7":threesPl = "seven";
		break;
		case "8":threesPl= "eight";
		break;
		case "9":threesPl = "nine";
		break;
		
		}
		
		switch(twosPl)
		{
		case "1":
			switch(onesPl)
			{
			case "0":
			case "1":onesPl = "eleven";
			case "2":onesPl = "twelve";
			break;
			case "3":onesPl = "thirteen";
			break;
			case "4":onesPl = "fourteen";
			break;
			case "5":onesPl = "fifteen";
			break;
			case "6":onesPl = "sixteen";
			break;
			case "7":onesPl = "seventeen";
			break;
			case "8":onesPl = "eighteen";
			break;
			case "9":onesPl = "nineteen";
			break;
			}
			break;
			
		case "2":twosPl = "twenty";
		break;
		case "3":twosPl = "thirty";
		break;
		case "4":twosPl = "forty";
		break;
		case "5":twosPl = "fifty";
		break;
		case "6":twosPl = "sixty";
		break;
		case "7":twosPl = "seventy";
		break;
		case "8":twosPl = "eighty";
		break;
		case "9":twosPl = "ninety";
		break;
		
		}
		
		switch(onesPl)
		{
		case "1":onesPl = "one";
		break; 
		case "2":onesPl = "two";
		break;
		case "3":onesPl= "three";
		break;
		case "4":onesPl = "four";
		break;
		case "5": onesPl= "five";
		break;
		case "6":onesPl = "six";
		break;
		case "7":onesPl = "seven";
		break;
		case "8":onesPl = "eight";
		break;
		case "9":onesPl = "nine";
		break;
		
		}
		break;
		case 5: 
		break;
		case 6:
		break;
		case 7:
		break;
		
		}
		
		

			}
		
		}
	
	

	}
