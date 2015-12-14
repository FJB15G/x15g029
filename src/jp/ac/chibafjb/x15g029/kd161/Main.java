package jp.ac.chibafjb.x15g029.kd161;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int [] a = {10,20};
		int work = a[1];
		a[1] = a[0];
		a[0] = work;
		for(int i=0;i<a.length;i++){
			System.out.println("test["+i+"] = "+a[i]);
	}
	}
}
