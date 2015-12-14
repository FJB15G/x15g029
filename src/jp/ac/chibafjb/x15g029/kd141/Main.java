package jp.ac.chibafjbx15g029.kd141;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sin =  new Scanner (System.in);
		String s  = sin.next();
		sin.close();
		
		int num = Integer.parseInt(s);
		
		System.out.println("整数を１つ入力してください。 -->"+s);
		System.out.println("あなたの入力した数は "+num+" です。");
	}

}
