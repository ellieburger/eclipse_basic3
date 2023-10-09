package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic {

	public static void main(String[] args) throws IOException {
		
		//p9
		System.out.print("歡迎使用Java!");
		System.out.print("開始使用Java吧!");
		
		//p10
		System.out.println("歡迎使用Java!");
		System.out.println("開始使用Java吧!");
		
		//p16
		System.out.println('A');
		System.out.println("歡迎使用Java!");
		System.out.println(123);
		
		//p18-1
		System.out.println("顯示出反斜線:\\");
		System.out.println("顯示出單引號\'");
		
		//p18-2
		System.out.println("八進位數101的字元是\101");
		System.out.println("十六進位數0061的字元是\u0061");
		
		//p25
		int num;
		num=3;
		System.out.println("變數num的值是"+num);
		
		//p26
		int num1=3;
		System.out.println("變數num的值是"+num1);
		num1=5;
		System.out.println("更新變數num的值");
		System.out.println("變數num更新後的值是"+num1);
		
		//p27
		int num2, num3;
		num2=3;
		System.out.println("變數num1的值是:"+num2);
		num3=num2;
		System.out.println("將變數num1指定到變數num2之中");
		System.out.println("變數num2的值是:"+num3);
		
		//p28
		System.out.println("請輸入一個整數");
		BufferedReader br1 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br1.readLine();
		int num4=Integer.parseInt(str1);
		System.out.println("您輸入的數字是"+num4);
		System.out.println("請輸入字串");
		BufferedReader br2 = 
				new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		System.out.println("剛剛輸入的字串是:"+str2);
		
		//p31
		System.out.println("1+2等於"+(1+2));
		System.out.println("3*4等於"+(3*4));
		int num5=2;
		int num6=3;
		int sum=num5+num6;
		System.out.println("變數num1的值是"+num5);
		System.out.println("變數num2的值是"+num6);
		System.out.println("num1+num2的值是"+sum);
		num5=num5+1;
		System.out.println("變數num1的值加1之後是"+num5);
		
		//p34
		int num7=10;
		int num8=5;
		System.out.println("num1和num2的各種運算:");
		System.out.println("num1+num2等於"+(num7+num8));
		System.out.println("num1-num2等於"+(num7-num8));
		System.out.println("num1*num2等於"+(num7*num8));
		System.out.println("num1/num2等於"+(num7/num8));
		System.out.println("num1%num2等於"+(num7%num8));
		int a=0;
		int b=0;
		int c=0;
		b=a++;
		c=++a;
		System.out.println("因為是在指定值之後才遞增,所以b的值為"+b);
		System.out.println("因為是在遞增之後才指定值,所以c的值為"+c);
		
		//p38
		double dnum=160.5;
		System.out.println("身高是"+dnum+"公分");
		System.out.println("指定給int型態的變數");
		int inum=(int)dnum;
		System.out.println("身高是"+inum+"公分");
		
		//p39
		int d =2;
		double pi=3.14;
		System.out.println("直徑是"+d+"公分的圓");
		System.out.println("其圓周為"+(d*pi)+"公分");
		int num9=5;
		int num10=4;
		double div1=num9/num10;
		double div2=(double)num9/(double)num10;
		System.out.println("5/4等於"+div1);
		System.out.println("5/4等於"+div2);
	}

}
