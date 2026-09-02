/*
Problem :
Find Minimum in Rotated Sorted Array
Example: [4,5,6,7,0,1,2]
The minimum is: 0

Approcach: Check the which boundary element of array is less than mid ( a[l]<a[mid] or a[r]<a[mid]). Keeping in mind that a[l]>a[r] always in a rotated sorted array.If neither of the boundary elements are less than middle element, this  means that middle element is minimum.If a[mid] > a[r], the minimum is strictly to the right of mid; otherwise, the minimum is at mid or to its left. After the loop ends, l == r, and this index points to the minimum element."  

Time Complexity: O(log(n)) [array is reduced to half]

Space Complexity : O(1)

Edeg Cases: Empty array, length of array is 1, all elements are equal, {5,1,2,3,4} is also considered as input.
*/
import java.util.*;
class Min_Element_Of_Rotated_Array
{
  void BinSearch(int a[])
  {
      if(a.length==0)
       System.out.println("No minimum element");
      else
      {
       int l=0,r=a.length-1;
       int mid=0; 
       while(l<r)
       {
         mid=l+(r-l)/2;
        if(a[r]<a[mid]) //Shift to right half of the array
          l=mid+1;
        else 
          r=mid;  
       }
       System.out.println(a[l]);
      }
   }
}
public class Minimum
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of array");
    int n = in.nextInt();
    int arr[] = new int[n];  
    System.out.println("Enter elements separated by space");
    for(int i=0;i<n;i++)
      arr[i] = in.nextInt();
     Min_Element_Of_Rotated_Array obj = new Min_Element_Of_Rotated_Array();
    obj.BinSearch(arr);
  }
}
