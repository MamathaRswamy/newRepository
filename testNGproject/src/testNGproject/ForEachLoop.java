package testNGproject;

public class ForEachLoop {
	public static void main(String[] args) {
		int[][] a= {{1,2},
					{3,4}};
		for(int[] x:a){
			for(int y:x) {
			System.out.print(y);
		}
	}}

}