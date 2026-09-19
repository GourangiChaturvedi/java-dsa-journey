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

public class Max_Depth
{
   public static Node BuildTree(int a[])
   {
    if(a.length==0 || a[0]==-1)
     return null;
    else
    {
       Deque<Node> dq = new ArrayDeque<>();
       Node root=new Node(a[0]);
       dq.add(root);
       int i=1;
       while(!dq.isEmpty() && i<a.length)
       {
           Node current=dq.poll();

           //Left Node
           if(a[i]!=-1)
           {
              current.left=new Node(a[i]);
              dq.add(current.left);
           }
           i++;
           //Right Node
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

  static int max=0;
  public static void MaxD(Node n,int count)
  {
    if(n!=null)
    {
      count++;
      if(n.left==null && n.right==null)
      {
        if(count>max)
          max=count; 
      }
      else
      {
        MaxD(n.left,count);
        MaxD(n.right,count);
      }
   }
 }
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the number of nodes in tree");
   int n = in.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter the nodes in level order.Enter -1 if a node does not exist");
   for(int i=0;i<n;i++)
     arr[i]=in.nextInt();
   Node r = Max_Depth.BuildTree(arr);
   Max_Depth.MaxD(r,0);
   System.out.println(Max_Depth.max);
 }
} 
