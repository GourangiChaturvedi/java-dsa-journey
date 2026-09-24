import java.util.*;
public class Next_Greater_Element
{
  public static int[] Great(int a[])
  {
    int res[]=new int[a.length];
    List<Integer> st = new ArrayList<>();
    for(int i=a.length-1;i>=0;i--)
    {
       while(!st.isEmpty() && a[i]>st.get(st.size()-1))
         st.remove(st.size()-1);
       if(st.isEmpty())
         res[i]=-1;
       else
         res[i]=st.get(st.size()-1);
      st.add(a[i]);
    }
    return res;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=in.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the values");
    for(int i=0;i<n;i++)
       arr[i]=in.nextInt();
    int ans[]=Next_Greater_Element.Great(arr);
    System.out.println("Next Greater Element for each number:");
    for(int i=0;i<n;i++)
      System.out.println(arr[i]+"->"+ans[i]);
   }
}
