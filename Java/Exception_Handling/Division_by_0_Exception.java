import java.util.*;
public class Division_by_0_Exception
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter first number");
   int a=in.nextInt();
   System.out.println("Enter second number");
   int b=in.nextInt();
   try
   {
    int result=a/b;
    System.out.println(result);
   }
   catch(ArithmeticException e)
   {
    System.out.println(e.getMessage()); 
   }
   System.out.println("Exception Handling");
  }
}
