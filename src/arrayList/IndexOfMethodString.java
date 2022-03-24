package arrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class IndexOfMethodString
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Rajan");
		s.add("Rahun");
		s.add("Manjesh");
		Iterator<String> i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		int a=s.indexOf("Rajan");
		System.out.println("The index of Rajan is "+a);
	}
}
