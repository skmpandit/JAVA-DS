package arrayList;
import java.util.ArrayList;
public class GetElementsString 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Rajan");
		s.add("Ramu");
		s.add("Mohan");
		for(String a:s)
		{
			System.out.println(a);
		}
		String elements=s.get(0);
		System.out.println("The elements at index 0 : "+elements);
	}
}
