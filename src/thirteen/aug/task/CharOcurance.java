package thirteen.aug.task;

import java.util.Scanner;

public class CharOcurance {
public static void main(String[] args) {
	System.out.println("The string is :: ");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	char[] ch = str.toCharArray();
	int count;
	for (int i = 0; i < ch.length; i++) {
		count=1;
		for (int j = i+1; j < ch.length; j++) {
			if(ch[i]==ch[j])
			{
				count++;
				ch[j]=0;
			}
		}
		if(ch[i]!=0)
		{
			System.out.println(ch[i]+":"+count);
		}
	}
	sc.close();
}
}
