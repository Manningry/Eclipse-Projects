import java.awt.*;

import javax.swing.*;
 
public class MakeXs extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        MakeXs canvas = new MakeXs();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
	        
	        
    		}
    	
    	public void paint(Graphics graphics) 
    	{
    	
    	//draw X's
    	graphics.setColor(Color.black);
    	graphics.drawLine(0,0, 1000,1000);
    	
    	graphics.setColor(Color.black);
    	graphics.drawLine(1000,0,0,1000);
    	
    	//square
    	graphics.setColor(Color.green);
    	graphics.fillRect (10,10, 810, 100); 
    	
    	//red outlined square
    	graphics.setColor(Color.red);
    	graphics.draw3DRect(400, 400, 250, 250, false);
    	
    	//blue and yellow square
    	graphics.setColor(Color.blue);
    	graphics.draw3DRect(800,800, 125, 125, true);
    	graphics.setColor(Color.yellow);
    	graphics.fillRect(801,801,124,124);
    	
    	//happy face
    	
    	graphics.setColor(Color.PINK);
    	graphics.drawOval(100, 100, 500, 500);
    	graphics.fillOval(100, 100, 500, 500);
    	
    	graphics.setColor(Color.orange);
    	graphics.fillRect(140, 250, 100, 50);
    	graphics.fillRect(420, 250, 100, 50);
    	
    	graphics.setColor(Color.black);
    	graphics.fillOval(250,450, 200, 50);
    	
    	
	}
	}
 