package eight.aug.task;

import java.util.Scanner;

public class Squareroot {
	public static void main(String[] args) {
		double t;
		System.out.println("The given no. is ::");
	    Scanner sc = new Scanner(System.in);
	    double number = sc.nextDouble();
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		System.out.println(squareRoot);
		sc.close();
	}
	
}
