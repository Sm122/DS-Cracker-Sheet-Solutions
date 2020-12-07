/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean BinarySearch(int arr[],int x)
    {
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        boolean res = false;
        while(l<=r)
        {
            int m = l+(r-l)/2;
            if(x==arr[m])
            {
                res=true;
                break;
            }
            else if(x<arr[m])
            r=m-1;
            else if(x>arr[m])
            l=m+1;
            
        }
        return res;
    }
    
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i =0;i<t;i++)
		{
		    int flag=0;
		    int n1 = in.nextInt();
		    int n2 = in.nextInt();
		    int ar1[]=new int[n1];
		    int ar2[]=new int[n2];
		    for(int j=0;j<n1;j++)
		    ar1[j]=in.nextInt();
		    for(int k =0;k<n2;k++)
		    ar2[k]=in.nextInt();
		    for(int a=0;a<n2;a++)
		    {
		       if(BinarySearch(ar1,ar2[a])) 
		       {
		           flag=0;
		           continue;
		       }
		       else{
		           flag=1;
		           break;
		       }
		       
		    }
		    if(flag==0)
		    System.out.print("Yes");
		    else
		    System.out.print("No");
		    System.out.println();
		}
	}
}