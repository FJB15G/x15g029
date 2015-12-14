package jp.ac.chibafjb.x15g029.kd151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sin = new Scanner(System.in);
		float s1 = sin.nextFloat();
		float s2 = sin.nextFloat();
		sin.close();
		
		float kasan;
		float gensan;
		float zyousan;
		float zyosan;
		
		kasan =s1 + s2;
		gensan = s1 - s2;
		zyousan = s1 * s2;
		zyosan = s1 / s2;
		
		
		System.out.println("aの入力 -->"+s1);
		System.out.println("bの入力 -->"+s2);
		
		System.out.println(s1+" + "+ s2+"="+ Math.ceil( kasan*100000.0)/100000.0f);
		System.out.println(s1+" - "+ s2+"="+Math.ceil(gensan*1000000.00)/1000000.00);//切り捨て
		System.out.println(s1+" * "+ s2+"="+Math.floor(zyousan*1000000.0)/1000000.0f);//切り捨て
		System.out.println(s1+" / "+ s2+"="+Math.ceil(zyosan*1000000)/1000000.0); //切り捨て
		
		
	}

}
