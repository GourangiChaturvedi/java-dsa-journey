import java.util.*;
public class MinHeap_MaxHeap_Using_Comparator
{
 public static void main(String args[])
 {
   //Min Heap
   PriorityQueue<Integer> pq = new PriorityQueue<>();
   pq.add(7);
   pq.add(2);
   pq.add(9);
   pq.add(4);
   pq.add(1);
   System.out.println("Min Heap");
   while(!pq.isEmpty())
   	System.out.println(pq.poll());

   //Max Heap
   PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
   maxHeap.add(7); 
   maxHeap.add(2);
   maxHeap.add(9);
   maxHeap.add(4);
   maxHeap.add(1);
   System.out.println("Max Heap");
   while(!maxHeap.isEmpty())
   	System.out.println(maxHeap.poll());
 }
}
