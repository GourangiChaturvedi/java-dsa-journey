import java.util.*;
public class Basic_Comparator
{
 public static void main(String args[])
 {
   Integer arr1[]={5,2,8,1,3};
   Integer arr2[]={1,2,3,4,5};
   Comparator<Integer> ascending = (a,b) -> Integer.compare(a,b);
   Arrays.sort(arr1,ascending);
   for(int i=0;i<arr1.length;i++)
    System.out.print(arr1[i]+" ");
   System.out.println();
   Comparator<Integer> descending = (a,b) -> Integer.compare(b,a);
  Arrays.sort(arr2,descending);
  for(int i=0;i<arr2.length;i++)
    System.out.print(arr2[i]+" ");
 }
}
