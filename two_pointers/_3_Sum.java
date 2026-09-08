import java.util.*;
public class _3_Sum
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter length of array");
    int n=in.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements of array");
    for(int i=0;i<n;i++)
     a[i]=in.nextInt();
    Arrays.sort(a);
    List<List<Integer>> result= new ArrayList<>();
    for(int i=0;i<=n-3;i++)
    {
      if(i>0 && a[i]==a[i-1])
           continue; 
      int l=i+1,r=n-1;
      while(l<r)
      {
        int sum=a[i]+a[l]+a[r];
        if(sum<0)
          l++;
        else if(sum>0)
          r--;
        else
        {
            result.add(Arrays.asList(a[i],a[l],a[r]));
            l++;
            r--;
            while(l < r && a[l] == a[l-1])
             l++;

           while(l < r && a[r] == a[r+1])
             r--;
        }
     }
   }
   System.out.println(result);
 }
}
