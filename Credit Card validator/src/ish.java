import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class ish extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static JFrame frame = new JFrame();
	static long cardNumber = 0;
	static long[] creditCard;
	static long number;
	static long doubleNum;


			public static void main(String[] args)
				{
				intro();
				
				}
			
			
			public static void intro()
				{
				name = JOptionPane.showInputDialog("What is your credit card number?");  
				
				Scanner userInput = new Scanner(System.in);
				cardNumber = userInput.nextLong();
				
				creditCard = new long[16];

				for(int i = 15; i >-1; i--)
					{
					creditCard[i] = cardNumber%10;
					cardNumber = cardNumber/10;
					}
			
			
				
				
				for(int i = 0; i <creditCard.length; i=i+2)
					{
					number= creditCard[i];
					doubleNum= number *2;
					creditCard[i]= doubleNum;
					
					}
				
//				for(int i = 0; i < 16; i++)
//					{
//				System.out.println(creditCard[i]);
//				System.out.println(" ");
//					}
				
				
			
			
				long firstNum =0;
				long secondNum;
				long cardNumber1;
				long sum= 0;
				
				for(int z = 0; z < 16; z=z+2)
					{
					if(creditCard[z] >= 10 )
						{
						cardNumber1 = creditCard[z];
						
						for(int j = 0; j<2; j++)
						firstNum = cardNumber1%10;
						cardNumber1= cardNumber1/10;
						sum = cardNumber1 + firstNum;
						creditCard[z]= sum;
						
						}
					}
				
//				for(int i = 0; i < 16; i++)
//					{
//				System.out.println(creditCard[i]);
//					}
				
				
			
			
				
			long total = 0;
				
				for(int i = 0; i < creditCard.length; i++)
					{
					total = total + creditCard[i];
					}
				
			if(total%10==0)
				{
				JOptionPane.showMessageDialog(frame, "Congratulations, you have a valid credit card!");
				
				}
			else 
				{
				JOptionPane.showMessageDialog(frame, "Your credit card is a fake and not valid.");
				
				}





				}
			
	    }
	
