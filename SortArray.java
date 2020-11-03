import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		
	//	int p=0;
		for(int i=0;i<t;i++)
		{
		    int n =in.nextInt();
		    
		    int ar[] = new int[n];
		    int a=0;
		    int b=0;
		    int c=0;
		    for(int j =0;j<n;j++)
		    {
		        ar[j]=in.nextInt();
		    }
		    for(int k=0;k<n;k++)
		    {
		        if(ar[k]==0)
		        a++;
		        else if(ar[k]==1)
		        b++;
		        else
		        c++;
		    }
		    for(int p=0;p<a;p++)
		    ar[p]=0;
		    for(int p =a;p<(a+b);p++)
		    ar[p]=1;
		    for(int p=(a+b);p<n;p++)
		    ar[p]=2;
		    for(int r=0;r<n;r++)
		    System.out.print(ar[r]+" ");
		    System.out.println();
		    
		    
		}
	}
}