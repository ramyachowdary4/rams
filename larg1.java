/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=c>(a>b?a:b)?c:((a>b)?a:b);
		System.out.println("largest number:+d");
	}
		
}
