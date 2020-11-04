/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ar[] = new int[n];
		for(int i =0;i<n;i++)
		{
		    ar[i]=in.nextInt();
		}
		int k=0;
		int temp;
		for(int j =0;j<n;j++)
		{
		    if(ar[j]<0)
		    {
		        if(j !=k)
		        {
		            temp=ar[j];
		            ar[j]=ar[k];
		            ar[k]=temp;
		        }
		        k++;
		    }
		}
		for(int t = 0;t<n;t++)
		System.out.print(ar[t]+" ");
	}
}