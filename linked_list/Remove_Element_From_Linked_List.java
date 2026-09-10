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
public class Remove_Element_From_Linked_List
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
    System.out.println("\nEnter the element to be removed");
    int val=in.nextInt();
    // If head is the value to be remove and val appears more than one time in the beginning of list
    while(head!=null && head.data==val)
     head=head.next;
    current=head;
    while(current!=null && current.next!=null)
    {
      if(current.next.data==val)
        current.next=current.next.next;
      else
        current=current.next;
    }
   current=head;
    System.out.println("New Linked LIst\n");
    while(current!=null)
    {
      System.out.print(current.data+" ");
      current=current.next;
    }
  }
 }
}







