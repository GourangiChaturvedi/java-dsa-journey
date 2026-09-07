import java.util.*;
public class Square_Sorted_Array
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=in.nextInt();
               if(n>0)
               {
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		  a[i]=in.nextInt();
		int sq[]=new int[n];
		int l=0,r=n-1,index=n-1;
		while(l<r)
		{
		    if(Math.abs(a[l])>Math.abs(a[r]))
		      sq[index--]=a[l]*a[l++];
		   else if(Math.abs(a[l])<Math.abs(a[r]))
		     sq[index--]=a[r]*a[r--];
		    else 
		    {
		        sq[index--]=a[l]*a[l++];
		        sq[index--]=a[r]*a[r--];
		    }
		}
                sq[index--]=a[l]*a[l];
		System.out.println();
		for(int i=0;i<n;i++)
		 System.out.print(sq[i]+" ");
              }
	}
}
