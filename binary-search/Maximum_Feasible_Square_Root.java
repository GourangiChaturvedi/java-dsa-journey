import java.util.*;
class Square_Root
{
  public int Root(int x)
  {
    int l=0, r=x/2; //Square root of x cannot be greater than x/2. Hence, our search space is {0,1,...,(x/2)}
    int ans=0;
    while(l<=r)
    {
     int mid= l+(r-l)/2; 
     if((long)mid*mid<=x)
     {
       ans=mid;  //Answer is feasible
       l=mid+1;  //Get larger feasible solution
     }
     else
       r=mid-1; //Too large square
    }
    return ans;
  }
}
public class Maximum_Feasible_Square_Root
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number");
    int x = in.nextInt();
    Square_Root obj = new Square_Root();
    System.out.println(obj.Root(x));
  }
}
