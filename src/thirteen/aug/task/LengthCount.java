package thirteen.aug.task;

import java.util.Scanner;

public class LengthCount {
public static void main(String[] args) {
	System.out.println("String in which we r goin to find the lenght ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int i=0;
	for (char ch : str.toCharArray()) {
		i++;
	}
	System.out.println(i);
}
}
