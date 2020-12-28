class Tree
{
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        // Your code here
        if(root==null)
        return;
        int hd=0;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Node> q=new LinkedList<Node>();
        root.hd=hd;
        q.add(root);
        while(!q.isEmpty())
        {
           Node temp=q.remove();
           hd=temp.hd;
           map.put(hd,temp.data);
           if(temp.left!=null)
           {
               temp.left.hd=hd-1;
               q.add(temp.left);
           }
           if(temp.right!=null)
           {
               temp.right.hd=hd+1;
               q.add(temp.right);
           }
        }
        Set<Entry<Integer,Integer>> set=map.entrySet();
        Iterator<Entry<Integer,Integer>> iterator=set.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer,Integer> m=iterator.next();
            System.out.print(m.getValue()+" ");
        }
        
        
        
        
        
        
    }
}
	