package thirteen.aug.task;

import java.util.Scanner;

public class ReverseOnPlace {
public static void main(String[] args) {
	System.out.println("String is::");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String res = "";
	String[] words = str.split(" ");
	for (int i = 0; i < words.length; i++) {
		String str2=words[i];
		String tem="";
		for (int j = str2.length()-1; j >=0; j--) {
			tem= tem + str2.charAt(j);
		}
		res = res + tem +" ";
	}
	System.out.print(res);
	sc.close();
}
}
