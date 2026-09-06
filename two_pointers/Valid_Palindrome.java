import java.util.*;
public class Valid_Palindrome
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the string to be checked");
   String s = in.nextLine();
   int left=0;
   int right=s.length()-1;
boolean isPalindrome=true;
   while(left<right)
   {
     if(!Character.isLetterOrDigit(s.charAt(left)))
       left++;
     else if(!Character.isLetterOrDigit(s.charAt(right)))
       right--;
     else
      {
        if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right)))
        {
          left++;
          right--;
        }
        else
        {
   	   isPalindrome=false;
           break;
      }
   }
   if(isPalindrome)   
     System.out.println("Palindrome");
   else
     System.out.println("Not Palindrome");
  }
}
