/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
   {
   	Scanner sc=new Scanner(System.in);
   	System.out.println("enter a  year");
   	int year=sc.nextInt();
   	{
   		if((year%4==0)&&(year%100!=0)||(year%400==0))
   		{
   		System.out.println("is a leap year");
   	}
   	else
   	{
   		System.out.println("is not a leap year");
   	}
   }
}
}
