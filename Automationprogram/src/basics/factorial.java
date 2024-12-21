package basics;

import java.util.Scanner;

public class factorial {
	private static int i;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter one integer value");
		int n= sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			}
		System.out.println(fact);
	}
	

}
