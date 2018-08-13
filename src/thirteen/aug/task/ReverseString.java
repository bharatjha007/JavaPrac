package thirteen.aug.task;

import java.util.Scanner;

public class ReverseString {
	 int i;
  public static void main(String[] args) {
System.out.println("Enter string to reverse:");
      
      Scanner read = new Scanner(System.in);
      String str = read.nextLine();
      String reverseword = "";
      ReverseString rs = new ReverseString();
	  rs.i=str.length()-1;
      rs.revrse(str,reverseword);
      
      read.close();
      
}
  public void revrse(String str,String s)
  {

      
      if(i>=0)
      {
    	  s = s + str.charAt(i);
    	  i--;
    	  revrse(str,s);
      }
      	
			System.out.println(s);
		
    	
  }  
}
