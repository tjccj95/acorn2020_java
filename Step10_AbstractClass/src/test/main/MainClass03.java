package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Tiger;
import test.mypac.Zoo.Monkey;

public class MainClass03 {
	public static void main(String[] args) {
		// Zoo 클래스에 있는 getMonkey() 메소드를 호출
		//Monkey m1 = new Monkey();
		Zoo m1 = new Zoo();
		//inner class type Monkey
		Monkey m2=m1.getMonkey();
		//메소드 호출
		m2.say();
		//Zoo 클래스에 있는 getTiger() 메소드를 호출해서
		//리턴되는 값을 t1이라는 지역 변수에 담아보세요
		Tiger t1 = m1.getTiger();
		//메소드 호출
		t1.say();
		
	}
}
