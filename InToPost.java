class GfG
{
    public static int preIndex;
    GfG(int ind)
    {
        preIndex = ind;
    }
    
  public static Node buildTree(int ino[], int pre[], int st, int end)
    {
       // add your code here
       if(st>end)
       return null;
      Node node = new Node(pre[preIndex++]);
      if(st==end)
      return node;
      int t =Search(ino,st,end,node.data);
      node.left=buildTree(ino,pre,st,t-1);
      node.right=buildTree(ino,pre,t+1,end);
      return node;
       
       
    }
  public static int Search(int in[],int st,int end,int key)
  {
      int res=0;
      for(int i =st;i<=end;i++){
          if(in[i]==key)
          {
              res=i;
              break;
          }
      }
      return res;
      
  }
}
