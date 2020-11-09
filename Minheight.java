class solve{
    static int minJumps(int[] ar){
        // your code here
       
    if(ar.length<1)
    return 0;
    if(ar[0]==0)
    return -1;
    int max=ar[0];
    int step=ar[0];
    int count=1;
    for(int i =1;i<ar.length;i++)
    {
     if(i==ar.length-1)
     break;
     max = Math.max(max,i+ar[i]);
     step--;
     if(step==0)
     {
         count++;
         if(i>=max)
         return -1;
         step=max-i;
     }
   }
    
    return count;
    } 
    
}
