package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。
 * 比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Number num = new Number();	
		System.out.print("請輸入4個數字:");
		int n = scn.nextInt();
		int a = 1000;
		if(n < 9999 && n > 0){
			for(int i = 0 ; i < 4 ; i++){
				num.number(n/a);
				n = n % a;
				a = a / 10;
				System.out.println();
			}
		}else{
			System.out.print("請輸入4個位數的數字!");
		}
	}
}
class Number{
	public void number(int n){
		switch(n){
		case 1:
			char data1[][] = {{' ',' ','*'},
						  	  {' ',' ','*'},
						  	  {' ',' ','*'},
						  	  {' ',' ','*'},
						  	  {' ',' ','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data1[i][j]);
				}
				System.out.println();
			}
			break;
		case 2:
			char data2[][] = {{'*','*','*'},
			  		  		  {' ',' ','*'},
			  		  		  {'*','*','*'},
			  		  		  {'*',' ',' '},
			  		  		  {'*','*','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data2[i][j]);
				}
				System.out.println();
			}
			break;
		case 3:
			char data3[][] = {{'*','*','*'},
	  		  		  		  {' ',' ','*'},
	  		  		  		  {'*','*','*'},
	  		  		  		  {' ',' ','*'},
	  		  		  		  {'*','*','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data3[i][j]);
				}
				System.out.println();
			}
			break;
		case 4:
			char data4[][] = {{'*',' ','*'},
	  		  		  		  {'*',' ','*'},
			  		  		  {'*','*','*'},
			  		  		  {' ',' ','*'},
			  		  		  {' ',' ','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data4[i][j]);
				}
				System.out.println();
			}
			break;
		case 5:
			char data5[][] = {{'*','*','*'},
			  		  		  {'*',' ',' '},
			  		  		  {'*','*','*'},
			  		  		  {' ',' ','*'},
			  		  		  {'*','*','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data5[i][j]);
				}
				System.out.println();
			}
			break;
		case 6:
			char data6[][] = {{'*','*','*'},
			  		  		  {'*',' ',' '},
			  		  		  {'*','*','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*','*','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data6[i][j]);
				}
				System.out.println();
			}
			break;
		case 7:
			char data7[][] = {{'*','*','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*',' ','*'},
			  		  		  {' ',' ','*'},
			  		  		  {' ',' ','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data7[i][j]);
				}
				System.out.println();
			}
			break;
		case 8:
			char data8[][] = {{'*','*','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*','*','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*','*','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data8[i][j]);
				}
				System.out.println();
			}
			break;
		case 9:
			char data9[][] = {{'*','*','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*','*','*'},
			  		  		  {' ',' ','*'},
			  		  		  {'*','*','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data9[i][j]);
				}
				System.out.println();
			}
			break;
		case 0:
			char data0[][] = {{'*','*','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*',' ','*'},
			  		  		  {'*','*','*'}};
			for(int i=0;i<5;i++){
				for(int j = 0;j<3;j++){
					System.out.print(data0[i][j]);
				}
				System.out.println();
			}
			break;
		}
		
	}
}
