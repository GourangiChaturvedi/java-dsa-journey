import java.util.*;
class Demo
{
  public static void printList(List<?> lst)
  {
    for(Object o : lst)
      System.out.print(o+" ");
    System.out.println();
  }
}
public class Wildcard_Basics
{
  public static void main(String args[])
  {
    List<Integer> l1=List.of(1,2,3);
    List<String> l2=List.of("A","B","C");
    Demo obj = new Demo();
    obj.printList(l1);
    obj.printList(l2);
  }
}
