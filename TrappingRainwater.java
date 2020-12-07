class Solution {
    public int trap(int[] arr) {
      if(arr.length==1)
          return 0;
      int res=0;
      int l =0;
      int r = arr.length-1;
      int leftmax =0;
      int rightmax=0;
      while(l<=r)
      {
          if(arr[l]<arr[r])
          {
              if(arr[l]>leftmax)
                  leftmax=arr[l];
              else
              {
                  res+=leftmax-arr[l];
              }
              l++;
          }
          else{
              if(arr[r]>rightmax)
                  rightmax=arr[r];
              else{
                  res+=rightmax-arr[r];
              }
              r--;
          }
          
          
      }
      
      return res;
        
        
        
    }
}