package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] ar) {
		//Car 클래스로 객체를 생성해서 참조값을 c1이라는 이름의 변수에 담아보세요
		Car c1 = new Car("고양이버스");
		Car c2 = new Car("프라이드");
		//c1에 담겨있는 참조값을 이용해서 .drive() 메소드를 호출해보세요
		c1.drive();
		c2.drive();
	}
}
