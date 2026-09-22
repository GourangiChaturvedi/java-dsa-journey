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
public class BFS_Traversal
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
public static List<List<Integer>> BFS(Node root)
{
  List<List<Integer>> result = new ArrayList<>();
  if(root==null)
    return result;
  Deque<Node> dq = new ArrayDeque<>();
  dq.add(root);
  while(!dq.isEmpty())
  {
     int size=dq.size();
     List<Integer> level = new ArrayList<>();
     for(int i=0;i<size;i++)
     {
       Node current=dq.poll();
       level.add(current.data);
       if(current.left!=null)
         dq.add(current.left);
       if(current.right!=null)
         dq.add(current.right);
     }
     result.add(level);
  }
  return result;
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
  Node r=BFS_Traversal.BuildTree(arr);
  List<List<Integer>> res = BFS_Traversal.BFS(r);
  System.out.println(res);
}
}
