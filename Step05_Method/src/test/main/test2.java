package test.main;
import java.io.*;
public class test2 {
	public static void main(String[] ar) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float a = 0;
		float b = 0;
		String c = null;
		System.out.print("첫번째수 = ");
		a = Float.parseFloat(in.readLine());
		System.out.print("두번재수 = ");
		b = Float.parseFloat(in.readLine());
		System.out.print("연산자(+,-,*,/,%) = ");
		c = in.readLine();
		if(c=="+") {
			System.out.println(a + "+" + b +"="+ (a+b));
		}else if(c=="-") {
			System.out.println(a + "-" + b + "=" + (a-b));
		}else if(c=="*") {
			System.out.println(a + "*" + b + "=" + (a*b));
		}else if(c=="/") {
			System.out.println(a + "/" + b + "=" + (a/b));
		}else if(c=="%") {
			System.out.println(a + "%" + b + "=" + (a%b));
		}
		System.out.print("계속하시겠습니까? y/n");
		
	}
}
