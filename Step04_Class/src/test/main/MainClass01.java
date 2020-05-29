package test.main;

import test.mypac.Car;

public class MainClass01 {
	//run했을때 실행순서가 시작되는 특별한 main() 메소드
	public static void main(String[] ar) {
		//Car 클래스를 이용해서 객체 생성하고 참조값을 지역변수에 담기
		Car car1 = new Car();
		//Car 객체의 메소드 호출하기
		car1.drive();
		//Car 객체의 필드에 값 대입하기
		car1.name="소나타";
		
		//1. Car 클래스를 이용해서 객체를 생성하고 참조값을 car2 라는 이름의 지역변수에 담아보세요
		Car car2 = new Car();
		//2. 메소드를 호출해보세요.
		car2.drive();
		//3. name이라는 필드에 차 이름을 담아보세요.
		car2.name="아반떼";
	}
}
