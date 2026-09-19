import java.util.*;
class Student implements Comparable<Student>
{
   String name;
   int marks;
   Student(int marks,String name)
   {
     this.marks=marks;
     this.name=name;
   }
   
   public int compareTo(Student s)
   {  
      return (this.marks-s.marks);
   }
   
   public String toString()
   {  
     return name+" "+marks;
   }
}
public class Comparable_Program
{
  public static void main(String args[])
  {
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student(85,"Gourangi"));
    list.add(new Student(56,"Amit"));
    list.add(new Student(90,"Nidhi"));
    list.add(new Student(90,"Akhil"));
    Collections.sort(list);
    System.out.println(list);
   }
}
