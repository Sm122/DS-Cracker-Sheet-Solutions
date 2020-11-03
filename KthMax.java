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
		    int n = in.nextInt();
		    int ar[] = new int[n];
		    for(int j = 0;j<n;j++)
		    ar[j]=in.nextInt();
		    int k = in.nextInt();
		    Arrays.sort(ar);
		   System.out.println(ar[k-1]);
		    
		}
		
	}
}