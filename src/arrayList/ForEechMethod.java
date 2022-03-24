package arrayList;

import java.util.ArrayList;

public class ForEechMethod 
{
	 public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(30);
		i.add(20);
		i.add(70);
		i.add(80);
		i.forEach((n)->System.out.println(n));
	}
}
