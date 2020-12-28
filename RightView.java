class Tree{
    static int ml=0;
    void rightView(Node node) {
        //add code here.
        if(node==null)
        return;
        rightViewUtil(node,1);
        ml=0;
    }
    
    void rightViewUtil(Node node,int level)
    {
        if(node==null)
        return;
        if(level>ml)
        {
            System.out.print(node.data+" ");
            ml=level;
        }
        rightViewUtil(node.right,level+1);
        rightViewUtil(node.left,level+1);
        
    }
}