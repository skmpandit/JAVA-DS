package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class LastIndexString 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Rajan");
		s.add("Sohan");
		s.add("Sonu");
		s.add("Ramu");
		s.add("Gajendra");
		s.add("Sonu");
		int i=s.lastIndexOf("Sonu");
		System.out.println("The last index of Sonu is "+i);
		Collections.sort(s);
		System.out.println(s);
		Collections.sort(s,Collections.reverseOrder());
		System.out.println(s);
	}
}
