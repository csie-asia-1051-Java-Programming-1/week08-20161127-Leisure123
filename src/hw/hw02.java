package hw;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("原先為幾進制:");
		int ori = scn.nextInt();
		System.out.print("請輸入要轉換的數字:");
		int n = scn.nextInt();
		int b = 1;
		int sum = decimal(ori,n,b);
		System.out.print("請輸入要轉換成幾進制:");
		int a = scn.nextInt();
		String str = new StringBuilder(fun(sum,a)).reverse().toString();
		System.out.println("轉換後的數字為:" + str);

	}
	public static int decimal(int o , int n , int b){
		int sum = 0;
		if(n == 0){
			return 0;
		}else{
			sum = (n % 10) * b;
			return sum + decimal(o , n / 10 , b * o);
		}
	}
	public static String fun(int n , int a){
		int sum = 0;
		if(n == 0){
			return "";
		}else{
			sum = n % a;
			return sum + "" + fun(n / a , a);
		}
	}

}
