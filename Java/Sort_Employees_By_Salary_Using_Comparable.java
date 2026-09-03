import java.util.*;
class Employee implements Comparable<Employee>
{
  String name;
  double salary;
  Employee(String name,double salary)
  {
    this.name = name;
    this.salary = salary;
  }
  public int compareTo(Employee e)
  {
     int diff = Double.compare(e.salary,this.salary);
     if(diff==0)
       return (e.name).compareTo(this.name);
     else  
       return diff;
  }
  public String toString()
  { 
    return name+" "+salary;
  }
}
public class Sort_Employees_By_Salary
{
   public static void main(String args[])
   {
     ArrayList<Employee> list = new ArrayList<>();
     list.add(new Employee("Rahul",2500.15));
     list.add(new Employee("Aman", 2500.15));
     list.add(new Employee("Raj",1500.51));
     list.add(new Employee("Raman",1500.55));
     list.add(new Employee("Binnie",1500.51));
     Collections.sort(list);
     System.out.println(list);
   }
}
