package test.main;

import test.mypac.MyObject;
import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] ar) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code를 작성해보세요
		MyObject obj = new MyObject();
		obj.walk();
		obj.getNumber();
		obj.getGreeting();
		
		//메소드가 리턴해주는 데이터를 지역 변수에 담아보기
		int a = obj.getNumber();
		String b = obj.getGreeting();
		
		Car obj2 = new Car();
		
	}
}
