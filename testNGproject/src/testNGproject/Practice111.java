package testNGproject;

import java.util.Scanner;

public class Practice111 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		String[] input = new String[size];
		for(int i=0;i<input.length;i++) {
			System.out.println("enter the array elemnt");
			input[i]=s.next();		
		}
		String[] allCaps = initCap(input);
		for(String data : allCaps) {
			System.out.println(data);
		}
	}
	public static String[] initCap(String[] arr) {
		String[] sarr = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			String ele=arr[i];
			sarr[i]=ele.substring(0, 1).toUpperCase()+ele.substring(1).toLowerCase();
		}
		return sarr;
	}
}
