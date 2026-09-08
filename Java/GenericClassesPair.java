class Pair<T1,T2>
{  
    T1 key;
    T2 value;
    Pair(T1 key,T2 value)
    {
      this.key=key;
      this.value=value;
    }
   void display()
   {
       System.out.println(key+" "+value);
    }
}
public class GenericClassesPair
{
  public static void main(String args[])
  { 
     Pair<Integer,String> p1 = new Pair<>(1,"Rahul");
     Pair<String,Double> p2 = new Pair<>("Price",99.5);
     p1.display();
    p2.display();
   }
}
    
