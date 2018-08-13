package eight.aug.task;

import java.util.Scanner;

public class SecondLargest {
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
    for (int i = 0; i <n; i++) {
		for (int j = i+1; j < n; j++) {
			if(a[i]>a[j])
			{
			int m = a[j];
			a[j]=a[i];
			a[i]=m;
		}
	}
}
    System.out.println("the nth largest number of an array ::");
    int n1=s.nextInt();
    for (int i = 0; i < n; i++) {
    	if(i==n1)
    	{
    	System.out.println("the "+n1+"nd largest number in array is ::"+a[n-n1]);
    	}
	}
	
	s.close();
}}
