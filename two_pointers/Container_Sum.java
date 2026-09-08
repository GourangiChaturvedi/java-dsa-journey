import java.util.*;
public class Container_Sum
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the number of heights");
   int n=in.nextInt();
   int a[]=new int[n];
   System.out.println("Enter heights");
   for(int i=0;i<n;i++)
    a[i]=in.nextInt();
   int left=0,right=n-1;int max=0;
   while(left<right)
   {
     int area=(right-left)*Math.min(a[left],a[right]);
     max=Math.max(area,max);
     if(a[left]<a[right])
        left++;
     else
        right--;
   }
   System.out.println(max);
 }
}     
