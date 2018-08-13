package thirteen.aug.task;

import java.util.Scanner;

public class WordCount {
public static void main(String[] args) {
	System.out.println("the String is ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] words = str.split(" ");
	System.out.println(words.length);
	sc.close();
}
}
