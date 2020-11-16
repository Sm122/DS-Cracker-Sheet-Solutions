class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1 || prices.length==0)
            return 0;
        int diff= prices[1]-prices[0];
        int min = prices[0];
     for(int i =1;i<prices.length;i++)
     {
        diff = Math.max(diff,prices[i]-min);
         if(min>prices[i])
             min = prices[i];
     }
     if(diff<0)
         diff=0;
        return diff;
    }
}
