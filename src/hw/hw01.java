package hw;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個數字:");
		int n = scn.nextInt();
		String str = new StringBuilder(fun(n)).reverse().toString();
		System.out.println("此數字的二進制為:"+str);

	}
	public static String fun(int n){
		int a = 0;
		if(n == 0){
			return "";
		}else{
			a = n % 2;
			return a+""+fun(n/2);
		}
	}

}
