package Practices;

import java.util.Scanner;

public class Fact2nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x= sc.nextInt();
		long y=sc.nextInt();
		sc.close();
		x=Factorial.fact(x);
		y=Factorial.fact(y);
		System.out.println(x+y);
	}

}
