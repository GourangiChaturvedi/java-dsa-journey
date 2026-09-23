import java.util.*;
class InsufficientBalanceException extends Exception
{
  InsufficientBalanceException(String message)
  {
    super(message);
  }
}
public class Custom_Exception2
{
  public static void Withdraw(double amount,double balance) throws InsufficientBalanceException
  {
    if(amount>balance)
     throw new InsufficientBalanceException("Amount exceeds balance");
    else
     System.out.println("Withdrwal complete");
  }
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter balance");
     double b=in.nextDouble();
     System.out.println("Enter amount");
     double a=in.nextDouble();
     try
     {
       Withdraw(a,b);
     }
     catch(InsufficientBalanceException e)
     {
       System.out.println(e.getMessage());
     }
     finally
     {
       System.out.println("Program complete");
      }
  }
}
