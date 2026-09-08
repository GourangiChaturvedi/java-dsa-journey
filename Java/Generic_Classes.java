import java.util.*;
class Box<T>
{ 
   T value;
   Box(T value)
   { 
      this.value=value;
   }
   T getValue()
   {
      return value;
   }
}
public class Generic_Classes
{
  public static void main(String args[])
  {
      Box<Integer> b1 = new Box<>(10);
      Box<String> b2 = new Box<>("Rahul");
     System.out.println(b1.getValue());
     System.out.println(b2.getValue());
   }
}
