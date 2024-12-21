package basics;

import java.util.Scanner;

public class swa {
	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=SC.nextInt();
		System.out.println("Enter b value");
		int b=SC.nextInt();
		System.out.println("Before Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
			}
	}
