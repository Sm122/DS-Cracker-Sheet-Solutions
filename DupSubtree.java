class Solution {
    static char marker = '$';
    static String dupSubUtil(Node root,HashSet<String> subtrees)
    {
        String s = "";
        if(root==null)
        return s+marker;
        String left = dupSubUtil(root.left,subtrees);
        if(left.equals(s))
        return s;
        String right = dupSubUtil(root.right,subtrees);
        if(right.equals(s))
        return s;
        s=s+root.data+left+right;
        if(s.length()>3&&subtrees.contains(s))
        return "";
        subtrees.add(s);
        return s;
    }
    int dupSub(Node root) {
        int flag=0;
        HashSet<String> subtrees = new HashSet<String>();
        String res = dupSubUtil(root,subtrees);
        if(res=="")
        flag=1;
        return flag;
    }
}
