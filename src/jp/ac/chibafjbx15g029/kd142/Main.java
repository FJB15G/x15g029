package jp.ac.chibafjbx15g029.kd142;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sin = new Scanner (System.in);
		
		String s1 = sin.next();
		String s2 = sin.next();
		sin.close();
	
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
		System.out.println("整数aの入力 -->"+s1);
		System.out.println("整数bの入力 -->"+s2);
		
		System.out.println();
		
		System.out.println(a +"+"+ b+ "="+(a+b));
		System.out.println(a +"-"+ b+ "="+(a-b));
		System.out.println(a +"*"+ b+ "="+(a*b));
		System.out.println(a +"/"+ b+ "="+(a/b));
	}

}
