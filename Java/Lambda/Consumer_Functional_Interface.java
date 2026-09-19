import java.util.*;
import java.util.function.Consumer;
public class Consumer_Functional_Interface
{
 public static void main(String args[])
 {
   Consumer<String> printer = s -> System.out.println(s);
   printer.accept("Hello");
   printer.accept("Java");
 }
} 
