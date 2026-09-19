 import java.util.*;
public class Stream_Pipeline
{
  public static void main(String args[])
  {
    List<Integer> lst = new ArrayList<>(List.of(5, 12, 7, 20, 3, 18, 25));
    lst.stream().filter(n->n>10).map(n->n*2).forEach(n->System.out.print(n+","));
  }
}
