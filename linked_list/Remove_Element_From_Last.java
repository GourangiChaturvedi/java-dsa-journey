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
public class Remove_Element_From_Last
{
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of nodes");
    int n=in.nextInt();
    if(n>0)
    {
    Node head=null;
    Node current=null;
    System.out.println("Enter the data of nodes");
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
    while(current!=null)
    {
        System.out.print(current.data+" ");
        current=current.next;
    }
    System.out.println("Enter the node position to be removed from end");
    int p=in.nextInt();
    Node dummy=new Node(10);
    dummy.next=head;
    Node slow=dummy;
    Node fast=dummy;
    for(int i=1;i<=p;i++)
      fast=fast.next;
    while(fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=slow.next.next;
    head=dummy.next;
    current=head;
    while(current!=null)
    {
        System.out.print(current.data+" ");
        current=current.next;
    }
  }
 }
}
