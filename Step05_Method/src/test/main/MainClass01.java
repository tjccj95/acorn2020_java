package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] ar) {
		//MyObject 클래스에 정의된 3개의 메소드를 차례로 호출하는 code를 작성해보세요
		MyObject obj = new MyObject();
		obj.walk();
		obj.getNumber();
		obj.getGreeting();
	}
}
