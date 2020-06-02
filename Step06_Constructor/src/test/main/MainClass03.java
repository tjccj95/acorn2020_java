package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass03 {
	public static void main(String[] ar) {
		//Computer 객체를 생성해서 참조값을 c1이라는 이름의 지역변수에 담아보세요

		Computer c1 = new Computer(new Cpu());
		//c1에 들어있는 참조값을 이용해서 .doGame() 메소드를 호출해보세요.
		c1.doGame();
		
		Computer c2=new Computer(null);
		c2.doGame();
	}
}
