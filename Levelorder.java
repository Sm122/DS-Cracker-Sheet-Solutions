class Level_order_traversal
{
    //You are required to complete this method
    static void levelOrder(Node node) 
    {
        // Your code here
        LinkedList<Node> queue = new LinkedList<Node>();
      
        queue.add(node);
        while(queue.size()!=0)
        {
            Node n = queue.poll();
            System.out.print(n.data+" ");
            if(n.left!=null)
            queue.add(n.left);
            if(n.right!=null)
            queue.add(n.right);
        }
        
        
    }
}
