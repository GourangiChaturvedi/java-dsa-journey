import java.util.*;
public class Throws_Demonstration
{
 public static void Check(int a) throws Exception
 {
   if(a<18)
   {
    throw new Exception("Invalid age");
   }
   System.out.println("Valid Age");
 }
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Enter age");
  int age=in.nextInt();
  try
  {
    Check(age);
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());  
  }
 }
} 
