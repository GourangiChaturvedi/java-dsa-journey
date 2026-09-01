/*
September 1
Problem Statement:  Given a sorted array nums and a target target, return the starting and ending position of target.
                    If target not found , return [-1,-1]
                    Example:
                    Input:
                    nums = [5,7,7,8,8,10]
                    target = 8

                   Output:
                   [3,4]
Approach : Using two binary searches to find first and last occurrence of the target.
           First occurrence: If target found, move left.
           Last occurrence : If target found, move right.

Time Complexity : First occurrence: O(log(n))
                  Last occurrence: O(log(n))
                  Total : O(log(n)) + O(log(n)) = O(log(n))
Space Complexity : O(1) [as mid, left, right remain the same for any size of array]

Edge Case : If the first and last occurrence are first and last index of the array. Eg: [2,2,2,2,2]   target = 2
*/ 

import java.util.*;
class Bin
{
  int First(int a[],int k)
  {
    int first=-1, l=0, r=a.length-1;
    while(l<=r)
    {
      int mid=l+(r-l)/2;
      if(a[mid]==k)
      {
          first=mid;
          r=mid-1;
      }
      else if(a[mid]>k)
         r=mid-1;
      else
         l=mid+1;
    }
   return first;
  }

  int Last(int a[],int k)
  {
    int last=-1, l=0, r=a.length-1;
    while(l<=r)
    {
      int mid=l+(r-l)/2;
      if(a[mid]==k)
      {
          last=mid;
          l=mid+1;
      }
      else if(a[mid]>k)
         r=mid-1;
      else
         l=mid+1;
    }
   return last;
  }
}
 
public class First_Last_Occurrence
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter size");
   int n = in.nextInt();
   int arr[] = new int[n];
   System.out.println("Enter elements separated by space");
   for(int i=0;i<n;i++)
     arr[i]=in.nextInt();
   System.out.println("Enter key to be searched");
   int key = in.nextInt();
   Bin obj = new Bin();
   System.out.println(obj.First(arr,key)+","+obj.Last(arr,key));
 }
}
