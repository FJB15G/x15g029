package jp.ac.chibafjb.x15g029.kd211;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
	    int [] num  = {1,2,3,6,5,6,7,8,54,10,55,34,12,65,123,333,2,3,1,2,3,41,3};
	    int a = num.length; //長さ
	
	  
	  System.out.println("配列num[]の最大値は、"+ArrayProc.maxFind1(num,a)+"です。");//メソッド呼び出し
	  System.out.println(ArrayProc.maxFind2(num,a));
	  
 }
}

