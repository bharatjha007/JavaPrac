package eight.aug.task;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("The given no. is ::");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=1;
        for (int i = a; i >=1; i--) {
        		b=b*i;
		}
        System.out.println("and The factorial of this no. is:: "+b);
        sc.close();
	}

}
