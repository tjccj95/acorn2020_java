package test.main;

import test.mypac.Box;
import test.mypac.Member;
import test.mypac.Rect;
import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] ar) {
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//new Box().
		System.out.println("메인메소드가 시작되었습니다.");
		Member a=Box.mem; //null
		Rect b=Box.rect;//null
		Car c=Box.car;//참조값이 들어있다.
		c.drive();//메소드 호출가능!
		
		//아래와 같이 사용할수도 있다.
		Box.car.drive();
		
		//a.showInfo(); //a가 null 이므로 NullPointerException 발생
		//b.getArea(); //b가 null 이므로 NullPointerException 발생
		
		
		//System 클래스에 있는 out이라는 필드의 printstream 객체의 println기능을 참조
		// public class System{
		// 	public static Printstream out = new ....;}
		System.out.println();
		
		
	}
}
