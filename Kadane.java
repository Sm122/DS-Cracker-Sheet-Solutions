class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int ar[], int n){
        
        // Your code here
            int sum=0;
            int max=Integer.MIN_VALUE;
            for(int k=0;k<n;k++)
            {
               sum=Math.max(ar[k],sum+ar[k]);
               if(sum>max)
               max=sum;
            }
        
        return max;
}
}