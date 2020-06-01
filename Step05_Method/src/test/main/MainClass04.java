package test.main;

import test.mypac.MyObject;
import test.mypac.Car;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass04 {
	public static void main(String[] args) {
		MyObject obj1 = new MyObject();
		//useSome() 메소드를 호출해보세요.
		obj1.useSome("name", new Car());
		
		//doSome() 메소드를 호출해보세요
		obj1.doSome(new Radio(),new Speaker());
	}
}
