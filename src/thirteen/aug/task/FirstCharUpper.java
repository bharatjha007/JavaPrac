package thirteen.aug.task;

import java.util.Scanner;


public class FirstCharUpper {
public static void main(String[] args) {
	System.out.println("String is ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	char[] ch = str.toCharArray();
	if(ch[0]!=' ')
	{
	ch[0]=Character.toUpperCase(ch[0]);
	}
	for (int i = 1; i < ch.length; i++) {
		if(ch[i]==' ')
		{
			ch[i+1]=Character.toUpperCase(ch[i+1]);
		}
	}
	System.out.print(ch);
	sc.close();
}
}
