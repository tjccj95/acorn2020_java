package test.main;

import test.human.Blood;
import test.human.Men;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적 : 아래의 useMen() 메소드를 호출하는것
		 * 아래의 useMen() 메소드를  호출해보세요
		 */
		//MainClass13.useMen(new Men(new Blood("+","O")));
		//Men객체의 참조값은 m1 지역변수에 담겨있다
		//Blood객체의 참조값은 blood 필드에 담겨있다.
		//"+"는 rh 필드에 담겨있다.
		//m1에 있던 값을 useMen의 m에 키값을 전달
		//Men 객체를 생성해서 참조값을 m1이라는 지역변수에 담기
		Men m1=new Men(new Blood("+","O"));//총 4개의 객체 생성(String객체 두개 포함)
		//useMen() 메소드 호출하면서 Men 객체의 참조값 전달하기
		MainClass13.useMen(m1);//m1 = Men m 이런 개념으로 보면됨
	}
	public static void useMen(Men m) {
		m.walk();
		m.study();
		m.seeMovie();
	}
}
