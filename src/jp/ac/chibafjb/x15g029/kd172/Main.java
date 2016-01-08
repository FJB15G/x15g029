package jp.ac.chibafjb.x15g029.kd172;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int m = 3;
		int n = 2;
		
		int x [] = {1,2,3};
		int y [] = {7,8};
		int z [];
		z = new int[m+n];
		
		for(int i =0;i<m;i++){
			z[i] = x[i];
		}
		for(int i =0;i<n;i++){
			z[m+i] = y[i];
		}
		
		 System.out.print("{");
		for(int i =0;i<m+n;i++){
			System.out.print(z[i]+",");
		}
		 System.out.print("}");
		
	}
}