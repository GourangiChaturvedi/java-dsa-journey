import java.util.stream.Collectors;
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
       return name;
    }
}
public class Students_Grouping
{
	public static void main(String[] args) 
        {
          List<Student> lst = new ArrayList<>();
	  lst.add(new Student("A",90));
	  lst.add(new Student("B",80));
          lst.add(new Student("C",60));
          lst.add(new Student("D",90));
          lst.add(new Student("E",80));
          lst.add(new Student("F",70));
          Map<Integer,List<Student>> mp = lst.stream().collect(Collectors.groupingBy(s->s.marks));
          for(Map.Entry<Integer,List<Student>> entry:mp.entrySet())
            System.out.println(entry.getKey()+"  "+entry.getValue());
	}
}
