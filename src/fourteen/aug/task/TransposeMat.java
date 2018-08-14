package fourteen.aug.task;


public class TransposeMat {
public static void main(String[] args) {
	int arr[][] = { { 1, 2, 3},
         	{ 4, 5, 6},
         	{ 7, 8, 9} };
 int transpose[][] = new int[3][3];
 for (int i = 0; i <3; i++)
 {
     for (int j = 0; j <3; j++) {
    	 transpose[j][i]=arr[i][j];
     }
 }
 for (int i = 0; i< 3; i++)
 {
    for (int j1 = 0; j1< 3; j1++)
    {
          System.out.print(transpose[i][j1]+"\t");
    }
    System.out.println();
 }
}
}
