package thirteen.aug.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateWord {
public static void main(String[] args) {
	List<String> li = new ArrayList<>();
	li.add("I");
	li.add("Love");
	li.add("Java");
	String str1 = li.toString();
	for (int i = 0; i < str1.length(); i++) {
		if(str1.charAt(i)!='['&&str1.charAt(i)!=']'&&str1.charAt(i)!=',')
		{
			System.out.print(str1.charAt(i));
		}
	}
	System.out.println();
	Collections.rotate(li, 1);
	String str2 = li.toString();
	for (int i = 0; i <str2.length(); i++) {
		if(str2.charAt(i)!='['&&str2.charAt(i)!=']'&&str2.charAt(i)!=',')
		{
			System.out.print(str2.charAt(i));
		}
	}
	
	}
}
