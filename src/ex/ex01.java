package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個數字:");
		int n = scn.nextInt();
		String str = new StringBuilder(fun(n)).reverse().toString();
		System.out.print("此數字的二進制為:"+str);

	}
	public static String fun(int n){
		int a = 0;
		String s = "";
		while(n > 0){
			a = n % 2;
			s = s + "" + a;
			n = n / 2;
		}
		return s;
	}

}
