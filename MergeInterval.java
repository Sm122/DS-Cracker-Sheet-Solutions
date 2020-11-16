class Solution {
    public int[][] merge(int[][] arr) {
        if(arr.length<=1)
            return arr;
        Arrays.sort(arr,(a,b) ->
                    {
                      if(a[0]>b[0])
                          return 1;
                        else if(a[0]<b[0])
                            return -1;
                        else
                            return 0;
                        
                    });
        ArrayList<int []> list = new ArrayList<int []>();
        list.add(arr[0]);
        for(int i =1,k=0;i<arr.length;i++)
        {
            if(arr[i][0]<=list.get(k)[1])
            {
               list.get(k)[1]=Math.max(arr[i][1],list.get(k)[1]);
            }
            else{
                list.add(arr[i]);
                k++;
            }
        }
        
        return list.toArray(new int[list.size()][2]);
                    
        
    }
}