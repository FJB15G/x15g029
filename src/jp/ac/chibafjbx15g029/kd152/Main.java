package jp.ac.chibafjbx15g029.kd152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sin = new Scanner(System.in);
		float s1 = sin.nextFloat();
		sin.close();
		
		float  π = 3.14f ;
		
		float enshu;
		float menseki;
		enshu = 2 * π * s1 ;
		menseki = π * s1 * s1 ;
		
		System.out.println("半径r --> "+s1);
		System.out.println("円周 = "+enshu);
		System.out.println("面積 = "+menseki);
	}

}