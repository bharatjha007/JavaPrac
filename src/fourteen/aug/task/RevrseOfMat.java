package fourteen.aug.task;

public class RevrseOfMat {
public static void main(String[] args) {
	int arr[][] = { { 1, 2, 3},
         	{ 4, 5, 6},
         	{ 7, 8, 9} };
 
 int reverse[][] = new int[3][3];
 int j=0;
 for (int i = 2; i>=0; i--,j++) {
		for (int k = 0; k <3; k++) {
			reverse[j][k]=arr[i][k];
		}
}
 for (int i = 0; i< 3; i++)
 {
    for (int j1 = 0; j1< 3; j1++) {
          System.out.print(reverse[i][j1]+"\t");
    }
    System.out.println();
 }
}
}
