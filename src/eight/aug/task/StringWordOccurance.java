package eight.aug.task;

import java.util.Scanner;

public class StringWordOccurance {
public static void main(String[] args) {
	System.out.println("the given string is ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	char[] ch = str.toCharArray();
	int count;
	for(int i=0;i<ch.length;i++)
	{
		count=0;
		for (int j = 0; j < ch.length; j++) {
			if(ch[i]==ch[j])
			{
				count++;
			}
		}
		System.out.println(ch[i]+":"+count);
	}
	sc.close();
}
}
