class GFG
{
    // return an array containing the zig zag level order traversal of the given tree
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> ar = new ArrayList<>();
	    Stack<Node> currlevel = new Stack<>();
	    Stack<Node> nextlevel = new Stack<>();
	    currlevel.push(root);
	    boolean lr= true;
	    while(!currlevel.isEmpty())
	    {
	        Node node = currlevel.pop();
	        ar.add(node.data);
	        if(lr)
	        {
	            if(node.left!=null)
	            {
	                nextlevel.push(node.left);
	            }
	            if(node.right!=null)
	            nextlevel.push(node.right);
	        }
	        else 
	        {
	            if(node.right!=null)
	            nextlevel.push(node.right);
	            if(node.left!=null)
	            {
	                nextlevel.push(node.left);
	            }
	        }
	        if(currlevel.isEmpty())
	        {
	            lr = !lr;
	            Stack<Node> temp = currlevel;
	            currlevel=nextlevel;
	            nextlevel=temp;
	        }
	    }
	   return ar;
	}
}
