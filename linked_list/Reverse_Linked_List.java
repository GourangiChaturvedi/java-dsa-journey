import java.util.*;
class Node
{
  int data;
  Node next;
  Node(int data)
 {
  this.data=data;
  next=null;
 }
} 
public class Reverse_Linked_List
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the number of nodes");
  int n=in.nextInt();
  if(n>0)
  {
    Node head=null;
    Node current=null;
    System.out.println("Enter the node data");
    for(int i=1;i<=n;i++)
    {
      int x=in.nextInt();
      if(i==1)
      {
        head=new Node(x);
        current=head;
      }
      else
      {
       current.next=new Node(x);
       current=current.next;
      }
    }
    current=head;
    System.out.println();
    while(current!=null)
    {
      System.out.print(current.data+" ");
      current=current.next;
    }
    Node previous=null;
    current=head;
    while(current!=null)
    {
      Node t=current.next;
      current.next=previous;
      previous=current;
      current=t;
    }
    head=previous;

    current=head;
    System.out.println("\nReverse Linked List\n");
    while(current!=null)
    {
      System.out.print(current.data+" ");
      current=current.next;
    }
   }
  }
}
