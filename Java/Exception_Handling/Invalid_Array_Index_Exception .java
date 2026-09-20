import java.util.*;
public class Invalid_Array_Index_Exception
{
  public static void main(String args[]) 
  {
    int arr[]={1,2,3};
    try
    {
     System.out.println(arr[5]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
     System.out.println(e.getMessage());
    }
    System.out.println("Exception Handled");
  }
}
