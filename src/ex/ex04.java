package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 
加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021011 丁紹剛
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Compute com = new Compute();
		System.out.print("請輸入運算符號:");
		char sign = scn.next().charAt(0);
		if(sign == '+'||sign == '-'||sign == '*'||sign == '/'){
			System.out.print("請輸入兩個數字:");
			float n = scn.nextInt();
			float m = scn.nextInt();
		System.out.println(com.compute(n, m, sign));
		}else if(sign == '²'||sign == '³'||sign == '√'){
			System.out.print("請輸入一個數字:");
			float n = scn.nextInt();
			System.out.println(com.advanced(n, sign));
		}else{
			System.out.println("運算符號不符合");
		}
	}
}
class Compute{
	public float compute(float n , float m , char sign){
		float sum = 0f;
		switch(sign){
		case'+':
			sum=n+m;
			break;
		case'-':
			sum=n-m;
			break;
		case'*':
			sum=n*m;
			break;
		case'/':
			sum=n/m;
			break;
		}
		return sum;
	}
	public float advanced(float n , char sign){
		float sum = 0f;
		switch(sign){
		case'²':  //平方符號:`U00B2(用新注音打)
			sum=n*n;
			break;
		case'³':  //立方符號:`U00B3(用新注音打)
			sum=n*n*n;
			break;
		case'√':  //這個符號只能複製!
			sum=(float) Math.sqrt(n);
			break;
		}
		return sum;
	}
}