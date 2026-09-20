import java.util.*;
class Node
{
 int data;
 Node next;
 Node(int d)
 {
  data=d;
  next=null; 
 }
}
public class Intersection_of_Two_Linked_List
{
 public static Node inters(Node root1,Node root2)
 {
   Node p1=root1,p2=root2;
   while(p1!=p2)
   {
     if(p1==null)
      p1=root2;
     else
      p1=p1.next;
    if(p2==null)
     p2=root1;
    else
     p2=p2.next;
   }
   return p1;
}
 public static void main(String args[])
 {
  Node root1 = new Node(1);
  Node root2=new Node(4);
  Node r12 = new Node(2);
  root1.next=r12;
  Node r13 = new Node(3);
  r12.next=r13;
  Node r14 = new Node(7);
  r13.next=r14;
  Node r15 = new Node(8);
  r14.next=r15;
  Node r22 = new Node(5);
  root2.next=r22;
  r22.next=r14;
  Node common = Intersection_of_Two_Linked_List.inters(root1,root2);
  while(common!=null)
  {
   System.out.print(common.data+" ");
   common=common.next;
  }
 }
}
 
