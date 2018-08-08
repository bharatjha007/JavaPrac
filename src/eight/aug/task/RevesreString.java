package eight.aug.task;

import java.util.Scanner;

public class RevesreString {
	public static void main(String[] args) {
		System.out.println("the string we want to reverse");
		int i=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		char m[ch.length];
		while(i<ch.length) 
		{
			for (int j = ch.length-1; j>=0; j--) {
				m[i++]=ch[j];
			}
		}
		System.out.println(ch);
		sc.close();
	}
}
