import java.util.*;
class Node
{
  int data;
  Node left;
  Node right;
  Node(int d)
  {
    data=d;
    left=null;
    right=null;
  }
}
public class LCA
{
  public static Node BuildTree(int a[])
  {
   if(a.length==0 || a[0]==-1)
    return null;
   Node root=new Node(a[0]);
   Deque<Node> dq = new ArrayDeque<>();
   dq.add(root);
   int i=1;
   while(!dq.isEmpty() && i<a.length)
   {
     Node current=dq.poll();
     if(a[i]!=-1)
     {
       current.left=new Node(a[i]);
       dq.add(current.left);
     }
     i++;
     if(i<a.length && a[i]!=-1)
     {
       current.right=new Node(a[i]);
       dq.add(current.right);
     }
     i++;
   }
   return root;
 }
 public static Node lca(Node root,int p,int q)
 {
   if(root==null)
     return null;
   if(root.data==p || root.data==q)
     return root;
   Node left=lca(root.left,p,q);
   Node right=lca(root.right,p,q);
   if(left!=null && right!=null)
     return root;
   if(left==null)
     return right;
    return left;
 }
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the number of nodes");
  int n=in.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter nodes in level order.Enter -1 if node does not exist");
  for(int i=0;i<n;i++)
   arr[i]=in.nextInt();
  Node r=LCA.BuildTree(arr);
  System.out.println("Enter first target node");
  int p=in.nextInt();
  System.out.println("Enter second target node");
  int q=in.nextInt();
   Node a=LCA.lca(r,p,q);
  System.out.println("Ancestor="+a.data);
 }
}
