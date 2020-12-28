class View
{
    // function should print the topView of the binary tree
    
   
    static void topView(Node root)
    {
        // add your code
        class Qobj{
        int hd;
        Node node;
        Qobj(Node node,int hd)
        {
            this.hd= hd;
            this.node=node;
        }
    }

        if(root==null)
        return;
         TreeMap<Integer,Node> hm = new TreeMap<Integer,Node>();
        int hd = 0;
        Queue<Qobj> q = new LinkedList<Qobj>();
        q.add(new Qobj(root,0));
        while(!q.isEmpty())
        {
            Qobj ob = q.poll();
            Node temp = ob.node;
            hd = ob.hd;
            if(!hm.containsKey(hd))
            {
                hm.put(hd,temp);
            }
            
            if(temp.left!=null)
            q.add(new Qobj(temp.left,hd-1));
            if(temp.right!=null)
            q.add(new Qobj(temp.right,hd+1));
        }
        for(Map.Entry<Integer,Node> entry: hm.entrySet())
        {
           System.out.print(entry.getValue().data+" ");
        }
        
        
    }
}