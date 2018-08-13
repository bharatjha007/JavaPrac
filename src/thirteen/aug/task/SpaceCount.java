package thirteen.aug.task;

import java.util.Scanner;

public class SpaceCount {
public static void main(String[] args) {
	System.out.println("String is ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int count=0;
	for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==' ')
		{
			count++;
		}
	}
	System.out.println("total no. of space in string is::"+count);
	sc.close();
}
}
