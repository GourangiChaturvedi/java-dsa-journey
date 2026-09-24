import java.util.*;
class Min_Stack
{
  static List<Integer> normal = new ArrayList<>();
  static List<Integer> min = new ArrayList<>();
  public static int top()
  {
    if(normal.isEmpty())
      return -1;
    return normal.get(normal.size()-1);
  }

  public static void push(int x)
  {
    if(min.isEmpty() || min.get(min.size()-1)>x)
        min.add(x);
    else
       min.add(min.get(min.size()-1));
    normal.add(x);
  }

   public static int pop()
   {
     if(normal.isEmpty())
       return -1;
     else
     {
       min.remove(min.size()-1);
       int res=top();
       normal.remove(normal.size()-1);
       return res;
     }
   }

   public static int getMin()
   {
     if(min.isEmpty())
         return -1;
     else
       return min.get(min.size()-1);
   }
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter choice\n1-push\n2-pop\n3-top\n4-getMin\n5-end operation");
     int choice=in.nextInt();
     while(choice!=5)
     {
       if(choice==1)
       {
         System.out.println("Enter value to be pushed");
         int y=in.nextInt();
         Min_Stack.push(y);
       }
       else if(choice==2)
          System.out.println("Popped value = "+Min_Stack.pop());
       else if(choice==3)
         System.out.println("Element at top = "+Min_Stack.top());
       else if(choice==4)
         System.out.println("Minimum = "+Min_Stack.getMin());
       else
         System.out.println("Invalid Choice");
      System.out.println("Stack:");
      for(int i=normal.size()-1;i>=0;i--)
         System.out.println(normal.get(i));
      System.out.println("\nEnter choice\n1-push\n2-pop\n3-top\n4-getMin\n5-end operation");
       choice=in.nextInt();
     }
  }
}

 
          


