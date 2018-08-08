package seven.aug.task;

public class Sixth {
public static void main(String[] args) {
	String s1="JAVA";
	char[] ch = s1.toCharArray();
	for (int i = 0; i <ch.length; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print(ch[j]);
		}
		System.out.println();
	}
}
}
