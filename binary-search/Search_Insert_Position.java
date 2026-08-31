/*
SEARCH INSERT POSITION

If target is found:
→ return mid

If target is not found:
→ l eventually becomes the insertion position
→ return l(left boundary)

Why?
→ Every time a[mid] < target, target must be to the right
→ Therefore l moves forward.
→ Every time a[mid] > target, target must be to the left
→ Therefore r moves backward.
→ When loop ends, l is the first position where target can be inserted.
*/

import java.util.*;
class Bin
{
 int BinSea(int a[],int key)
 {
    int l=0;
    int r=a.length-1;
    while(l<=r)
    {
      int mid=l+(r-l)/2;
      if(a[mid]==key)
        return mid;
      else if(a[mid]<key)
       l=mid+1;
      else
       r=mid-1;
    } 
    return l;  
 }
}
public class Search_Insert_Position
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
   System.out.println("Output : "+obj.BinSea(arr,k));   
  }
}
