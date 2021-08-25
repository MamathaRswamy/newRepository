package testNGproject;

import java.util.Scanner;

public class helloworld {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int sc=s.nextInt();
	int[] arr=new int[sc];
	for(int i=0;i<arr.length;i++) {
		System.out.println("enter the array elemnt");
		arr[i]=s.nextInt();
	}
	for(int j=0;j<arr.length;j++)
	{
		System.out.println("elemts are  "+arr[j]);
	}
	
}
}
