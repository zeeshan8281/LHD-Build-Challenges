/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String x="";
		
		int a  = 0;
		for(int  i= 0;i<s.length();i++)
		{
		    char ch = s.charAt(i);
		    
		    a=(ch+13);
		    if((a>90) && (ch >='A' && ch <='Z') || a>122 && (ch>'a' && ch<='z'))
		    {
		        a=a-26;
		    }
		    ch=(char)a;
		    
		    x=x+ch;
		    
		}

        System.out.println(x);
		
		
	}
}
