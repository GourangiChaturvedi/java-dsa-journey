import java.util.*;
public class Sliding_Windows_Problem1
{
  public static double findMaxAverage(int a[],int k)
  {
    int sum=0;
    for(int i=0;i<k;i++)
     sum+=a[i];
    int maxSum=sum;
    for(int i=k;i<a.length;i++)
    {
     sum+=a[i];
     sum-=a[i-k];
     if(sum>maxSum)
       maxSum=sum;
    }
  return ((double)maxSum)/k
 }
 public static void main(String args[])
 { 
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the size");
  int n=in.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter the array elements");
  for(int i=0;i<n;i++) 
    arr[i]=in.nextInt();
  System.out.println("Enter size of subarray");
  int k=in.nextInt();
  System.out.println(Sliding_Windows_Problem1.findMaxAverage(arr,k));
 }
}
