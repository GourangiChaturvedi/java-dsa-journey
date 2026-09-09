import java.util.*;
class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
public class Middle_of_the_Linked_List
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
   System.out.println("Enter the nodes data");
   int i=1;
   while(i<=n)
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
      i++;
   }
   //Traversing the Linked List
    current=head;
    while(current!=null)
    { 
      if(current.next!=null)
       System.out.print(current.data+"->");
      else
       System.out.print(current.data);
      current=current.next;
    }
   //Middle of the Linked List 
    Node slow=head,fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    } 
    System.out.println("\n"+slow.data);
  }
 }
}





