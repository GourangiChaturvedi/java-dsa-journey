import java.util.*;
import java.util.stream.Collectors;
public class Remove_Duplicates
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
		lst=lst.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(lst);
	}
}
