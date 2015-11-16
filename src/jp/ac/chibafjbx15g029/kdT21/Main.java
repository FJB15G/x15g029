package jp.ac.chibafjbx15g029.kdT21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
		Scanner sin = new Scanner(System.in);
		int s1 = sin.nextInt();
		int s2 = sin.nextInt();
		sin.close();
		
		int hanko = 100;
		int hurako = 180;
		
		int handai = hanko * s1;
		int huradai = hurako * s2;
		
		int shokei = handai + huradai;
		
		double zei = Math.floor((shokei * 0.08*100.00)/100.000);
		double gokei = shokei + zei;
		
	
		System.out.println("ハンバーガーの個数 ->"+s1);
		System.out.println("フライドポテトの個数-->"+s2);
		System.out.println("");
		System.out.println("ハンバーガーの代金 = "+handai+"円");
		System.out.println("フライドポテトの代金 = "+huradai+"円");
		System.out.println("小計 = "+shokei+"円");
		System.out.println("");
		System.out.println("消費税 = "+zei+"円");
		System.out.println("合計金額 = "+gokei+"円");
		//System.out.println("");
		Scanner sin2 = new Scanner(System.in);
		double s3 =sin2.nextInt();
		sin2.close();
		
	    double turi = s3 - gokei;
		System.out.println("受取金額 -->"+s3);
		System.out.println("つり銭 = "+turi+"円");
		
		
	}

}
