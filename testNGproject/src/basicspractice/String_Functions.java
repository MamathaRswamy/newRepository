package basicspractice;

public class String_Functions {
public static void main(String[] args) {
	String s="helllo pooja";
	String upperCase=s.toUpperCase();
	System.out.println(upperCase);
	String lowerCase=s.toLowerCase();
	System.out.println(lowerCase);
	String substringWithStartIndex=s.substring(2);
	System.out.println(substringWithStartIndex);
	String substringWithBothStartAndEndIndex=s.substring(2, 6);
	System.out.println(substringWithBothStartAndEndIndex);
	char charAtd= s.charAt(3);
	System.out.println(charAtd);
	boolean containsMethod= s.contains("llo");
	System.out.println(containsMethod);
	char[] charArrayy= s.toCharArray();
	System.out.println(charArrayy);
	
}
}
