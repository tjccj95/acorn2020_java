package test.main;

import test.mypac.MyObject;
import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] ar) {
		MyObject obj1=new MyObject();
		//.setNum(), .setName(), .useCar() 메소드를 호출해보세요
		
		//() 안에 명시한 값은 미리만든 지역변수의 값에 대입할 값이라고 생각하면된다.
		obj1.setNum(0);
		obj1.setName("name");
		obj1.useCar(new Car());
		obj1.useSome("name", new Car());
		
	}
}
