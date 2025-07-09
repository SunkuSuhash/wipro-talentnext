package javafundamentals;
import java.util.*;
public class Q8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		if(c1>='a'||c1<='z'||c1>='A'||c1<='Z')
		{
			System.out.println(c1);
		}
		else if(c1>=0||c1<=9)
		{
			System.out.println(c1);
		}
		else
		{
			System.out.println(c1);
		}
	}

}