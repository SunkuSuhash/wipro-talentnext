package javafundamentals;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender.equals("Female") && (age>=1 && age<=58))
		{
			System.out.println("The Percentage if intrest is 8.2%");
		}
		else if(gender.equals("Female") && age>=59 && age<=100)
		{
			System.out.println("The Percentage if intrest is 9.2%");
		}
		else if(gender.equals("Male")&& age>1 && age<58)
		{
			System.out.println("The Percentage if intrest is 8.4%");
		}
//		else if(gender=="Male" && age>1 && age<58)
		else
		{
			System.out.println("The Percentage if intrest is 10.5%");
		}

	}

}