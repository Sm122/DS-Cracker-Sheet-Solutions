class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<Node>();
        Stack<Node> st = new Stack<Node>();
        if(node==null)
        return null;
        q.add(node);
        while(!q.isEmpty())
        {
            Node t = q.poll();
            if(t.right!=null)
            q.add(t.right);
            if(t.left!=null)
            q.add(t.left);
            st.push(t);
            
        }
        while(!st.empty())
        {
           res.add(st.pop().data); 
        }
        return res;
        
        
        
    }
}      
