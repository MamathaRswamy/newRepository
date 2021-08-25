package collections;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListPractice {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList arr=new ArrayList();
		arr.add(0,1);
		arr.add(1,2);
		int h = arr.size();
		System.out.println(h);
		arr.add(2,null);
		arr.add(3,4);
		
		//arr.add(5,3);

		int j = arr.size();
		System.out.println(j);
//		arr.add("helo");
//		arr.add('a');
//		arr.add(true);
//		arr.g
//		int h = arr.size();
	//	System.out.println(h);*/
		/*@SuppressWarnings("rawtypes")
		ArrayList arrayy=new ArrayList();
		arrayy.add(3);
		arrayy.add("abc");
		arrayy.add("hiii");
		arrayy.add("efgh");
		System.out.println(arrayy);
		*/
		//System.out.println(arr);
		

	}

}