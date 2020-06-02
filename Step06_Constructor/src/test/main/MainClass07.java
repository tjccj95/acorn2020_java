package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass07 {
	public static void main(String[] ar) {
		Computer com1 = new Computer();
		Computer com2 = new Computer(new Cpu());
		
		com1.doGame();//동작불가
		com2.doGame();//동작가능
	}
}
