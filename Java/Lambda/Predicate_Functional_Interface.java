import java.util.function.Predicate;
import java.util.*;
public class Predicate_Functional_Interface
{
  public static void main(String args[])
  {
    Predicate<Integer> isEven = n -> (n%2==0);
    System.out.println(isEven.test(10));
    System.out.println(isEven.test(7));
  }
}
