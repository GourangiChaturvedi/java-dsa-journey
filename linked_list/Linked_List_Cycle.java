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
public class Linked_List_Cycle
{
 public static void main(String args[])
 {
   Node n1= new Node(10);
   Node n2=new Node(20);
   Node n3= new Node(30);
   Node n4= new Node(40);
   Node n5= new Node(50);
   n1.next=n2;
   n2.next=n3;
   n3.next=n4;
   n4.next=n5;
   n5.next=null;
   Node head=n1;
   Node slow=head,fast=head;
   boolean cyclic=false;
   while(slow!=null && fast.next!=null)
   {
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast)
     {
       System.out.println("Cyclic Linked List");
       cyclic=true;
       break;
     }
   }
   if(!cyclic)
    System.out.println("Not Cyclic Linekd List");
 }

}
