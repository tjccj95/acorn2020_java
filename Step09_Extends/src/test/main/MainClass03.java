package test.main;

import test.mypac.*;
import java.io.*;

public class MainClass03 extends SmartPhone{
	public static void main(String[] args) throws IOException{
		//HandPhone 객체를 생성해서 HandPhone type 지역변수 p1에 담기
		HandPhone p1=new HandPhone();
		//인터넷을 해야하나. 즉 SmartPhone type 객체가 필요하다.
		//p1 안에 있는 값을 이용해서 인터넷을 할수있을까?
		SmartPhone p2=(SmartPhone)p1; //ClassCastException 발생. 부모클래스 객체에서 자식클래스의 기능을 캐스팅해서 사용한다?
		p2.doInternet();
		
	}
}
