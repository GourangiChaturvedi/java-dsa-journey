import java.util.*;
import java.util.stream.Collectors;
public class Word_Frequency
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of strings");
		int n = in.nextInt();
		List<String> lst = new ArrayList<>();
		System.out.println("Enter all strings");
		in.nextLine();
		for(int i=1;i<=n;i++)
		{
		    String s=in.nextLine();
		    lst.add(s);
		}
	    Map<String,Long> mp = lst.stream().collect(Collectors.groupingBy(word->word, Collectors.counting()));
	    for(Map.Entry<String,Long> entry : mp.entrySet())
	    {
	        System.out.println(entry.getKey()+"  "+entry.getValue());
	    }
	}
}
