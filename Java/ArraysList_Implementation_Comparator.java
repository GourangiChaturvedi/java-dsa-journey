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
      return name+" "+marks;
    }
}
public class ArraysList_Implementation_Comparator
{
  public static void main(String args[])
  {
   ArrayList<Student> students = new ArrayList<>(List.of(new Student("Rahul",67), new Student("Aman",80), new Student("Abhishek",80), new Student("Gourangi", 91)));
   //Ascending Order of Marks
   Comparator<Student> marksAsc = (s1,s2) -> Integer.compare(s1.marks,s2.marks);
   Collections.sort(students,marksAsc);
   System.out.println("Ascending Order of Marks");
   System.out.println(students);
   //Descending Order of Marks
   Comparator<Student> marksDesc = (s1,s2) -> Integer.compare(s2.marks,s1.marks);
   Collections.sort(students,marksDesc);
   System.out.println("Descending Order of Marks");
   System.out.println(students);
   //Alphabetical Order of Names
   Comparator<Student> names = (s1,s2) -> (s1.name).compareTo(s2.name);
   Collections.sort(students,names);
   System.out.println("Alphabetical Order of Names");
   System.out.println(students);
  }
}
