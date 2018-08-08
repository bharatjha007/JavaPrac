package eight.aug.task;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int result = 0;
	System.out.println("The given no. is ::");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int number = a;
    while(number!=0)
    {
    	int count=0;
    	int num=a;
		do {
			 num=num/10;
			 count++;
		} while (num>0);
    	int rem = number%10;
    	
    	result= result+ (int)Math.pow(rem, count);
    	number=number/10;
    }
    if (result==a) {
		System.out.println("number is armstrong");
	}
    else
    {
    	System.out.println("Not Armstrong");
    }
    sc.close();
	}
}
