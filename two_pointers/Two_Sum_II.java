/*
Problem
You are given a sorted array of integers and a target.

Find two numbers whose sum equals the target.

Return their 1-based indices.

Example:
numbers = [2,7,11,15]
target = 9

Answer:
[1,2]
*/
import java.util.*;
public class Two_Sum_II
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter size of array");
   int n=in.nextInt();
   int a[] = new int[n];
   System.out.println("Enter elements of array separated by space");
   for(int i=0;i<n;i++)
     a[i]=in.nextInt();
   System.out.println("Enter the target");
   int target=in.nextInt();
   int left=0,right=n-1,sum=0;
   boolean found=false;
   while(left<right)
   {
     sum=a[left]+a[right];
     if(sum>target) // too large
       right--;
     else if(sum<target) // too small
      left++;
     else
     {
         found=true;
         System.out.println((left+1)+","+(right+1));
         break;
     }
   }
   if(!found)
      System.out.println("No such pair found");
 }
}
       
