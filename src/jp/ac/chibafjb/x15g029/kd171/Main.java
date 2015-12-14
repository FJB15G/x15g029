package jp.ac.chibafjbx15g029.kd171;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int k = 3;
		int data [] = new int [k+1];
		data [0] = 100;
		data [1] = 200;
		data [2] = 300;
		data [k] = 0;
		
		
	
		for(int i=k;i>0;i--){
			data[i] = data[i-1];
		}
		for(int i=0;i<k+1;i++){
			
		System.out.println("data["+i+"] = " +data[i]);
	}
	
	
}
	}