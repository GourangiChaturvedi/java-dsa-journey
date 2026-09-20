import java.util.*;
public class Throw_Demonstration
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter age");
    int a=in.nextInt();
    if(a<18)
    {
     throw new IllegalArgumentException("Invalid Age");
    }
    System.out.println("Valid Age");
 }
}
