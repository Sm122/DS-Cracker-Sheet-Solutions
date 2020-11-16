class Solution {
    public void nextPermutation(int[] nums) {
      int index1=-1;
      for(int i=nums.length-2;i>=0;i--)
      {
         if(nums[i]<nums[i+1])
         {
            index1=i;
             break;
         }
      }
       if(index1<0)
           reverse(nums,0,nums.length-1);
       else{
           for(int j=nums.length-1;j>=0;j--)
           {
               if(nums[j]>nums[index1])
               {
                   swap(nums,j,index1);
                   break;
               }
           }
           reverse(nums,index1+1,nums.length-1);
       }
          
    }
    public void reverse(int nums[],int f,int l)
    {
        for(int i=f;i<=(l+f)/2;i++)
        {
            swap(nums,i,f+l-i);
        }
    }
    public void swap(int ar[],int i, int j)
    {
        int temp = ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}