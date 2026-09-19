import java.util.*;
public class  Cube_Numbers
{
 public static void main(String args[])
 {
  List<Integer> lst = new ArrayList<>(List.of(1, 2, 3, 4, 5));
  lst.stream().map(n->n*n*n).forEach(n->System.out.print(n+","));
 }
}

