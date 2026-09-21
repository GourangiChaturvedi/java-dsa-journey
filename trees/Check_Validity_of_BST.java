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
public class Check_Validity_of_BST
{
  public static Node BuildTree(int a[])
  {
    if(a.length==0 || a[0]==-1)
     return null;
    else
    {
      Node root=new Node(a[0]);
      Deque<Node> dq = new ArrayDeque<>();
      dq.add(root);
      int i=1;
      while(i<a.length && !dq.isEmpty())
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
  }
public static boolean isValid(Node n,long min,long max)
{
   if(n==null)
      return true;
   if(n.data<min || n.data>=max)
     return false;
   return isValid(n.left,min,n.data) && isValid(n.right,n.data,max);
}
public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of nodes");
    int n=in.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter node values in level order.Enter -1 if node does not exist");
    for(int i=0;i<n;i++)
     arr[i]=in.nextInt();
    Node r = Check_Validity_of_BST.BuildTree(arr);
    boolean res=Check_Validity_of_BST.isValid(r,Long.MIN_VALUE,Long.MAX_VALUE);
    if(res)
      System.out.println("Valid BST");
    else
      System.out.println("Invalid BST");

   }
}

