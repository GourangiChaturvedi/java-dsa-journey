/*
Given two trees, determine whether they are structurally identical and have the same values.

Example:

Tree 1:       Tree 2:

    1             1
   / \           / \
  2   3         2   3

→ true

But:

    1             1
   /               \
  2                 2

-> false
*/

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
public class Same_Trees
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
  public static boolean Same(Node r1,Node r2)
  {
   if(r1==null && r2==null)
      return true;
   if(r1==null || r2==null)
     return false;
   if(r1.data!=r2.data)
     return false;
   return Same(r1.left,r2.left) && Same(r1.right,r2.right);
  }
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the number of nodes in first tree");
   int n=in.nextInt();
   int arr[]=new int[n];
   System.out.println("Enter nodes in level order.Enter -1 if node does not exist");
   for(int i=0;i<n;i++)
     arr[i]=in.nextInt();
    Node r1=Same_Trees.BuildTree(arr);

   System.out.println("Enter the number of nodes in second tree");
   n=in.nextInt();
   int arr2[]=new int[n];
   System.out.println("Enter nodes in level order.Enter -1 if node does not exist");
   for(int i=0;i<n;i++)
     arr2[i]=in.nextInt();
   Node r2=Same_Trees.BuildTree(arr2);
   boolean res=Same_Trees.Same(r1,r2);
   if(res)
    System.out.println("Same Trees");
   else
    System.out.println("Not Same Trees");
  }
}


