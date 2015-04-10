import java.util.*;
import java.io.*;

public class CheckConversion
	{

	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner( new File("CheckConversionTextFile.txt"));
		while(file.hasNext())
			{
		String amount = file.nextLine();
		String cents ="";
		String tens = "";
		String hundreds= "";
		String totalDollars = "";
		String answerDollar = " dollars ";
		String answerCents = " cents ";
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
		case "0": tens = "zero";
		break;
		case "1":
			switch(hundreds)
			{
			case "1":tens = "eleven";
			break;
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
		case "0": hundreds = "zero";
		break;
		case "1":hundreds = "one";
		break;
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
		String decimal ="";
		
		if(hundreds.equals("zero"))
				{
				decimal = tens;
				}
		else if(hundreds.equals("zero") && tens.equals("zero"))
			{
			decimal = "zero";
			}
		else if(tens.equals("zero") && !hundreds.equals("0"))
			{
			decimal = hundreds;
			if(hundreds.equals("one"))
				{
				answerCents = " cent ";
				}
			}
		else
		decimal = tens + " " + hundreds;
		
		
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
			
			System.out.println(totalDollars + answerDollar + "and " + decimal + answerCents);	
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
		case "0":onesPl = "zero";
		break;
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
		
		
		System.out.println(twosPl +" " + onesPl + answerDollar + "and " +decimal + answerCents);	
		
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
		if(onesPl.equals("0"))
			{
			System.out.println(threesPl + " hundred " + twosPl + answerDollar + "and "+ decimal + answerCents);
			}
		else
		System.out.println(threesPl + " hundred " + twosPl + " " + onesPl + answerDollar + "and "+ decimal + answerCents);	
		
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
		case "0": 
		break;
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
		System.out.println(threesPl);
		if(threesPl.equals("0"))
			{
			System.out.println(foursPl + " thousand " + twosPl +" " + onesPl + answerDollar + "and " +decimal + answerCents);	
			}
		else
		System.out.println(foursPl + " thousand " + threesPl + " hundred " + twosPl +" " + onesPl + answerDollar + "and " + decimal + answerCents);	
		
		break;
		
		case 5: 
		
		fivesPl = amount.substring(0,1);
		foursPl = amount.substring(1,2);
		threesPl = amount.substring(2,3);
		twosPl = amount.substring(3,4);
		onesPl = amount.substring(4,5);
		
		switch(fivesPl)
		{
		case "1":
			
		switch(foursPl)
		{
		case "0":fivesPl = "ten";
		break;
		case "1":fivesPl = "eleven";
		break;
		case "2":fivesPl = "twelve";
		break;
		case "3":fivesPl= "thirteen";
		break;
		case "4":fivesPl = "fourteen";
		break;
		case "5":fivesPl = "fifteen";
		break;
		case "6":fivesPl = "sixteen";
		break;
		case "7":fivesPl = "seventeen";
		break;
		case "8":fivesPl = "eighteen";
		break;
		case "9":fivesPl = "nineteen";
		break;
		}
		break; 
		
		case "2":fivesPl = "twenty";
		break;
		case "3":fivesPl = "thirty";
		break;
		case "4":fivesPl = "forty";
		break;
		case "5":fivesPl = "fifty";
		break;
		case "6":fivesPl = "sixty";
		break;
		case "7":fivesPl = "seventy";
		break;
		case "8":fivesPl= "eighty";
		break;
		case "9":fivesPl = "ninety";
		break;
		
		}
	
		
		switch(foursPl)
		{
		case "0": 
		break;
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
		case "8":foursPl= "eight";
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
			case "0":twosPl = "ten";
			break;
			case "1":twosPl = "eleven";
			break;
			case "2":twosPl = "twelve";
			break;
			case "3":twosPl = "thirteen";
			break;
			case "4":twosPl = "fourteen";
			break;
			case "5":twosPl = "fifteen";
			break;
			case "6":twosPl = "sixteen";
			break;
			case "7":twosPl = "seventeen";
			break;
			case "8":twosPl = "eighteen";
			break;
			case "9":twosPl = "nineteen";
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
		 
		if(fivesPl.equals("ten")|| fivesPl.equals("eleven")|| fivesPl.equals("twelve")|| fivesPl.equals("thirteen")|| fivesPl.equals("fourteen")|| fivesPl.equals("fifteen")|| fivesPl.equals("sixteen")|| fivesPl.equals("seventeen")|| fivesPl.equals("eighteen")|| fivesPl.equals("nineteen"))
			{
			if(threesPl.equals("0") && !twosPl.equals("0") && !onesPl.equals("0"))
				{
				System.out.println(fivesPl + " " + foursPl + " thousand " + twosPl +" " + onesPl + answerDollar + "and " +decimal + answerCents);	
				}
			else if(threesPl.equals("0") && twosPl.equals("0") && !onesPl.equals("0"))
				{
				System.out.println(fivesPl + " " + foursPl + " thousand " + onesPl + answerDollar + "and " +decimal + answerCents);	
				}
			else if(threesPl.equals("0") && twosPl.equals("0") && onesPl.equals("0"))
				{
				System.out.println(fivesPl + " " + foursPl + " thousand " +  answerDollar + "and " +decimal + answerCents);	
				}
			else if(threesPl.equals("0") && !twosPl.equals("0") && onesPl.equals("0"))
				{
				System.out.println(fivesPl + " " + foursPl + " thousand " +  twosPl + answerDollar + "and " +decimal + answerCents);	
				}
			else if(!threesPl.equals("0") && twosPl.equals("0") && !onesPl.equals("0"))
				{
				System.out.println(fivesPl + " " + foursPl + " thousand " + threesPl + " hundred " + onesPl + answerDollar + "and " +decimal + answerCents);	
				}
			else if(!threesPl.equals("0") && twosPl.equals("0") && onesPl.equals("0"))
				{
				System.out.println(fivesPl + " " + foursPl + " thousand " + threesPl + " hundred " + answerDollar + "and " + decimal + answerCents);	
				}
			
			}
		
		if(!fivesPl.equals("ten")&& !fivesPl.equals("eleven")&& !fivesPl.equals("twelve")&& !fivesPl.equals("thirteen")&& !fivesPl.equals("fourteen")&& !fivesPl.equals("fifteen")&& !fivesPl.equals("sixteen")&& !fivesPl.equals("seventeen")&& !fivesPl.equals("eighteen")&& !fivesPl.equals("nineteen"))
			{
		 if(threesPl.equals("0") && !twosPl.equals("0") && !onesPl.equals("0"))
			{
			if(foursPl.equals("0"))
				{
				System.out.println(fivesPl  + " thousand " + twosPl +" " + onesPl + answerDollar + "and "+ decimal + answerCents);	
				}
			else
			System.out.println(fivesPl + " " + foursPl + " thousand " + twosPl +" " + onesPl + answerDollar + "and " +decimal + answerCents);	
			}
		else if(threesPl.equals("0") && twosPl.equals("0") && !onesPl.equals("0"))
			{
			if(foursPl.equals("0"))
				{
				System.out.println(fivesPl  + " thousand " + onesPl + answerDollar + "and " + decimal + answerCents);	
				}
			else
			System.out.println(fivesPl + " " + foursPl + " thousand " + onesPl + answerDollar + "and " +decimal + answerCents);	
			}
		else if(threesPl.equals("0") && twosPl.equals("0") && onesPl.equals("0"))
			{
			if(foursPl.equals("0"))
				{
				System.out.println(fivesPl  + " thousand " + answerDollar + "and " + decimal + answerCents);	
				}
			else
			System.out.println(fivesPl + " " + foursPl + " thousand " +  answerDollar + "and " + decimal + answerCents);	
			}
		else if(threesPl.equals("0") && !twosPl.equals("0") && onesPl.equals("0"))
			{
			if(foursPl.equals("0"))
				{
				System.out.println(fivesPl  + " thousand " + twosPl + answerDollar + "and " + decimal + answerCents);	
				}
			else
			System.out.println(fivesPl + " " + foursPl + " thousand " +  twosPl + answerDollar + "and " + decimal + answerCents);	
			}
		else if(!threesPl.equals("0") && twosPl.equals("0") && !onesPl.equals("0"))
			{
			if(foursPl.equals("0"))
				{
				System.out.println(fivesPl  + " thousand " + threesPl + " hundred " + onesPl + answerDollar + "and " + decimal + answerCents);	
				}
			else
			System.out.println(fivesPl + " " + foursPl + " thousand " + threesPl + " hundred " + onesPl + answerDollar + "and " + decimal + answerCents);	
			}
		else if(!threesPl.equals("0") && twosPl.equals("0") && onesPl.equals("0"))
			{
			if(foursPl.equals("0"))
				{
				System.out.println(fivesPl  + " thousand " + threesPl + " hundred " + answerDollar + "and " + decimal + answerCents);	
				}
			else
			System.out.println(fivesPl + " " + foursPl + " thousand " + threesPl + " hundred " + answerDollar + "and " + decimal + answerCents);	
			}
		else if(!threesPl.equals("0") && !twosPl.equals("0") && !onesPl.equals("0"))
			{
			if(foursPl.equals("0"))
				{
				System.out.println(fivesPl  + " thousand " + threesPl + " hundred " + twosPl +" " + onesPl + answerDollar + "and " + decimal + answerCents);	
				}
			else
			System.out.println(fivesPl + " " + foursPl + " thousand " + threesPl + " hundred " + twosPl + " " +onesPl + answerDollar + "and " + decimal + answerCents);	
			}
			}
		break;
		
		case 6:
		break;
		case 7:
		break;
		
		}
		
		

			}
		
		}
		}
	
	

	}
