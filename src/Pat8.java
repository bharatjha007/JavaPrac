
public class Pat8 {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j =i; j <5; j++) {
			System.out.print(" ");
		}
		for (int j =1 ; j <=i*2-1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = 1; i <=4; i++) {
		for (int j =1; j<=i; j++) {
			System.out.print(" ");
		}
		for(int j=i;j<=8-i;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
