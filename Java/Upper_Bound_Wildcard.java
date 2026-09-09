import java.util.*;
class Demo
{
  public static void printList(List<? extends Number> lst)
  {
    for(Object o:lst)
     System.out.print(o+" ");
    System.out.println();
  }
}
public class Upper_Bound_Wildcard
{
 public static void main(String args[])
 {
   List<Integer> l1=List.of(1,2,3);
   List<Double> l2=List.of(2.4,5.6,7.8);
   //List<String> l3=List.of("A","B");
   Demo obj = new Demo();
   obj.printList(l1);
   obj.printList(l2);
  // obj.printList(l3); 
  }
}
