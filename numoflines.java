
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0,i;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='.')
			{
				count++;
			}
		} 
		count=count+1;
		System.out.println(count);
	}
}
