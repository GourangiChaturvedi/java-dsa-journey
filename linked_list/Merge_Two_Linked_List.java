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
public class Merge_Two_Linked_List
{
 public static Node merge(Node p1,Node p2)
 {
   Node dummy = new Node(0);
   Node tail=dummy;
   while(p1!=null && p2!=null)
   {
     if(p1.data<=p2.data)
     {
       tail.next=p1;
       p1=p1.next;
     } 
     else
     {
       tail.next=p2;
       p2=p2.next;
     }
     tail=tail.next;
   }
   while(p1!=null)
   {
     tail.next=p1;
     p1=p1.next;
     tail=tail.next;
   }
   while(p2!=null)
   {
     tail.next=p2;
     p2=p2.next;
     tail=tail.next;
   }
   return dummy.next;
 }   

 public static void main(String args[])
 {
 Scanner in = new Scanner(System.in);
 System.out.println("Enter the number of nodes in first linked list");
 int n1=in.nextInt();
 System.out.println("Enter the each node value");
 Node root1=null;
 Node p=root1;
 for(int i=1;i<=n1;i++)
 {
   int x=in.nextInt();
   if(i==1)
   {
     root1=new Node(x);
     p=root1;
   }
   else    
   {
     p.next=new Node(x);
     p=p.next;
   }
 }  

 System.out.println("Enter the number of nodes in second linked list");
 int n2=in.nextInt();
 System.out.println("Enter the each node value");
 Node root2=null;
 p=root2;
 for(int i=1;i<=n2;i++)
 {
   int x=in.nextInt();
   if(i==1)
   {
     root2=new Node(x);
     p=root2;
   }
   else    
   {
     p.next=new Node(x);
     p=p.next;
   }
  } 
  System.out.println();
  Node mr=Merge_Two_Linked_List.merge(root1,root2);
  p=mr;
  while(p!=null)
  {
    System.out.print(p.data+" ");
    p=p.next; 
  }
 }
}
 
