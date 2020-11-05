/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t =in.nextInt();
		for(int i =0;i<t;i++)
		{
		   int n =in.nextInt();
		   int m =in.nextInt();
		   int ar1[] = new int[n];
		   int ar2[] = new int[m];
		   for(int j =0;j<n;j++)
		   ar1[j] = in.nextInt();
		   for(int k=0;k<m;k++)
		   ar2[k]=in.nextInt();
		   HashSet<Integer> res = new HashSet<Integer>();
		   for(int r=0;r<n;r++)
		   {
		       res.add(ar1[r]);
		   }
		   for(int s=0;s<m;s++)
		   {
		      res.add(ar2[s]);
		       
		   }
		   System.out.println(res.size());
		       
		}
	}
}