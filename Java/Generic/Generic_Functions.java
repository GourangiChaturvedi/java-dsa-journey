class P2
{
   public static <T> void print(T value)
   {
      System.out.println(value);
   }
}
public class Generic_Functions
{
  public static void main(String args[])
  {
      P2 obj = new P2();
      obj.print(10);
      obj.print("Rahul");
      obj.print(true);
   }
}
