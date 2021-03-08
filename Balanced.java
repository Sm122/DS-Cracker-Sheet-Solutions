class Tree
{
    int findHeight(Node root)
    {
        if(root==null)
        return 0;
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        return Math.max(lh,rh)+1;
    }
    
    boolean isBalanced(Node root)
    {
        if(root==null)
        return true;
	// Your code here
	   int lh = findHeight(root.left);
	   int rh = findHeight(root.right);
	   return (Math.abs(lh-rh)<=1&&(isBalanced(root.left))&&(isBalanced(root.right))?true:false);
	   
    }
}
