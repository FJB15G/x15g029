package jp.ac.chibafjb.x15g029.kd173;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int k = 3;
		int data [] = new int [k+1];
		Scanner sin = new Scanner(System.in);
		String s1 = sin.next();
		String s2 = sin.next();
		String s3 = sin.next();
		
		int a1 = Integer.parseInt(s1);
		int a2 = Integer.parseInt(s2);
		int a3 = Integer.parseInt(s3);
		
		data [0] = a1;
		data [1] = a2;
		data [2] = a3;
		data [k] = 0;
		
		
	
		for(int i=k;i>0;i--){
			data[i] = data[i-1];
		}
		for(int i=0;i<k+1;i++){
			
		System.out.println("data["+i+"] = " +data[i]);
	}
	}

}
