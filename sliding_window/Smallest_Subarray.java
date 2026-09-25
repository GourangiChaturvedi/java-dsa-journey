import java.util.*;
public class Smallest_Subarray
{
 public static void main(String args[])
 {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter size");
   int n=in.nextInt();
   int a[]=new int[n];
   System.out.println("Enter elements");
   for(int i=0;i<n;i++)
     a[i]=in.nextInt();
    System.out.println("Enter target");
    int target=in.nextInt();
   int left=0, right,sum=0,minlength=n;
   for(right=0;right<a.length;right++)
   {
     sum+=a[right];
     while(sum>=target)
     {  
        minlength=Math.min(minlength,right-left+1);
        sum-=a[left];
        left++;
      }
   }
   System.out.println(minlength);
 }
}
    
