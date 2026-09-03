/*
Problem Statement:
Koko has n piles of bananas, where piles[i] represents the number of bananas in the i-th pile.

She has h hours to eat all the bananas.

Koko chooses an integer eating speed k (bananas per hour). Each hour, she chooses one pile and eats up to k bananas from that pile. If the pile has fewer than k bananas, she eats all of them and does not eat from another pile during that hour.

Return the minimum integer value of k such that Koko can eat all the bananas within h hours.

Example:

Input:
piles = [3,6,7,11]
h = 8

Output:
4



Approach :
 Binary Search on Answer is used.
 Search space for speed is l=1 to r=max(pile)
 Since the time left after eating a pile can't be used to eat the next pile, we should calculate hours needed to eat each pile and then find total hours needed to eat all the piles.
 Fesibility condition : If (Total_hours_needed<=h), mid is feasible speed (ans=mid) and we should move left to find a lesser speed than mid. Else we should move right as this speed is too small to finish eating withing h hours.



Time Completixty : O(n log(max(pile)) )
                   Length of search space starts with max(pile) and reduces to half everytime. Hence, log(max(plie)).
                   Inside each outer iteration, we traverse pile[] to find total hours needed. Hence, n (i.e length of array pile[])
                   Therefore, n multiplied by log(max(pile))

Space Complexity : O(1)

Edge Cases :Empty array
	    Single pile
            h = number of piles
            h is very large
            All piles have the same size
            Target speed = 1
            Target speed = max(pile)
*/

import java.util.*;
class Bananas
{
  public int speed(int pile[],int h)
  {
    if(pile.length == 0)
      return 0;
    int l=1,r=pile[0],ans=0;
    for(int i=1;i<pile.length;i++)
    {
       if(r<pile[i])
         r=pile[i];
    }
    while(l<=r)
    {
       int mid=l+(r-l)/2;
       long total_hours_needed=0;   
       for(int i=0;i<pile.length;i++)
         total_hours_needed+=Math.ceil((double)pile[i]/mid);
       if(total_hours_needed<=h)//Feasible speed
       {
           ans=mid; 
           r=mid-1;
       }
       else
          l=mid+1;
     }
     return ans;
  }
}
public class Koko_Eating_Bananas
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of piles of bananas");
    int l = in.nextInt();
    int piles[] = new int[l];
    System.out.println("Enter number of bananas in each pile separated by space");
    for(int i=0;i<l;i++)
      piles[i]=in.nextInt();
    System.out.println("Enter number of hours given to finish eating the piles");
    int h=in.nextInt();
    Bananas obj = new Bananas();
    System.out.println("Minimum Speed ="+obj.speed(piles,h));
  }
}
