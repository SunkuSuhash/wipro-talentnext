package javafundamentals;

import java.util.*;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		if(c1>='a'&& c1<='z')
		{
			System.out.println(Character.toUpperCase(c1));
		}
		else
		{
			System.out.println(Character.toLowerCase(c1));
		}

	}

}