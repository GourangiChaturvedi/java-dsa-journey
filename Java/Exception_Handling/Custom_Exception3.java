import java.util.*;
class InvalidMarksException extends Exception
{
 InvalidMarksException(String message)
  {
    super(message);
  }
}
public class Custom_Exception3
{
  public static void Check(int marks) throws InvalidMarksException
  {
    if(marks<0 || marks>100)
     throw new InvalidMarksException("Invalid Marks");
    else
     System.out.println("Valid Marks");
  }
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter marks");
     int m= in.nextInt();
     try
     {
       Check(m);
     }
     catch(InvalidMarksException e)
     {
      System.out.println(e.getMessage());
     }
   }
 }
