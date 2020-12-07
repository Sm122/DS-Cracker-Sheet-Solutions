
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
	     int m =in.nextInt();
	     Arrays.sort(ar);
	     int min = Integer.MAX_VALUE;
	     for(int k=0;k<=n-m;k++)
	     {
	         int r = k+m-1;
	         if(ar[r]-ar[k]<min)
	         min = ar[r]-ar[k];
	     }
	     System.out.print(min);
	     System.out.println();
	 }
	}
}