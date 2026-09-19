import java.util.*;
public class  Square_Even_Numbers
{
  public static void main(String args[])
  {
   List<Integer> lst = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
   lst.stream().filter(n->n%2==0).map(n->n*n).forEach(n->System.out.print(n+","));
  }
}
