import java.util.function.Function;
import java.util.*;
public class Function_Functional_Interface
{
  public static void main(String args[])
  {
   Function<Integer,Integer> square = n -> n*n;
   System.out.println(square.apply(5));
   System.out.println(square.apply(13));
  }
}
