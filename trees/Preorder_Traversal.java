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
public class Preorder_Traversal
{
 public static Node BuildTree(int arr[])
 {
   if(arr.length==0 || arr[0]==-1)
    return null;
   else
   {
     Deque<Node> dq = new ArrayDeque<>();
     Node root = new Node(arr[0]);
     dq.add(root);
     int i=1; 
     while(!dq.isEmpty() && i<arr.length)
     {
       Node current = dq.poll();
       //Left Node
       if(arr[i]!=-1)
       {
         current.left=new Node(arr[i]);
         dq.add(current.left);
       }
       i++;

       //Right Node
       if(i<arr.length && arr[i]!=-1)
       {
        current.right=new Node(arr[i]);
        dq.add(current.right);
       }
       i++;    
     }
     return root;
   }
 }

public static void Preorder(Node root)
{
  if(root==null)
   return;
  System.out.print(root.data+",");
  Preorder(root.left);
  Preorder(root.right);
}

 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the number of nodes");
  int n=in.nextInt();
  int a[] = new int[n];
  System.out.println("Enter the nodes in level order.Enter -1 if node does not exist");
  for(int i=0;i<n;i++)
   a[i]=in.nextInt();
  Node r = Preorder_Traversal.BuildTree(a);
  System.out.println("Preorder Traversal");
  Preorder_Traversal.Preorder(r);
 }
}



