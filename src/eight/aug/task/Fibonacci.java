package eight.aug.task;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		 
			 int n1=0;
			 int n2=1;
			 int n3;
			 System.out.println("This series upto this count ::");
		        Scanner sc = new Scanner(System.in);
		        int count = sc.nextInt();    
			 System.out.print(n1+" "+n2);   
			    
			 for(int i=1;i<count;i++) 
			 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
			 }    
			 sc.close();
	}
}
