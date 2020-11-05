/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i =0;i<t;i++)
		{
		    int n =in.nextInt();
		    int ar[] = new int[n];
		   
		    for(int j =0;j<n;j++)
		    ar[j]=in.nextInt();
		     if(n==1)
		    {
		        System.out.print(ar[0]);
		        System.out.println();
		        continue;
		    }
		    int temp=ar[n-1];
		    for(int p =n-1;p>0;p--)
		    {
		        ar[p]=ar[p-1];
		    }
		    ar[0]=temp;
		    for(int k =0;k<n;k++)
		    System.out.print(ar[k]+" ");
		    System.out.println();
		}
	}
}