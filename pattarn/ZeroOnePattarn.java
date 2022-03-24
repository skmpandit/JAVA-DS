package pattarn;
import java.util.*;
public class ZeroOnePattarn {
public static void main(String[] args) {
	int i,n;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the last term:-");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.println(i%2);
	}
}
}
