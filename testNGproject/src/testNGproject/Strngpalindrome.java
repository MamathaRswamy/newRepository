package testNGproject;

import java.util.Scanner;

public class Strngpalindrome {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//System.out.println("enter input");
	String str= s.next();
	System.out.println(isPalindrome("lkll"));	
}
public static String isPalindrome(String str) {
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	if(rev.equals(str)) {
		return str;
	}else {
	return null;
	}
}
}
