class Tree
{
    static int maxlevel=0;
    void leftView(Node root)
    {
      // Your code here
      leftViewUtil(root,1);
      maxlevel=0;
      
    }
     static void leftViewUtil(Node root,int level)
    {
        if(root==null)
        return;
        if(level>maxlevel)
        {
            System.out.print(root.data+" ");
            maxlevel=level;
        }
        leftViewUtil(root.left,level+1);
        leftViewUtil(root.right,level+1);
        
    }
}