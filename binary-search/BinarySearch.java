/*Approach : Comparing the key to be found with the middle element of the array.If the middle element is greater than the key,then searching for the key in the left half of the array,else searching it in the right half of the array.In this way,the size of the array to be acted upon will be reduced by half.
Time Complexity : O(log(n)) 
n  =  2^k
n/2=  .
n/3=  .
.  =  .
.  = 2^2
.  = 2^1
1  = 2^0
Hence, k = log(n). Number of steps to reach from n to 1 is (k+1) i.e. (log(n)+1).Therefore, time complexity is O(log(n))
 
Space Complexity : O(1)   (because the auxillary space(total_space-input_space) used is only for some variables like l,r,mid.Hence, inpput size is not counted in space complexity unless total space complexity is asked.Why O(1) because even if size of arryay increases, there are only these three variables(l,r,mid) used always.Hence,the space used for every value of n is constant.Therefore,O(1)) 
 
Requirement : Binary Search can be applied for sorted arrays only

Edge Cases : Empty array, One element array, key is first element, key is last element , key does not exist , duplicate values
*/

import java.util.*;
class Bin
{
 boolean BinSea(int a[],int key)
 {
    if(a.length==0)
     return false;
    int l=0;
    int r=a.length-1;
    while(l<=r)
    {
      int mid=l+(r-l)/2;
      if(a[mid]==key)
       return true;
      else if(a[mid]<key)
       l=mid+1;
      else
       r=mid-1;
    } 
    return false;
 }
}
public class BinarySearch
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter size : ");
   int n = in.nextInt();
   int arr[] = new int[n];
   System.out.println("Enter the elements of array separated by spaces : ");
   for(int i=0;i<n;i++)
      arr[i]=in.nextInt();
   System.out.println("Enter the key to be searched for : ");
   int k= in.nextInt();
   Bin obj = new Bin();
   if(obj.BinSea(arr,k))
     System.out.println("Key Found");
   else
     System.out.println("Key Not Found");
  }
}
