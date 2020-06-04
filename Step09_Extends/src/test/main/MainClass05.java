package test.main;

import test.mypac.Phone;
import test.mypac.HandPhone;
import test.mypac.SmartPhone;


public class MainClass05 {
	public static void main(String[] args)  {
		//SmartPhone 객체를 생성해소 Phone type 지역변수 p1이라는 지역변수에 담기
		Phone p1=new SmartPhone();
		//p1에 들어있는 참조값을 이용해서 전화를 걸고싶다면?
		p1.call();
		//p1에 들어있는 참조값을 이용해서 이동중에 전화를 걸고싶다면?
		//p1에 들어있는 참조값을 HandPhone type 지역변수에 casting해서 담는다.
		HandPhone p2 = (HandPhone)p1;
		//그러면 이동중에 전화를 걸수있다.
		p2.mobileCall();
		
		//p1에 들어있는 참조값을 이용해서 인터넷을 하고싶다면?
		//하위 클래스의 메서드들도 캐스팅을통해 사용가능
		SmartPhone p3=(SmartPhone)p1;
		//그러면 인터넷을 할수있다.
		p3.doInternet();
	}
}
