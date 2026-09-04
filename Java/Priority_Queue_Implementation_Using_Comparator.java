import java.util.*;
class Student
{
 String name;
 int marks;
 Student(String name,int marks)
 {
  this.name=name;
  this.marks=marks;
 }
 public String toString()
 {
  return this.name+" "+this.marks;
 }
}
public class Priority_Queue_Implementation_Using_Comparator
{
 public static void main(String args[])
 {
  //Ascending Order of Marks with Names as Tie Breaker
   System.out.println("Ascending Order of Marks with Names as Tie Breaker");
   PriorityQueue<Student> asc = new PriorityQueue<>((s1,s2) -> {
    int result = Integer.compare(s1.marks,s2.marks);
    if(result!=0)
    	return result;
    return (s1.name).compareTo(s2.name);
    }
   );
   asc.add(new Student("Rahul",67));
   asc.add(new Student("Aman",80));
   asc.add(new Student("Abhishek",80));
   asc.add(new Student("Gourangi", 91));
   while(!asc.isEmpty())
	System.out.println(asc.poll());

  //Descending Order of Marks as with Names as Tie Breaker
   System.out.println("Descending Order of Marks with Names as Tie Breaker");
   PriorityQueue<Student> desc = new PriorityQueue<>((s1,s2) -> {
    int result = Integer.compare(s2.marks,s1.marks);
    if(result!=0)
       return result;
    return (s1.name).compareTo(s2.name);
    }
   ); 
   desc.add(new Student("Rahul",67));
   desc.add(new Student("Aman",80));
   desc.add(new Student("Abhishek",80));
   desc.add(new Student("Gourangi", 91));
   while(!desc.isEmpty())
	System.out.println(desc.poll());
 }
}
