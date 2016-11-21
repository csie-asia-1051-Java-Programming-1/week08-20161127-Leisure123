package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入原先的進制為:");
		int ori = scn.nextInt();
		System.out.print("請輸入要轉換的數字:");
		int n = scn.nextInt();
		int sum = n % 10;
		int n1 = n /10;
		for(int i = ori ; n1 > 0 ; i*=i){
			sum = sum + ((n1 % 10)*i);
			n1 = n1 / 10 ; 	
		}
		System.out.print("請輸入要轉換成幾進制:");
		int a = scn.nextInt();
		String str = new StringBuilder(fun(sum , a)).reverse().toString();
		System.out.print("此數字的二進制為:"+str);
	}
	public static String fun(int s , int a){
		int b = 0;
		String str = "";
		while(s > 0){
			b = s % a;
			str = str + "" + b;
			s = s / a;
		}
		return str;
		
	}
	
}
