import java.util.*;
public class Filter_Divisible_By_5
{
 public static void main(String args[])
 {
   List<Integer> lst = new ArrayList<>(List.of(10, 17, 20, 25, 31, 33));
   lst.stream().filter(n->n%5==0).forEach(n->System.out.print(n+","));
 }
}
   
