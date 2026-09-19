import java.util.*;
class Student
{
   String name;
   int marks;
   Student(String n,int m)
   {
     name=n;
     marks=m;   
   } 
   public String toString()
   {
     return name+" "+marks;
   }
}
public class Sorting
{
   public static void main(String args[])
   {
     List<Student> lst = new ArrayList<>();
     lst.add(new Student("Rahul",85));
     lst.add(new Student("Aman",92));
     lst.add(new Student("Priya",78));
     lst.add(new Student("Neha",92));
     Comparator<Student> desc = (s1,s2) -> {
       int result = Integer.compare(s2.marks,s1.marks);
       if(result!=0)
         return result;
      else
        return (s1.name).compareTo(s2.name);
    };
    Collections.sort(lst,desc);
    System.out.println(lst);
   }
}
