package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import java.io.*;

public class MainClass01 extends HandPhone{//extends Object는 생략 가능
	public static void main(String[] ar) {
		//Phone 클래스로 객체 생성해서 참조값을 지역 변수에 담기
		Phone p1 =new Phone();
		Object p2=new Phone();
		p1.call();
		
		//HandPhone 클래스로 객체 생성해서 참조값을 지역 변수에 담기
		HandPhone p3=new HandPhone();
		Phone p4=new HandPhone();
		Object p5=new HandPhone();
		
		int i = 10;
		short c = (byte)i;
		
		HandPhone p8= (HandPhone)p5;
		// 상위 데이터 타입중 하나로 지역변수를 만들수는 있으나 그경우 하위 메서드 사용할수없다. 
		// 그 이유는 유동적으로 데이터타입을 사용하기 위해
		// 이미 만들어진 객체의 참조값을 다른 type으로 받아보기
		// 상위 데이터타입을 가진 지역변수에 캐스팅을 통해서 담을수도 있다.
		Phone p6=p3;
		Object p7=p3;
		
		
		//String str=p3; //오류!
		//오버라이드 : 상속받은기능 재정의하고 덮어쓰기
	}
} 
class restart extends MainClass01{
	public static void main(String[] ar) {
		Phone p6=new HandPhone();
	}
}