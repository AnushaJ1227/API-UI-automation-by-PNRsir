package test1;

import java.util.Scanner;

public class string_methods {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String\n");
		String str = sc.nextLine();
		System.out.println(str.length()+ " is the total");
		System.out.println(str.toUpperCase() + " -- Capital");
		System.out.println(str.toLowerCase()+ " -- small letters");
		System.out.println(str.substring(1));
		System.out.println(str.substring(1, 5));
		System.out.println(str.subSequence(1, 5));
		

	}

}
