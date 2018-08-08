package eight.aug.task;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
			System.out.println("The given no. is ::");
           Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();
           int count=0;
           for (int i = 1; i <=a; i++) {
			if (a%i==0) {
				count++;
			}
           }
           if (count==2) {
			System.out.println("is Prime");
		}
           else {
			System.out.println("is not prime");
		}
           
           sc.close();
	}

}
