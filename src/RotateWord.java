import java.util.Scanner;

public class RotateWord {
public static void main(String[] args) {
	System.out.println("the string is ::");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	char[] ch = str.toCharArray();
	for (int k = 0; k < ch.length; k++) {
		char c = ch[0];
		for (int j =0; j < ch.length-1; j++) {
			ch[j]=ch[j+1];
		}
		ch[ch.length-1]=c;
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
	}
	sc.close();
}
}
