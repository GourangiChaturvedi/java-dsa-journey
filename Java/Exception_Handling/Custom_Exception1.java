import java.util.*;
class Invalid_Age_Exception extends Exception
{
  Invalid_Age_Exception(String message)
   {
     super(message);
   }
}
public class Custom_Exception1
{
  public static void Age_Check(int a) throws Invalid_Age_Exception
  {
    if(a<18)
      throw new Invalid_Age_Exception("Invalid Age");
    else
     System.out.println("Valid age");
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter age");
    int age=in.nextInt();
    try
    {
      Custom_Exception1.Age_Check(age);
    }
    catch(Invalid_Age_Exception e)
    {
      System.out.println(e.getMessage());
    }
    finally
    {
      System.out.println("Check complete");
    }
  }
}
