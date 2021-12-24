class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hm = new HashSet<String>(wordList);
        Queue<String> q = new LinkedList<>();
        int count  = 1;
        q.add(beginWord);
        while(!q.isEmpty())
        {
            int n =q.size();
            for(int i =0;i<n;i++)
            {
                String word = q.poll();
                if(word.equals(endWord))
                    return count;
                for(int j=0;j<word.length();j++)
                {
                    char ch[] = word.toCharArray();
                    for(char k ='a';k<='z';k++)
                    {
                       if(k==word.charAt(j))
                           continue;
                        ch[j]=k;
                        if(hm.contains(String.valueOf(ch)))
                        {
                            q.add(String.valueOf(ch));
                            hm.remove(String.valueOf(ch));
                        }
                        
                    }
                   
                }
            }
           // System.out.println(q);
            count++;
        }
        return 0;
    }
}
