import java.util.*;
class Student
{
  String name;
  int marks;
  Student(String name, int marks)
  {
    this.name=name;
    this.marks=marks;
  }
}

public class Arrays_Implementation_Comparator
{
  public static void main(String args[])
  {   
    Student students[] = { new Student("Rahul",67), new Student("Aman",80), new Student("Abhishek",80), new Student("Gourangi", 91)};
    //Ascending Order of Marks
    System.out.println("Ascending Order of Marks");
    Comparator<Student> marksAsc = (s1,s2) ->Integer.compare(s1.marks,s2.marks);
    Arrays.sort(students,marksAsc);
    for(int i=0;i<students.length;i++)
     System.out.println(students[i].name+" "+students[i].marks);
    //Descending Order of Marks
    System.out.println("Descending Order of Marks");
    Comparator<Student> marksDesc = (s1,s2) -> Integer.compare(s2.marks,s1.marks); 
    Arrays.sort(students,marksDesc);
    for(int i=0;i<students.length;i++)
     System.out.println(students[i].name+" "+students[i].marks);
   //Alphabetical Order of Names
   System.out.println("Alphabetical Order of Names");
   Comparator<Student> names = (s1,s2) -> (s1.name).compareTo(s2.name);
   Arrays.sort(students,names);
   for(int i=0;i<students.length;i++)
     System.out.println(students[i].name+" "+students[i].marks); 
   }
}
