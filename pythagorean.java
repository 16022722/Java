/**
Module Name: Developing Software
Student Name: Christopher Coupar
Date: 10/11/2020
File Name: pythagorean 
Version: 1.0
*/
package pythagorean;

import java.text.DecimalFormat;
import java.util.Scanner;


public class pythagorean 
{	
	static Scanner scanner = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("###.00");

	
		public static void main(String[] args)
	    {
	
	    	String choice = "";
	    	System.out.println("would you like to find side a, b or c?");
	    	choice = scanner.next();
	    	
	    	if (choice.equals("a"))
	    	{
	    		a();
	    	}
	    		else if(choice.equals("b"))
	    		{	
		    		b();	
		    	}
		    	
		    	else if(choice.equals("c"))
		    	{
		    		c();		
		    	}   
		    	else
		    	{
		    		System.out.println("ERROR");
		    	}
		}

	    	public static double a()
	    {
	    	
	    	double b = 0.00;
	    	double c = 0.00;
	 
	        System.out.println("Please enter Side b");
	        b = scanner.nextDouble();
	        double b2 = Math.pow(b, 2);
	        
	        System.out.println("Please enter Side c");
	        c = scanner.nextDouble();
	        double c2 = Math.pow(c, 2);
	        
	        double a2 = c2 - b2;
	        System.out.println(" b2 = " +b2+ " c2 = " +c2);
	        
	        double a = Math.sqrt(a2);
	        System.out.println("Side a = "+a+" Side b = "+b+" c is = "+c);
	        
	        return(a);
	        
	    }
	    
	    public static double  b() 
	    {
	    	double a = 0.00;
	    	double c = 0.00;
	 
	        System.out.println("Please enter Side a");
	        a = scanner.nextDouble();
	        double a2 = Math.pow(a, 2);
	        
	        System.out.println("Please enter Side c");
	        c = scanner.nextDouble();
	        double c2 = Math.pow(c, 2);
	        
	        double b2 = c2 - a2;
	        System.out.println(" b2 = " +b2+ " c2 = " +c2);
	        
	        double b = Math.sqrt(b2);
	        System.out.println("Side a = "+a+" Side b = "+b+" c is = "+c);
	        return(b);
	    }
	    
	    public static double c() 
	    {
	    	double a = 0.00;
	    	double b = 0.00;
	 
	        System.out.println("Please enter Side a");
	        a = scanner.nextDouble();
	        double a2 = Math.pow(a, 2);
	        
	        System.out.println("Please enter Side c");
	        b = scanner.nextDouble();
	        double b2 = Math.pow(b, 2);
	        
	        double c2 = a2 + b2;
	        System.out.println(" b2 = " +b2+ " c2 = " +a2);
	        
	        double c = Math.sqrt(c2);
	        System.out.println("Side a = "+a+" Side b = "+b+" c is = "+c);
	        return(c);	
	    }
}    	
	       



