package test.main;

import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		// SmartPhone type의 지역변수 p1을 만들 준비만하고 만들어지지 않은 상태(지역변수x 객체x)
		SmartPhone p1;
		// SmartPhone type의 지역변수 p2를 만들고 비워둔 상태(지역변수o 객체x)
		SmartPhone p2=null;
		// SmartPhone type의 지역변수 p3를 만들고 참조값을 넣어둔 상태(지역변수o 객체o)
		SmartPhone p3=new SmartPhone();
		
		//p1은 아직 만들어지지 않았기 때문에 문법이 성립히지 않는다.
		//p1.call();
		
		//p2는 아무것도 들어있지 않기 때문에 문법은 성립하나 메서드를 작동할수는 없다.
		//실행시 NullPinterException이 발생
		p2.call();
		
		//p3에는 참조값이 들어있으므로 정상적으로 사용가능
		p3.call();
		
	}
}
