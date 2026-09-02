/*
Approach: Find mid.Check a[mid]==target, if not then , check if left half is sorted. If sorted, check for target being inside left half, if yes, go left else go right.If left half is not sorted, then right half must be sorted. CHeck if target is in right half. If yes, go right, else go left.

Time Complexity:O(log(n)) {because the array is halved in every iteration}

Space Complexity:O(1) {because number of arbitrary variables do not change with size of the input array}

Edge Cases: Empty array, length of array is 1 or key not present in array.
*/
import java.util.*;
class Search_in_Rotated_Array
{
  int BinSearch(int a[],int k)
  {
      int l=0,r=a.length-1;
      while(l<=r)
      {
        int mid=l+(r-l)/2;
        if(a[mid]==k)
          return mid;
        else if(a[l]<=a[mid])
        {
            if(a[l]<=k && k<a[mid])
             r=mid-1;
            else
              l=mid+1;
        }
        else
        {
             if(a[mid]<k && k<=a[r])
                l=mid+1;
             else
                r=mid-1;
        }
      }
     return -1;
  }
}
public class Rotated
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
    System.out.println("Enter key to be searched");
    int key = in.nextInt();
    Search_in_Rotated_Array obj = new Search_in_Rotated_Array();
    System.out.println(obj.BinSearch(arr,key));
  }
}


