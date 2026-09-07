import java.util.*;
public class Main
{
public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Enter size of array");

int n =in.nextInt();

if(n!=0)

{

int a[]=new int[n];

System.out.println("Enter array elements");

for(int i=0;i<n;i++)

a[i]=in.nextInt();

int slow=0,fast=1,count=1;

while(fast<n)

{

if(a[slow]!=a[fast])

{

slow++;  
 a[slow]=a[fast];  
 fast++;  
 count++;

}
else
fast++;

}
for(int i=0;i<count;i++)
System.out.print(a[i]+" ");
}
}
}
