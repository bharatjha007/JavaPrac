package eight.aug.task;

import java.util.Scanner;

public class ArrayEqualOrNot {
	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s1.nextInt();
        int b[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            b[i] = s1.nextInt();
        }
        boolean flag=true;
        for (int i = 0; i < n; i++) {
			if(a[i]-b[i]==0)
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
        if (flag) {
			System.out.println("Both array is equal");
		}
        else
        {
        	System.out.println("both array are different");
        }
        s.close();
        s1.close();
	}
}
