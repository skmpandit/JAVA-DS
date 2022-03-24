package arrayList;

import java.util.ArrayList;

public class ClearMethodString 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Rajan");
		s.add("Ramu");
		System.out.println(s);
		s.clear();
		System.out.println(s);
	}
}
